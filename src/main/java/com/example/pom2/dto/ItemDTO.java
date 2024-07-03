package com.example.pom2.dto;

import com.example.pom2.entity.enumaration.MeasureType;



public class ItemDTO {

    private String itemName;
    private MeasureType measureType;
    private double balanceQty;
    private double supplierPrice;
    private double sellingPrice;
    private boolean activeStatus;

    public ItemDTO() {
    }

    public ItemDTO(String itemName, MeasureType measureType, double balanceQty, double supplierPrice, double sellingPrice, boolean activeStatus) {
        this.itemName = itemName;
        this.measureType = measureType;
        this.balanceQty = balanceQty;
        this.supplierPrice = supplierPrice;
        this.sellingPrice = sellingPrice;
        this.activeStatus = activeStatus;
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

    public double getBalanceQty() {
        return balanceQty;
    }

    public void setBalanceQty(double balanceQty) {
        this.balanceQty = balanceQty;
    }

    public double getSupplierPrice() {
        return supplierPrice;
    }

    public void setSupplierPrice(double supplierPrice) {
        this.supplierPrice = supplierPrice;
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

    @Override
    public String toString() {
        return "ItemDTO{" +
                "itemName='" + itemName + '\'' +
                ", measureType=" + measureType +
                ", balanceQty=" + balanceQty +
                ", supplierPrice=" + supplierPrice +
                ", sellingPrice=" + sellingPrice +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
