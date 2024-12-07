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
*  aliexpress.sellercenter.proxy.brand.list
*/
public class AliexpressSellercenterProxyBrandListRequest extends BaseGopRequest<AliexpressSellercenterProxyBrandListResponse> {

    /** seller_id */
    private Long sellerId;
    /** page number */
    private Integer pageNum;

    public Long getSellerId(){
        return this.sellerId;
    }
    public void setSellerId(Long sellerId){
        this.sellerId = sellerId;
        }
    public Integer getPageNum(){
        return this.pageNum;
    }
    public void setPageNum(Integer pageNum){
        this.pageNum = pageNum;
        }

    @Override
    public String getApiName() {
        return "aliexpress.sellercenter.proxy.brand.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerId != null) {
                        super.addApiParameter("seller_id", sellerId.toString());
                    }
                            if (pageNum != null) {
                        super.addApiParameter("page_num", pageNum.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSellercenterProxyBrandListResponse> getResponseClass() {
        return AliexpressSellercenterProxyBrandListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}