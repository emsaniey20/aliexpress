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
*  cainiao.global.handover.content.query
*/
public class CainiaoGlobalHandoverContentQueryRequest extends BaseGopRequest<CainiaoGlobalHandoverContentQueryResponse> {

    /** 用户信息 */
    private CainiaoGlobalHandoverContentQueryUserInfoDTO userInfo;
    /** 交接物物流订单编码,和交接物运单号参数可以任选其一即可 */
    private String orderCode;
    /** 交接物运单号，和交接物物流订单编码参数任选其一即可 */
    private String trackingNumber;
    /** 客户端名称，ISV：ISV-ISV英文或拼音名称、商家ERP：SELLER-商家英文或拼音名称 */
    private String client;
    /** 多语言 */
    private String locale;

    public CainiaoGlobalHandoverContentQueryUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalHandoverContentQueryUserInfoDTO userInfo){
        this.userInfo = userInfo;
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
        return "cainiao.global.handover.content.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (userInfo != null) {
                        super.addApiParameter("user_info", new JSONWriter(true, false).write(userInfo));
                    }
                            if (orderCode != null) {
                        super.addApiParameter("order_code", orderCode.toString());
                    }
                            if (trackingNumber != null) {
                        super.addApiParameter("tracking_number", trackingNumber.toString());
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
    public Class<CainiaoGlobalHandoverContentQueryResponse> getResponseClass() {
        return CainiaoGlobalHandoverContentQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}