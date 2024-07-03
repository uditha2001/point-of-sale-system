package com.example.pom2.service;

import com.example.pom2.dto.ItemDTO;
import com.example.pom2.dto.request.ItemGetRequestDTO;

import java.util.List;

public interface ItemService {
    String saveItem(ItemDTO itemDTO);

    List<ItemGetRequestDTO> getItemByNameAndStatus(String itemName);

    List<ItemGetRequestDTO> getItemByNameAndStatusByMapStruct(String itemName);
}
