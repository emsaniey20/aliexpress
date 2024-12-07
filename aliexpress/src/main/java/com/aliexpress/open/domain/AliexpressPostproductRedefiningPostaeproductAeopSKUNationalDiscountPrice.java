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

public class AliexpressPostproductRedefiningPostaeproductAeopSKUNationalDiscountPrice implements Serializable {
    private static final long serialVersionUID = 1L;
        /** sku分国家的日常促销价的国家：ISO两位的国家编码（目前支持国家：RU US CA ES FR UK NL IL BR CL AU UA BY JP TH SG KR ID MY PH VN IT DE SA AE PL TR） */
                @ApiField("shipto_country")
            private String shiptoCountry;
        /** sku分国家的日常促销价价格 */
                @ApiField("discount_price")
            private String discountPrice;
    
        public String getShiptoCountry() {
    return this.shiptoCountry;
    }
    public void setShiptoCountry(String shiptoCountry) {
    this.shiptoCountry = shiptoCountry;
    }
        public String getDiscountPrice() {
    return this.discountPrice;
    }
    public void setDiscountPrice(String discountPrice) {
    this.discountPrice = discountPrice;
    }
    }