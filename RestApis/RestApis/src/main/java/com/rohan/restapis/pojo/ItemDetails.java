package com.rohan.restapis.pojo;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
public class ItemDetails {
    private String orderItemSeqId;
    private String productId;
    private String itemDescription;
    private Float quantity;
    private Float unitAmount;
}
