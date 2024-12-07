package com.aliexpress.open.domain;

import java.io.Serializable;
import java.util.Map;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Long;
import java.lang.String;
import java.lang.Byte;
import java.lang.Object;
import java.math.BigDecimal;
import com.global.iop.api.*;
import com.global.iop.util.*;
import com.global.iop.util.json.*;
import com.aliexpress.open.domain.*;
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class GspOrderQueryforsupplierSalesOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 订单ID */
                @ApiField("id")
            private String id;
        /** 格式: yyyy-MM-dd hh:mm:ss, 当saleMarket为AE时，该时间为美国太平洋时间； */
                @ApiField("createdTime")
            private String createdTime;
        /** 格式: yyyy-MM-dd hh:mm:ss, 当saleMarket为AE时，该时间为美国太平洋时间 */
                @ApiField("payTime")
            private String payTime;
        /** Created Payed Shipped Canceled */
                @ApiField("status")
            private String status;
        /** 销售子单明细列表 */
                @ApiListField("orderLines")
            private List<GspOrderQueryforsupplierSalesOrderLineDTO> orderLines;
        /** 地址 */
                @ApiField("address")
            private GspOrderQueryforsupplierAddressDTO address;
    
        public String getId() {
    return this.id;
    }
    public void setId(String id) {
    this.id = id;
    }
        public String getCreatedTime() {
    return this.createdTime;
    }
    public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
    }
        public String getPayTime() {
    return this.payTime;
    }
    public void setPayTime(String payTime) {
    this.payTime = payTime;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public List<GspOrderQueryforsupplierSalesOrderLineDTO> getOrderLines() {
    return this.orderLines;
    }
    public void setOrderLines(List<GspOrderQueryforsupplierSalesOrderLineDTO> orderLines) {
    this.orderLines = orderLines;
    }
        public GspOrderQueryforsupplierAddressDTO getAddress() {
    return this.address;
    }
    public void setAddress(GspOrderQueryforsupplierAddressDTO address) {
    this.address = address;
    }
    }