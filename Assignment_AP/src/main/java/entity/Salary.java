package entity;

public class Salary {

	private String slID;
	private String slName;
	private String slDescription;
	private int slBasic;
	private int slBonus;
	private int slPenalty;
	private int slTotal;

	public String getSlID() {
		return this.slID;
	}

	/**
	 * 
	 * @param slID
	 */
	public void setSlID(String slID) {
		this.slID = slID;
	}

	public String getSlName() {
		return this.slName;
	}

	/**
	 * 
	 * @param slName
	 */
	public void setSlName(String slName) {
		this.slName = slName;
	}

	public String getSlDescription() {
		return this.slDescription;
	}

	/**
	 * 
	 * @param slDescription
	 */
	public void setSlDescription(String slDescription) {
		this.slDescription = slDescription;
	}

	public int getSlBasic() {
		return this.slBasic;
	}

	/**
	 * 
	 * @param slBasic
	 */
	public void setSlBasic(int slBasic) {
		this.slBasic = slBasic;
	}

	public int getSlBonus() {
		return this.slBonus;
	}

	/**
	 * 
	 * @param slBonus
	 */
	public void setSlBonus(int slBonus) {
		this.slBonus = slBonus;
	}

	public int getSlPenalty() {
		return this.slPenalty;
	}

	/**
	 * 
	 * @param slPenalty
	 */
	public void setSlPenalty(int slPenalty) {
		this.slPenalty = slPenalty;
	}

	public int getSlTotal() {
		return this.slTotal;
	}

	/**
	 * 
	 * @param slTotal
	 */
	public void setSlTotal(int slTotal) {
		this.slTotal = slTotal;
	}

}