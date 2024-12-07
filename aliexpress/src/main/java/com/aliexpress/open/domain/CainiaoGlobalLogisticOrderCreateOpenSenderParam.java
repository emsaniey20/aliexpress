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

public class CainiaoGlobalLogisticOrderCreateOpenSenderParam implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 卖家后台地址id,用来获取卖家详细地址信息，传入值为Long型； */
                @ApiField("seller_address_id")
            private Long sellerAddressId;
    
        public Long getSellerAddressId() {
    return this.sellerAddressId;
    }
    public void setSellerAddressId(Long sellerAddressId) {
    this.sellerAddressId = sellerAddressId;
    }
    }