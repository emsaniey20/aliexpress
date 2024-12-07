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

public class AliexpressOfferRedefiningInitialnewbundleAeopOfferBundleInitialResult implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 错误码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误消息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 搭配主商品 */
                @ApiField("main_item")
            private AliexpressOfferRedefiningInitialnewbundleAeopBundleItem mainItem;
        /** 搭配商品列表 */
                @ApiListField("sub_item_list")
            private List<AliexpressOfferRedefiningInitialnewbundleAeopBundleSubItem> subItemList;
        /** 返回时间 */
                @ApiField("time_stamp")
            private String timeStamp;
    
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public AliexpressOfferRedefiningInitialnewbundleAeopBundleItem getMainItem() {
    return this.mainItem;
    }
    public void setMainItem(AliexpressOfferRedefiningInitialnewbundleAeopBundleItem mainItem) {
    this.mainItem = mainItem;
    }
        public List<AliexpressOfferRedefiningInitialnewbundleAeopBundleSubItem> getSubItemList() {
    return this.subItemList;
    }
    public void setSubItemList(List<AliexpressOfferRedefiningInitialnewbundleAeopBundleSubItem> subItemList) {
    this.subItemList = subItemList;
    }
        public String getTimeStamp() {
    return this.timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    }
    }