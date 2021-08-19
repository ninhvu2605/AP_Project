package model;

public interface Action {

	Object add();

	boolean edit(String id);

	boolean delete(String id);

	void search(String id);

	void display();

	int checkID(String id);

}