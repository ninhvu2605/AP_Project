/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Department;
import model.ActionSalary;
import model.ActionQualification;
import model.ActionEmployee;
import model.ActionDepartment;
import java.util.Scanner;



/**
 *
 * @author lamsu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cmd = new Scanner(System.in);
        while(true) {
            System.out.println("Human Resource Management System");
            System.out.println("=======================\n" +
                                "1. Manage Department\n" +
                                "2. Manage Employee\n" +
                                "3. Manage Qualification\n" +
                                "4. Manage Salary\n" +
                                "5. Exit\n" +
                                "=======================\n" +
                                "Please choose:");
            int input = cmd.nextInt();
            switch(input) {
                case 1:
                    ActionDepartment ad = new ActionDepartment();
                    while(true) {
                        System.out.println("=======================\n" +
                                           "1. Add Department\n" +
                                           "2. Edit Department\n" +
                                           "3. Delete Department\n" +
                                           "4. Search Department\n" +
                                           "5. Display Department\n" +
                                           "6. Exit\n" +
                                           "=======================\n" +
                                           "Please choose:");
                        int dept = cmd.nextInt();
                        switch(dept) {
                            case 1:                                             //Add Department
                            {
                                System.out.println("-----Add Department-----");
                                Department dp = ad.add();                       //Gọi hàm add
                                ad.getListDp().add(dp);
                                System.out.println("Add successful");
                                break;
                            }
                            case 2:                                             //Edit Department
                            {
                                System.out.println("-----Update Department-----");
                                System.out.println("Enter Department ID: ");
                                String id = cmd.nextLine();
                                cmd.nextLine();
                                boolean res = ad.edit(id);
                                if(res==false) {
                                    System.out.println("Update Unsuccessful");
                                } else {
                                    System.out.println("Update Successful");
                                }
                                break;
                            }
                            case 3:                                             //Delete Department
                            {
                                System.out.println("-----Delete Department-----");
                                System.out.println("Enter Department ID: ");
                                String id = cmd.nextLine();
                                cmd.nextLine();
                                boolean res = ad.delete(id);
                                if(res == false) {
                                    System.out.println("Delete Unsuccessful");
                                } else {
                                    System.out.println("Delete Successful");
                                }
                            }
                            case 4:                                             //Search Department
                            {
                                System.out.println("-----Search Department-----");
                                System.out.println("Enter Department ID: ");
                                String id = cmd.nextLine();
                                int res = ad.checkID(id);
                                if(res < 0) {
                                    System.out.println("ID doesn't exist");
                                } else {
                                    ad.search(id);
                                }
                                break;
                            }
                            case 5:                                             //Display Department
                            {
                                ad.display();
                                break;
                            }
                            case 6:
                            {
                                System.exit(0);
                                break;
                            }
                            default:
                            {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                    }
                case 2:                                                         //Employee Management
                    while(true) {
                        
                    }
                case 3:                                                         //Qualification Management
                    while(true) {
                        
                    }
                case 4:                                                         //Salary Management
                    while(true) {
                        
                    }
                case 5:                                                         //Exit
                    System.exit(0);
                    break;
                default:                                                        //Invalid Input
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
    
}
