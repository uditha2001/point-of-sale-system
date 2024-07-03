package com.example.pom2.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.boot.registry.selector.spi.StrategySelector;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name ="customerId",length = 45)
    private int customerId;
    @Column(name="customer_name",length=100,nullable = false)
    private String customerName;

    @Column(name="customer_adress",length = 255)
    private String customerAddress;
    // @ElementCollection()
    //@CollectionTable(name = "contact_numbers",joinColumns = @JoinColumn(name ="customerID"))
    // @Column(name="contact_numbers",nullable = false)
    // private List<String> contactNumbersl;*/
    @Column(name="customer_salary")
    private double customerSalary;
    @Column(name="nic")
    private String nic;
    @Column(name="active_status",columnDefinition = "TINYINT default 1")
    private boolean active;



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(double customerSalary) {
        this.customerSalary = customerSalary;
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

    public Customer() {
    }
    public Customer(int customerId, String customerName, String customerAddress, double customerSalary, String nic, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerSalary = customerSalary;
        this.nic = nic;
        this.active = active;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerSalary=" + customerSalary +
                ", nic='" + nic + '\'' +
                ", active=" + active +
                '}';
    }
}
