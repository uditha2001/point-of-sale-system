package com.example.pom2.dto.request;

import com.example.pom2.entity.enumaration.MeasureType;
import jakarta.persistence.*;

public class ItemGetRequestDTO {

    private int itemId;
    private String itemName;
    private MeasureType measureType;
    private double balanceQty;
    private double supplierPrice;
    private double sellingPrice;
    private boolean activeStatus;

    public ItemGetRequestDTO() {
    }

    public ItemGetRequestDTO(int itemId, String itemName, double supplierPrice, double balanceQty, MeasureType measureType, double sellingPrice, boolean activeStatus) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.supplierPrice = supplierPrice;
        this.balanceQty = balanceQty;
        this.measureType = measureType;
        this.sellingPrice = sellingPrice;
        this.activeStatus = activeStatus;
    }

    public MeasureType getMeasureType() {
        return measureType;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public double getBalanceQty() {
        return balanceQty;
    }

    public double getSupplierPrice() {
        return supplierPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setMeasureType(MeasureType measureType) {
        this.measureType = measureType;
    }

    public void setBalanceQty(double balanceQty) {
        this.balanceQty = balanceQty;
    }

    public void setSupplierPrice(double supplierPrice) {
        this.supplierPrice = supplierPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "ItemGetRequestDTO{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", measureType=" + measureType +
                ", balanceQty=" + balanceQty +
                ", supplierPrice=" + supplierPrice +
                ", sellingPrice=" + sellingPrice +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
