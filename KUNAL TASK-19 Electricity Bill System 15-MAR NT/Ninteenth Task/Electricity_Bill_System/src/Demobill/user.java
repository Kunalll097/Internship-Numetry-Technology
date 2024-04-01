package Demobill;

public class user {
    private String name;
    private String address;
    private long mobilenumber;
	private int billingunit;
    private Long consumernumber;
	private double previousReading;
    private double currentReading;
    
    public user(String name, String address,Long mobilenumber2) {
        this.name = name;
        this.address = address;
        this.mobilenumber = mobilenumber2;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getMobilenumber() {
		return mobilenumber;
	}
    public int getBillingunit() {
		return billingunit;
	}

	public void setBillingunit(int billingunit) {
		this.billingunit = billingunit;
	}

	public Long getConsumernumber() {
		return consumernumber;
	}

	public void setConsumernumber(Long consumernumber) {
		this.consumernumber = consumernumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
    public double getPreviousReading() {
        return previousReading;
    }
    public void setPreviousReading(double previousReading) {
        this.previousReading = previousReading;
    }
    public double getCurrentReading() {
        return currentReading;
    }
    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }
}
