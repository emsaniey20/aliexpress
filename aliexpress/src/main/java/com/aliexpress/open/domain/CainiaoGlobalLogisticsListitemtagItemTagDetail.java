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

public class CainiaoGlobalLogisticsListitemtagItemTagDetail implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 禁限运属性描述 */
                @ApiField("prohibition_msg")
            private String prohibitionMsg;
        /** Y（是禁限运商品）、N（不是禁限运商品）、NO_DATA（无结果） */
                @ApiField("prohibition_result")
            private String prohibitionResult;
        /** IPR（IPR）、禁运（CONTRABAND）、纯电（BATTERIES）、特货（SPECIAL）、带电带磁（ELECTRICAL）、普货（GENERAL）、无记录（N/A） */
                @ApiField("prohibition_feature")
            private String prohibitionFeature;
    
        public String getProhibitionMsg() {
    return this.prohibitionMsg;
    }
    public void setProhibitionMsg(String prohibitionMsg) {
    this.prohibitionMsg = prohibitionMsg;
    }
        public String getProhibitionResult() {
    return this.prohibitionResult;
    }
    public void setProhibitionResult(String prohibitionResult) {
    this.prohibitionResult = prohibitionResult;
    }
        public String getProhibitionFeature() {
    return this.prohibitionFeature;
    }
    public void setProhibitionFeature(String prohibitionFeature) {
    this.prohibitionFeature = prohibitionFeature;
    }
    }