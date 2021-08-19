package entity;

public class Department {

	private String deptID;
	private String deptName;
	private String deptAddress;

        public Department(String deptID, String deptName, String deptAddress) {
            this.deptID = deptID;
            this.deptName = deptName;
            this.deptAddress = deptAddress;
        }

        public Department() {
        }
        
	public String getDeptID() {
		return this.deptID;
	}

	/**
	 * 
	 * @param deptID
	 */
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return this.deptName;
	}

	/**
	 * 
	 * @param deptName
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAddress() {
		return this.deptAddress;
	}

	/**
	 * 
	 * @param deptAddress
	 */
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

}