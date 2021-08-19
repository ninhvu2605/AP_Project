package entity;

public class Employee {

	private String emID;
	private String emName;
	private String emEmail;
	private String emPhone;
	private String emDoB;
	private Department dp;
	private Qualification qa;
	private Salary sl;

	public String getEmID() {
		return this.emID;
	}

	/**
	 * 
	 * @param emID
	 */
	public void setEmID(String emID) {
		this.emID = emID;
	}

	public String getEmName() {
		return this.emName;
	}

	/**
	 * 
	 * @param emName
	 */
	public void setEmName(String emName) {
		this.emName = emName;
	}

	public String getEmEmail() {
		return this.emEmail;
	}

	/**
	 * 
	 * @param emEmail
	 */
	public void setEmEmail(String emEmail) {
		this.emEmail = emEmail;
	}

	public String getEmPhone() {
		return this.emPhone;
	}

	/**
	 * 
	 * @param emPhone
	 */
	public void setEmPhone(String emPhone) {
		this.emPhone = emPhone;
	}

	public String getEmDoB() {
		return this.emDoB;
	}

	/**
	 * 
	 * @param emDoB
	 */
	public void setEmDoB(String emDoB) {
		this.emDoB = emDoB;
	}

}