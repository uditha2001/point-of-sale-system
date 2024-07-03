package com.example.pom2.service.Impl;

import com.example.pom2.dto.ItemDTO;
import com.example.pom2.dto.request.ItemGetRequestDTO;
import com.example.pom2.entity.Item;
import com.example.pom2.repo.ItemRepo;
import com.example.pom2.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ItemServiceIMPL implements ItemService {
    @Autowired
    ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveItem(ItemDTO itemDTO) {
     Item item = modelMapper.map(itemDTO,Item.class);
     itemRepo.save(item);
     return null;
    }

    @Override
    public List<ItemGetRequestDTO> getItemByNameAndStatus(String itemName) {
        boolean b=true;
        List<Item> items=itemRepo.findAllByItemNameEqualsAndActiveStatusEquals(itemName,b);
        if(items.size()>0){
            List<ItemGetRequestDTO> itemGetRequestDTOList=modelMapper.map(items,new TypeToken<List<ItemGetRequestDTO>>(){
            }.getType());
            return  itemGetRequestDTOList;
        }
        else{
            throw new RuntimeException("Item is not Active");
        }

    }

    @Override
    public List<ItemGetRequestDTO> getItemByNameAndStatusByMapStruct(String itemName) {
        return List.of();
    }
}
