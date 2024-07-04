package com.example.pom2.dto;

import com.example.pom2.entity.enumaration.MeasureType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO {

    private String itemName;
    private MeasureType measureType;
    private double balanceQty;
    private double supplierPrice;
    private double sellingPrice;
    private boolean activeStatus;
    private int id;

}
