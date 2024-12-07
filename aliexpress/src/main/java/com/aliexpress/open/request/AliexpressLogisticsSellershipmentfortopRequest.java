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
*  aliexpress.logistics.sellershipmentfortop
*/
public class AliexpressLogisticsSellershipmentfortopRequest extends BaseGopRequest<AliexpressLogisticsSellershipmentfortopResponse> {

    /** 国际运单号 */
    private String logisticsNo;
    /** memo */
    private String description;
    /** 声明发货类型，all表示全部发货，part表示部分声明发货。 */
    private String sendType;
    /** 交易订单号 */
    private String outRef;
    /** 追踪网址 */
    private String trackingWebsite;
    /** 物流服务名称 */
    private String serviceName;
    /** 包裹类型 */
    private String packageType;
    /** 实际承运商 */
    private String actualCarrier;
    /** ioss税号 */
    private String ioss;
    /** 多语言，es_ES西班牙语， pt_BR巴西 */
    private String locale;

    public String getLogisticsNo(){
        return this.logisticsNo;
    }
    public void setLogisticsNo(String logisticsNo){
        this.logisticsNo = logisticsNo;
        }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
    public String getServiceName(){
        return this.serviceName;
    }
    public void setServiceName(String serviceName){
        this.serviceName = serviceName;
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
    public String getIoss(){
        return this.ioss;
    }
    public void setIoss(String ioss){
        this.ioss = ioss;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.sellershipmentfortop";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (logisticsNo != null) {
                        super.addApiParameter("logistics_no", logisticsNo.toString());
                    }
                            if (description != null) {
                        super.addApiParameter("description", description.toString());
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
                            if (serviceName != null) {
                        super.addApiParameter("service_name", serviceName.toString());
                    }
                            if (packageType != null) {
                        super.addApiParameter("package_type", packageType.toString());
                    }
                            if (actualCarrier != null) {
                        super.addApiParameter("actual_carrier", actualCarrier.toString());
                    }
                            if (ioss != null) {
                        super.addApiParameter("ioss", ioss.toString());
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
    public Class<AliexpressLogisticsSellershipmentfortopResponse> getResponseClass() {
        return AliexpressLogisticsSellershipmentfortopResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}