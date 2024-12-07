package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  aliexpress.asf.package.shipping.service.get
*/
public class AliexpressAsfPackageShippingServiceGetRequest extends BaseGopRequest<AliexpressAsfPackageShippingServiceGetResponse> {

    /** locale */
    private String locale;
    /** tradeOrderId */
    private Long tradeOrderId;
    /** tradeOrderItemIdList */
    private List<Long> tradeOrderItemIdList;
    /** pageSize */
    private Integer pageSize;
    /** pageNo */
    private Integer pageNo;

    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public List<Long> getTradeOrderItemIdList(){
        return this.tradeOrderItemIdList;
    }
    public void setTradeOrderItemIdList(List<Long> tradeOrderItemIdList){
        this.tradeOrderItemIdList = tradeOrderItemIdList;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public Integer getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Integer pageNo){
        this.pageNo = pageNo;
        }

    @Override
    public String getApiName() {
        return "aliexpress.asf.package.shipping.service.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("tradeOrderId", tradeOrderId.toString());
                    }
                            if (tradeOrderItemIdList != null) {
                        super.addApiParameter("tradeOrderItemIdList", new JSONWriter(true, false).write(tradeOrderItemIdList));
                    }
                            if (pageSize != null) {
                        super.addApiParameter("pageSize", pageSize.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("pageNo", pageNo.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAsfPackageShippingServiceGetResponse> getResponseClass() {
        return AliexpressAsfPackageShippingServiceGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}