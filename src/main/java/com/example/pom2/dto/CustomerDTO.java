package com.example.pom2.dto;

public class CustomerDTO {

    private int customerId;
    private String customerName;
    private String customerAddress;
    private String nic;
    private boolean active;
   // private ArrayList<String> contactNumbers=new ArrayList<String>();
    private double customerSalary;
    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, String customerName, String customerAddress, String nic, boolean active, double customerSalary) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.nic = nic;
        this.active = active;
        this.customerSalary = customerSalary;
        //this.contactNumbers = contactNumbers;
    }

    public double getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(double customerSalary) {
        this.customerSalary = customerSalary;
    }

  /*  public void setContactNumbers(ArrayList<String> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }*/

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", nic='" + nic + '\'' +
                ", active=" + active +
                '}';
    }
}
