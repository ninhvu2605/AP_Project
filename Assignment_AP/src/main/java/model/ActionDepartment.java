package model;

import entity.Department;
import java.util.ArrayList;
import java.util.Scanner;

public class ActionDepartment implements Action {
    Scanner cmd = new Scanner(System.in);

    ArrayList<Department> listDp = new ArrayList<Department>();

    public ArrayList<Department> getListDp() {
        return listDp;
    }

    public void setListDp(ArrayList<Department> listDp) {
        this.listDp = listDp;
    }

    @Override
    public Department add() {
        Department dp = null;
        System.out.println("Enter Department ID: ");
        String id;
        int res;
        do {
            id = cmd.nextLine();
            res = checkID(id);
            if(res>=0) {
                System.out.println("ID already exist");
            }
        } while (res>=0);
        
        System.out.println("Enter Department Name: ");
        String name = cmd.nextLine();
        
        System.out.println("Enter Department Address: ");
        String address = cmd.nextLine();
        
        dp = new Department(id, name, address);
        return dp;
    }

    @Override
    public boolean edit(String id) {
        int res = checkID(id);
        if(res < 0) {
            System.out.println("ID doesn't exist");
            return false;
        } else {
            System.out.println("Current Name: " + listDp.get(res).getDeptName());
            System.out.println("Enter New Name: ");
            System.out.println("Press Enter to skip");
            String name = cmd.nextLine();
            if(!name.equals("")) {
                listDp.get(res).setDeptName(name);
            }
            System.out.println("Current Address: " + listDp.get(res).getDeptAddress());
            System.out.println("Enter New Address: ");
            System.out.println("Press Enter to skip");
            String address = cmd.nextLine();
            if(!address.equals("")) {
                listDp.get(res).setDeptAddress(address);
            }
            return true;
        }
    }

    @Override
    public boolean delete(String id) {
        int res = checkID(id);
        if(res < 0) {
            System.out.println("ID doesn't exist");
            return false;
        } else {
            search(id);
            System.out.println("Are you sure you want to delete Department: " + listDp.get(res).getDeptName());
            String choice = cmd.nextLine();
            if(choice.equals("Y")||choice.equals("y")) {
                listDp.remove(checkID(id));
                return true;
            } else if(choice.equals("N")||choice.equals("n")) {
                System.out.println("Cancelled Delete");
                return false;
            } else {
                System.out.println("Invalid input");
                return false;
            }
        }
    }

    @Override
    public void search(String id) {
        System.out.println("Department information: ");
        System.out.println("ID\t\tName\t\tAddress");
        Department dp = listDp.get(checkID(id));
        System.out.println(dp.getDeptID()+"\t\t"+dp.getDeptName()+"\t\t"+dp.getDeptAddress());
    }

    @Override
    public void display() {
        System.out.println("-----Department List-----");
        System.out.println("ID\t\tName\t\tAddress");
        for(int i = 0; i < listDp.size(); i++) {
            Department dp = listDp.get(i);
            System.out.println(dp.getDeptID()+"\t\t"+dp.getDeptName()+"\t\t"+dp.getDeptAddress());
        }
    }

    @Override
    public int checkID(String id) {
        for(int i = 0; i < listDp.size(); i++) {
            if(listDp.get(i).getDeptID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}