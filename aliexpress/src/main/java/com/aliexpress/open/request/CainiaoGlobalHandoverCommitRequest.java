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
*  cainiao.global.handover.commit
*/
public class CainiaoGlobalHandoverCommitRequest extends BaseGopRequest<CainiaoGlobalHandoverCommitResponse> {

    /** 店铺LP单号列表，seller_id/user_nick（店铺标记） 只传输一种即可； 店铺标记与order_code_list（小包LP****号集合）为一一对应关系，不可使用A店铺seller_id/user_nick 对应 B店铺order_code_list（小包LP****号集合），这样会导致组包漏组或者小包找不到 */
    private List<CainiaoGlobalHandoverCommitSellerParcelOrderDTO> sellerParcelOrderList;
    /** 是否跳过不允许组包的小包（包括：状态不允许组包，已经组过包，揽收仓不一致，发货方式不一致） */
    private Boolean skipInvalidParcel;
    /** 大包备注 */
    private String remark;
    /** 退件信息 */
    private CainiaoGlobalHandoverCommitReturnerDTO returnInfo;
    /** 揽收信息 */
    private CainiaoGlobalHandoverCommitPickupDTO pickupInfo;
    /** 要创建交接单的小包编码集合，数量上限1000(即将下线，请使用seller_parcel_order_list) */
    private List<String> orderCodeList;
    /** 大包重量 */
    private Long weight;
    /** 交接单id */
    private Long handoverOrderId;
    /** 用户信息 */
    private CainiaoGlobalHandoverCommitUserInfoDTO userInfo;
    /** 重量单位，克:g, 千克:kg，默认g */
    private String weightUnit;
    /** 交接单类型：cainiao_pickup(菜鸟揽收)、self_post(自寄)、self_send(自送) */
    private String type;
    /** ISV名称，ISV：ISV-ISV英文或拼音名称、商家ERP：SELLER-商家英文或拼音名称 */
    private String client;
    /** 多语言 */
    private String locale;
    /** 扩展字段 */
    private HashMap<String, Object> features;
    /** 预约交货方式（bigbag：大包预约，batch：批次预约）） */
    private String appointmentType;
    /** 国内运单号（交接单类型type为self_post(自寄)时必填） */
    private String domesticTrackingNo;
    /** 国内物流公司id（交接单类型type为self_post(自寄)时必填） */
    private Integer domesticLogisticsCompanyId;
    /** 国内物流公司编码（交接单类型type为self_post(自寄)时必填） */
    private String domesticLogisticsCompany;

    public List<CainiaoGlobalHandoverCommitSellerParcelOrderDTO> getSellerParcelOrderList(){
        return this.sellerParcelOrderList;
    }
    public void setSellerParcelOrderList(List<CainiaoGlobalHandoverCommitSellerParcelOrderDTO> sellerParcelOrderList){
        this.sellerParcelOrderList = sellerParcelOrderList;
        }
    public Boolean getSkipInvalidParcel(){
        return this.skipInvalidParcel;
    }
    public void setSkipInvalidParcel(Boolean skipInvalidParcel){
        this.skipInvalidParcel = skipInvalidParcel;
        }
    public String getRemark(){
        return this.remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
        }
    public CainiaoGlobalHandoverCommitReturnerDTO getReturnInfo(){
        return this.returnInfo;
    }
    public void setReturnInfo(CainiaoGlobalHandoverCommitReturnerDTO returnInfo){
        this.returnInfo = returnInfo;
        }
    public CainiaoGlobalHandoverCommitPickupDTO getPickupInfo(){
        return this.pickupInfo;
    }
    public void setPickupInfo(CainiaoGlobalHandoverCommitPickupDTO pickupInfo){
        this.pickupInfo = pickupInfo;
        }
    public List<String> getOrderCodeList(){
        return this.orderCodeList;
    }
    public void setOrderCodeList(List<String> orderCodeList){
        this.orderCodeList = orderCodeList;
        }
    public Long getWeight(){
        return this.weight;
    }
    public void setWeight(Long weight){
        this.weight = weight;
        }
    public Long getHandoverOrderId(){
        return this.handoverOrderId;
    }
    public void setHandoverOrderId(Long handoverOrderId){
        this.handoverOrderId = handoverOrderId;
        }
    public CainiaoGlobalHandoverCommitUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalHandoverCommitUserInfoDTO userInfo){
        this.userInfo = userInfo;
        }
    public String getWeightUnit(){
        return this.weightUnit;
    }
    public void setWeightUnit(String weightUnit){
        this.weightUnit = weightUnit;
        }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
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
    public HashMap<String, Object> getFeatures(){
        return this.features;
    }
    public void setFeatures(HashMap<String, Object> features){
        this.features = features;
        }
    public String getAppointmentType(){
        return this.appointmentType;
    }
    public void setAppointmentType(String appointmentType){
        this.appointmentType = appointmentType;
        }
    public String getDomesticTrackingNo(){
        return this.domesticTrackingNo;
    }
    public void setDomesticTrackingNo(String domesticTrackingNo){
        this.domesticTrackingNo = domesticTrackingNo;
        }
    public Integer getDomesticLogisticsCompanyId(){
        return this.domesticLogisticsCompanyId;
    }
    public void setDomesticLogisticsCompanyId(Integer domesticLogisticsCompanyId){
        this.domesticLogisticsCompanyId = domesticLogisticsCompanyId;
        }
    public String getDomesticLogisticsCompany(){
        return this.domesticLogisticsCompany;
    }
    public void setDomesticLogisticsCompany(String domesticLogisticsCompany){
        this.domesticLogisticsCompany = domesticLogisticsCompany;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.handover.commit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerParcelOrderList != null) {
                        super.addApiParameter("seller_parcel_order_list", new JSONWriter(true, false).write(sellerParcelOrderList));
                    }
                            if (skipInvalidParcel != null) {
                        super.addApiParameter("skip_invalid_parcel", skipInvalidParcel.toString());
                    }
                            if (remark != null) {
                        super.addApiParameter("remark", remark.toString());
                    }
                            if (returnInfo != null) {
                        super.addApiParameter("return_info", new JSONWriter(true, false).write(returnInfo));
                    }
                            if (pickupInfo != null) {
                        super.addApiParameter("pickup_info", new JSONWriter(true, false).write(pickupInfo));
                    }
                            if (orderCodeList != null) {
                        super.addApiParameter("order_code_list", new JSONWriter(true, false).write(orderCodeList));
                    }
                            if (weight != null) {
                        super.addApiParameter("weight", weight.toString());
                    }
                            if (handoverOrderId != null) {
                        super.addApiParameter("handover_order_id", handoverOrderId.toString());
                    }
                            if (userInfo != null) {
                        super.addApiParameter("user_info", new JSONWriter(true, false).write(userInfo));
                    }
                            if (weightUnit != null) {
                        super.addApiParameter("weight_unit", weightUnit.toString());
                    }
                            if (type != null) {
                        super.addApiParameter("type", type.toString());
                    }
                            if (client != null) {
                        super.addApiParameter("client", client.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (features != null) {
                        super.addApiParameter("features", new JSONWriter(true, false).write(features));
                    }
                            if (appointmentType != null) {
                        super.addApiParameter("appointment_type", appointmentType.toString());
                    }
                            if (domesticTrackingNo != null) {
                        super.addApiParameter("domestic_tracking_no", domesticTrackingNo.toString());
                    }
                            if (domesticLogisticsCompanyId != null) {
                        super.addApiParameter("domestic_logistics_company_id", domesticLogisticsCompanyId.toString());
                    }
                            if (domesticLogisticsCompany != null) {
                        super.addApiParameter("domestic_logistics_company", domesticLogisticsCompany.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                                                                                    return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalHandoverCommitResponse> getResponseClass() {
        return CainiaoGlobalHandoverCommitResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}