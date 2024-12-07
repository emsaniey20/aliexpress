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
*  cainiao.global.handover.cancel
*/
public class CainiaoGlobalHandoverCancelRequest extends BaseGopRequest<CainiaoGlobalHandoverCancelResponse> {

    /** 要取消的交接物运单号，即大包运单号 */
    private String trackingNumber;
    /** 要取消的交接单id */
    private Long handoverOrderId;
    /** 用户信息 */
    private CainiaoGlobalHandoverCancelUserInfoDTO userInfo;
    /** 要取消的交接物id，即大包id */
    private Long handoverContentId;
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
    public Long getHandoverOrderId(){
        return this.handoverOrderId;
    }
    public void setHandoverOrderId(Long handoverOrderId){
        this.handoverOrderId = handoverOrderId;
        }
    public CainiaoGlobalHandoverCancelUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalHandoverCancelUserInfoDTO userInfo){
        this.userInfo = userInfo;
        }
    public Long getHandoverContentId(){
        return this.handoverContentId;
    }
    public void setHandoverContentId(Long handoverContentId){
        this.handoverContentId = handoverContentId;
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
        return "cainiao.global.handover.cancel";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (trackingNumber != null) {
                        super.addApiParameter("tracking_number", trackingNumber.toString());
                    }
                            if (handoverOrderId != null) {
                        super.addApiParameter("handover_order_id", handoverOrderId.toString());
                    }
                            if (userInfo != null) {
                        super.addApiParameter("user_info", new JSONWriter(true, false).write(userInfo));
                    }
                            if (handoverContentId != null) {
                        super.addApiParameter("handover_content_id", handoverContentId.toString());
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
    public Class<CainiaoGlobalHandoverCancelResponse> getResponseClass() {
        return CainiaoGlobalHandoverCancelResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}