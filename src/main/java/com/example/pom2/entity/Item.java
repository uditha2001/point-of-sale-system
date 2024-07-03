package com.example.pom2.entity;

import com.example.pom2.entity.enumaration.MeasureType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="item")
public class Item {
    @Id
    @Column(name="item_id" ,length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;

    @Column(name="item_name",length = 100,nullable = false)
    private String itemName;

    @Enumerated(EnumType.STRING)
    @Column(name="measure_type",length = 100,nullable = false)
    private MeasureType measureType;

    @Column(name="balance_qty" ,length = 100,nullable = false)
    private double balanceQty;

    @Column(name="supplier_price",length = 100,nullable = false)
    private double supplierPrice;
    @Column(name="selling_price",length = 100,nullable = false)
    private double sellingPrice;
    @Column(name="status",length = 45,nullable = false)
    private boolean activeStatus;

    public Item() {
    }

    public Item(int itemId, String itemName, MeasureType measureType, double balanceQty, double supplierPrice, double sellingPrice, boolean activeStatus) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.measureType = measureType;
        this.balanceQty = balanceQty;
        this.supplierPrice = supplierPrice;
        this.sellingPrice = sellingPrice;
        this.activeStatus = activeStatus;
    }

    public int getItemId() {
        return itemId;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public MeasureType getMeasureType() {
        return measureType;
    }

    public void setMeasureType(MeasureType measureType) {
        this.measureType = measureType;
    }

    public double getSupplierPrice() {
        return supplierPrice;
    }

    public void setSupplierPrice(double supplierPrice) {
        this.supplierPrice = supplierPrice;
    }

    public double getBalanceQty() {
        return balanceQty;
    }

    public void setBalanceQty(double balanceQty) {
        this.balanceQty = balanceQty;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
}
