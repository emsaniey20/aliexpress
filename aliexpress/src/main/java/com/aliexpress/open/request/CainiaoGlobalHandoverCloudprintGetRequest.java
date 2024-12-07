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
*  cainiao.global.handover.cloudprint.get
*/
public class CainiaoGlobalHandoverCloudprintGetRequest extends BaseGopRequest<CainiaoGlobalHandoverCloudprintGetResponse> {

    /** 大包运单号 */
    private String trackingNumber;
    /** 大包物流单LP号 */
    private String orderCode;
    /** 用户信息 */
    private CainiaoGlobalHandoverCloudprintGetUserInfoDTO userInfo;
    /** ISV名称，ISV：ISV-ISV英文或拼音名称、商家ERP：SELLER-商家英文或拼音名称 */
    private String client;
    /** 多语言 */
    private String locale;

    public String getTrackingNumber(){
        return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber){
        this.trackingNumber = trackingNumber;
        }
    public String getOrderCode(){
        return this.orderCode;
    }
    public void setOrderCode(String orderCode){
        this.orderCode = orderCode;
        }
    public CainiaoGlobalHandoverCloudprintGetUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalHandoverCloudprintGetUserInfoDTO userInfo){
        this.userInfo = userInfo;
        }
    public String getClient(){
        return this.client;
    }
    public void setClient(String client){
        this.client = client;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.handover.cloudprint.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (trackingNumber != null) {
                        super.addApiParameter("tracking_number", trackingNumber.toString());
                    }
                            if (orderCode != null) {
                        super.addApiParameter("order_code", orderCode.toString());
                    }
                            if (userInfo != null) {
                        super.addApiParameter("user_info", new JSONWriter(true, false).write(userInfo));
                    }
                            if (client != null) {
                        super.addApiParameter("client", client.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalHandoverCloudprintGetResponse> getResponseClass() {
        return CainiaoGlobalHandoverCloudprintGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}