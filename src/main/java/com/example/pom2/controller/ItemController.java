package com.example.pom2.controller;

import com.example.pom2.dto.ItemDTO;
import com.example.pom2.dto.paginated.PaginatedResponseItemDTO;
import com.example.pom2.dto.request.ItemGetRequestDTO;
import com.example.pom2.entity.Item;
import com.example.pom2.service.Impl.ItemServiceIMPL;
import com.example.pom2.service.ItemService;
import com.example.pom2.utill.StandardResponse;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin
public class ItemController {
    @Autowired
    private ItemServiceIMPL itemService;
//    @PostMapping(
//            path = {"/save"}
//    )
//    public String itemSave(@RequestBody ItemDTO itemDTO) {
//        itemService.saveItem(itemDTO);
//        return "success";
//    }

    @PostMapping(
            path = {"/save"}
    )
    public ResponseEntity<StandardResponse> itemSave(@RequestBody ItemDTO itemDTO) {
        String message = itemService.saveItem(itemDTO);
        ResponseEntity<StandardResponse> response = new ResponseEntity<StandardResponse>(
                new StandardResponse("sucess", 201, message), HttpStatus.CREATED
        );
        return response;
    }

    @GetMapping(
            path = "/get-by-name",
            params = "name"

    )
    public ResponseEntity<StandardResponse> itemGetRequestDTOList(@RequestParam(value = "name") String itemName) {
        List<ItemGetRequestDTO> requestDTOList = itemService.getItemByNameAndStatus(itemName);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse("success", 200, requestDTOList), HttpStatus.OK
        );
    }

    @GetMapping(
            path = "/get-by-name-with-mapstruct",
            params = "name"

    )
    public ResponseEntity<StandardResponse> itemGetRequestDTOListByMapStruct(@RequestParam(value = "name") String itemName) {
        List<ItemGetRequestDTO> requestDTOList = itemService.getItemByNameAndStatusByMapStruct(itemName);
        return new ResponseEntity<>(
                new StandardResponse("success", 200, requestDTOList), HttpStatus.OK
        );

    }
    @GetMapping(
            path="/get-item-by-activeStatus",
            params={"activeStatus","page","size"}
    )
    public ResponseEntity<StandardResponse> getItemByAcyiveStatus(
            @RequestParam(value ="activeStatus") boolean activeStatus,
            @RequestParam(value="page") int page,
            @RequestParam(value="size") @Max(10)int size
    ){
        PaginatedResponseItemDTO paginatedResponseItemDTO=itemService.getItemByActiveStatusWithPagin(activeStatus,page,size);
        return new ResponseEntity<>(
                new StandardResponse(
                        "success",201,paginatedResponseItemDTO
                ),HttpStatus.FOUND
        );

    }

}
