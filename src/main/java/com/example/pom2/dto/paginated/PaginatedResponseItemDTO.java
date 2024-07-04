package com.example.pom2.dto.paginated;


import com.example.pom2.dto.ItemDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaginatedResponseItemDTO {
    List<ItemDTO> getItemsByActiveStatus;
    private long totalItems;
}
