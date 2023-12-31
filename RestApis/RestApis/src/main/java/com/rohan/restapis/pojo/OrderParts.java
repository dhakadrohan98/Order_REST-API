package com.rohan.restapis.pojo;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
public class OrderParts {
    private String orderPartSeqId;
    private String partName;
    private String facilityId;
    private String shipmentMethodId;
    private Float partTotal;
    private ItemDetails[] itemDetails;
}
