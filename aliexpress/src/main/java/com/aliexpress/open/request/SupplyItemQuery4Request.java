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
*  /supply/item/query4
*/
public class SupplyItemQuery4Request extends BaseGopRequest<SupplyItemQuery4Response> {

    /** 商品ID */
    private Long itemId;
    /** 拓展字段 */
    private HashMap<String, Object> features;
    /** 登陆ID */
    private String loginId;
    /** 身份识别 */
    private String identity;
    /** 供应商类型 */
    private String supplyType;

    public Long getItemId(){
        return this.itemId;
    }
    public void setItemId(Long itemId){
        this.itemId = itemId;
        }
    public HashMap<String, Object> getFeatures(){
        return this.features;
    }
    public void setFeatures(HashMap<String, Object> features){
        this.features = features;
        }
    public String getLoginId(){
        return this.loginId;
    }
    public void setLoginId(String loginId){
        this.loginId = loginId;
        }
    public String getIdentity(){
        return this.identity;
    }
    public void setIdentity(String identity){
        this.identity = identity;
        }
    public String getSupplyType(){
        return this.supplyType;
    }
    public void setSupplyType(String supplyType){
        this.supplyType = supplyType;
        }

    @Override
    public String getApiName() {
        return "/supply/item/query4";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (itemId != null) {
                        super.addApiParameter("item_id", itemId.toString());
                    }
                            if (features != null) {
                        super.addApiParameter("features", new JSONWriter(true, false).write(features));
                    }
                            if (loginId != null) {
                        super.addApiParameter("login_id", loginId.toString());
                    }
                            if (identity != null) {
                        super.addApiParameter("identity", identity.toString());
                    }
                            if (supplyType != null) {
                        super.addApiParameter("supply_type", supplyType.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<SupplyItemQuery4Response> getResponseClass() {
        return SupplyItemQuery4Response.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}