package com.rohan.restapis.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Orders {

    private String orderId;
    private String orderName;
    private String currencyUomId;
    private String salesChannelEnumId;
    private String statusId;
    private String placedDate;
    private String grandTotal;
    private CustomerDetails customerDetails;
    private OrderParts[] orderParts;
}
