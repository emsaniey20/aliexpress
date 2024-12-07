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

public class AliexpressChoiceProductEditOneStopServiceProductSkuScItemInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 货品编码 */
                @ApiField("sc_item_code")
            private String scItemCode;
        /** 货品条码 */
                @ApiField("sc_item_bar_code")
            private String scItemBarCode;
        /** 物流属性，特殊商品类型：  内电 ：274526  ，  弱磁  ： 274452 */
                @ApiListField("special_product_type_list")
            private List<String> specialProductTypeList;
        /** 是否原箱：  1 是， 0 不是 */
                @ApiField("original_box")
            private String originalBox;
    
        public String getScItemCode() {
    return this.scItemCode;
    }
    public void setScItemCode(String scItemCode) {
    this.scItemCode = scItemCode;
    }
        public String getScItemBarCode() {
    return this.scItemBarCode;
    }
    public void setScItemBarCode(String scItemBarCode) {
    this.scItemBarCode = scItemBarCode;
    }
        public List<String> getSpecialProductTypeList() {
    return this.specialProductTypeList;
    }
    public void setSpecialProductTypeList(List<String> specialProductTypeList) {
    this.specialProductTypeList = specialProductTypeList;
    }
        public String getOriginalBox() {
    return this.originalBox;
    }
    public void setOriginalBox(String originalBox) {
    this.originalBox = originalBox;
    }
    }