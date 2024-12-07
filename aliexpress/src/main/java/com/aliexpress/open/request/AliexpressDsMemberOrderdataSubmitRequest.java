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
*  aliexpress.ds.member.orderdata.submit
*/
public class AliexpressDsMemberOrderdataSubmitRequest extends BaseGopRequest<AliexpressDsMemberOrderdataSubmitResponse> {

    /** AE product ID */
    private String aeProductId;
    /** Off-site payment time, GMT time, format YYYYMMDD:HHMMSS */
    private String paytime;
    /** AE order id */
    private String aeOrderid;
    /** SKU sales amount outside the station, to 2 decimal places */
    private String productAmount;
    /** Order sales amount outside the station, keep 2 decimal places */
    private String orderAmount;
    /** AE product SKU information, SKU key-value pair: "200000182:193;200007763:201336100" */
    private String aeSkuInfo;
    /** Commodity site url */
    private String productUrl;

    public String getAeProductId(){
        return this.aeProductId;
    }
    public void setAeProductId(String aeProductId){
        this.aeProductId = aeProductId;
        }
    public String getPaytime(){
        return this.paytime;
    }
    public void setPaytime(String paytime){
        this.paytime = paytime;
        }
    public String getAeOrderid(){
        return this.aeOrderid;
    }
    public void setAeOrderid(String aeOrderid){
        this.aeOrderid = aeOrderid;
        }
    public String getProductAmount(){
        return this.productAmount;
    }
    public void setProductAmount(String productAmount){
        this.productAmount = productAmount;
        }
    public String getOrderAmount(){
        return this.orderAmount;
    }
    public void setOrderAmount(String orderAmount){
        this.orderAmount = orderAmount;
        }
    public String getAeSkuInfo(){
        return this.aeSkuInfo;
    }
    public void setAeSkuInfo(String aeSkuInfo){
        this.aeSkuInfo = aeSkuInfo;
        }
    public String getProductUrl(){
        return this.productUrl;
    }
    public void setProductUrl(String productUrl){
        this.productUrl = productUrl;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ds.member.orderdata.submit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (aeProductId != null) {
                        super.addApiParameter("ae_product_id", aeProductId.toString());
                    }
                            if (paytime != null) {
                        super.addApiParameter("paytime", paytime.toString());
                    }
                            if (aeOrderid != null) {
                        super.addApiParameter("ae_orderid", aeOrderid.toString());
                    }
                            if (productAmount != null) {
                        super.addApiParameter("product_amount", productAmount.toString());
                    }
                            if (orderAmount != null) {
                        super.addApiParameter("order_amount", orderAmount.toString());
                    }
                            if (aeSkuInfo != null) {
                        super.addApiParameter("ae_sku_info", aeSkuInfo.toString());
                    }
                            if (productUrl != null) {
                        super.addApiParameter("product_url", productUrl.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressDsMemberOrderdataSubmitResponse> getResponseClass() {
        return AliexpressDsMemberOrderdataSubmitResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}