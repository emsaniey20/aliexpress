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

public class AliexpressPopChoiceProductQueryPopChoiceProductSkuScItemInfo implements Serializable {
    private static final long serialVersionUID = 1L;
        /** SKU货品编码 */
                @ApiField("sc_item_code")
            private String scItemCode;
        /** SKU特殊商品类型 */
                @ApiListField("special_product_type_list")
            private List<String> specialProductTypeList;
        /** SKU货品条码 */
                @ApiField("sc_item_bar_code")
            private String scItemBarCode;
        /** SKU货品id */
                @ApiField("sc_item_id")
            private Long scItemId;
        /** 是否原箱，0否1是 */
                @ApiField("original_box")
            private String originalBox;
    
        public String getScItemCode() {
    return this.scItemCode;
    }
    public void setScItemCode(String scItemCode) {
    this.scItemCode = scItemCode;
    }
        public List<String> getSpecialProductTypeList() {
    return this.specialProductTypeList;
    }
    public void setSpecialProductTypeList(List<String> specialProductTypeList) {
    this.specialProductTypeList = specialProductTypeList;
    }
        public String getScItemBarCode() {
    return this.scItemBarCode;
    }
    public void setScItemBarCode(String scItemBarCode) {
    this.scItemBarCode = scItemBarCode;
    }
        public Long getScItemId() {
    return this.scItemId;
    }
    public void setScItemId(Long scItemId) {
    this.scItemId = scItemId;
    }
        public String getOriginalBox() {
    return this.originalBox;
    }
    public void setOriginalBox(String originalBox) {
    this.originalBox = originalBox;
    }
    }