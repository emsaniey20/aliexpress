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

public class AliexpressDsFeednameGetTrafficFeaturedPromoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Product number of featured promotion */
                @ApiField("promo_desc")
            private String promoDesc;
        /** The description of featured promotion */
                @ApiField("promo_name")
            private String promoName;
        /** The name of featured promotion */
                @ApiField("product_num")
            private Long productNum;
    
        public String getPromoDesc() {
    return this.promoDesc;
    }
    public void setPromoDesc(String promoDesc) {
    this.promoDesc = promoDesc;
    }
        public String getPromoName() {
    return this.promoName;
    }
    public void setPromoName(String promoName) {
    this.promoName = promoName;
    }
        public Long getProductNum() {
    return this.productNum;
    }
    public void setProductNum(Long productNum) {
    this.productNum = productNum;
    }
    }