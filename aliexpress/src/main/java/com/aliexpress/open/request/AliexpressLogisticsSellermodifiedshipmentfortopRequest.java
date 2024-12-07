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
*  aliexpress.logistics.sellermodifiedshipmentfortop
*/
public class AliexpressLogisticsSellermodifiedshipmentfortopRequest extends BaseGopRequest<AliexpressLogisticsSellermodifiedshipmentfortopResponse> {

    /** 旧的运单号 */
    private String oldLogisticsNo;
    /** memo */
    private String description;
    /** 新的运单号 */
    private String newLogisticsNo;
    /** 状态包括：全部发货(all)、部分发货(part) */
    private String sendType;
    /** 交易订单号 */
    private String outRef;
    /** 跟踪网址 */
    private String trackingWebsite;
    /** 用户需要修改的的老的发货物流服务 */
    private String oldServiceName;
    /** 新的发货物流服务 */
    private String newServiceName;
    /** 包裹类型 */
    private String packageType;
    /** 实际承运商 */
    private String actualCarrier;
    /** 多语言，ae_ES西班牙语，pt_BR巴西 */
    private String locale;

    public String getOldLogisticsNo(){
        return this.oldLogisticsNo;
    }
    public void setOldLogisticsNo(String oldLogisticsNo){
        this.oldLogisticsNo = oldLogisticsNo;
        }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
        }
    public String getNewLogisticsNo(){
        return this.newLogisticsNo;
    }
    public void setNewLogisticsNo(String newLogisticsNo){
        this.newLogisticsNo = newLogisticsNo;
        }
    public String getSendType(){
        return this.sendType;
    }
    public void setSendType(String sendType){
        this.sendType = sendType;
        }
    public String getOutRef(){
        return this.outRef;
    }
    public void setOutRef(String outRef){
        this.outRef = outRef;
        }
    public String getTrackingWebsite(){
        return this.trackingWebsite;
    }
    public void setTrackingWebsite(String trackingWebsite){
        this.trackingWebsite = trackingWebsite;
        }
    public String getOldServiceName(){
        return this.oldServiceName;
    }
    public void setOldServiceName(String oldServiceName){
        this.oldServiceName = oldServiceName;
        }
    public String getNewServiceName(){
        return this.newServiceName;
    }
    public void setNewServiceName(String newServiceName){
        this.newServiceName = newServiceName;
        }
    public String getPackageType(){
        return this.packageType;
    }
    public void setPackageType(String packageType){
        this.packageType = packageType;
        }
    public String getActualCarrier(){
        return this.actualCarrier;
    }
    public void setActualCarrier(String actualCarrier){
        this.actualCarrier = actualCarrier;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.sellermodifiedshipmentfortop";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (oldLogisticsNo != null) {
                        super.addApiParameter("old_logistics_no", oldLogisticsNo.toString());
                    }
                            if (description != null) {
                        super.addApiParameter("description", description.toString());
                    }
                            if (newLogisticsNo != null) {
                        super.addApiParameter("new_logistics_no", newLogisticsNo.toString());
                    }
                            if (sendType != null) {
                        super.addApiParameter("send_type", sendType.toString());
                    }
                            if (outRef != null) {
                        super.addApiParameter("out_ref", outRef.toString());
                    }
                            if (trackingWebsite != null) {
                        super.addApiParameter("tracking_website", trackingWebsite.toString());
                    }
                            if (oldServiceName != null) {
                        super.addApiParameter("old_service_name", oldServiceName.toString());
                    }
                            if (newServiceName != null) {
                        super.addApiParameter("new_service_name", newServiceName.toString());
                    }
                            if (packageType != null) {
                        super.addApiParameter("package_type", packageType.toString());
                    }
                            if (actualCarrier != null) {
                        super.addApiParameter("actual_carrier", actualCarrier.toString());
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
    public Class<AliexpressLogisticsSellermodifiedshipmentfortopResponse> getResponseClass() {
        return AliexpressLogisticsSellermodifiedshipmentfortopResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}