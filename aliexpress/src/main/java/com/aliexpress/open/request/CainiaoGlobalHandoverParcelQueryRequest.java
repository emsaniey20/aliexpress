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
*  cainiao.global.handover.parcel.query
*/
public class CainiaoGlobalHandoverParcelQueryRequest extends BaseGopRequest<CainiaoGlobalHandoverParcelQueryResponse> {

    /** 多语言 */
    private String locale;
    /** 小包的物流订单号,和小包的国际运单号参数任选其一即可 */
    private String orderCode;
    /** 小包的国际运单号，和小包的物流订单号参数任选其一即可 */
    private String trackingNumber;
    /** 用户信息 */
    private CainiaoGlobalHandoverParcelQueryUserInfoDTO userInfo;
    /** 客户端名称，ISV：ISV-ISV英文或拼音名称、商家ERP：SELLER-商家英文或拼音名称 */
    private String client;

    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public String getOrderCode(){
        return this.orderCode;
    }
    public void setOrderCode(String orderCode){
        this.orderCode = orderCode;
        }
    public String getTrackingNumber(){
        return this.trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber){
        this.trackingNumber = trackingNumber;
        }
    public CainiaoGlobalHandoverParcelQueryUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalHandoverParcelQueryUserInfoDTO userInfo){
        this.userInfo = userInfo;
        }
    public String getClient(){
        return this.client;
    }
    public void setClient(String client){
        this.client = client;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.handover.parcel.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (orderCode != null) {
                        super.addApiParameter("order_code", orderCode.toString());
                    }
                            if (trackingNumber != null) {
                        super.addApiParameter("tracking_number", trackingNumber.toString());
                    }
                            if (userInfo != null) {
                        super.addApiParameter("user_info", new JSONWriter(true, false).write(userInfo));
                    }
                            if (client != null) {
                        super.addApiParameter("client", client.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalHandoverParcelQueryResponse> getResponseClass() {
        return CainiaoGlobalHandoverParcelQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}