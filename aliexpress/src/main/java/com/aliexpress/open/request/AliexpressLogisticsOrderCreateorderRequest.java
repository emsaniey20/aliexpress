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
*  aliexpress.logistics.order.createorder
*/
public class AliexpressLogisticsOrderCreateorderRequest extends BaseGopRequest<AliexpressLogisticsOrderCreateorderResponse> {

    /** 是否同意升级逆向高货值保险 */
    private String isAgreeUpgradeReverseParcelInsure;
    /** 订单对应收货地址OAID */
    private String oaid;
    /** 发货方式：上门揽收DOOR_PICKUP, 自寄SELF_POST, 自送SELF_SEND */
    private String pickupType;
    /** 申报产品信息,列表类型，以json格式来表达。{productId为产品ID(必填,如为礼品,则设置为0);categoryCnDesc为申报中文名称(必填,长度1-20);categoryEnDesc为申报英文名称(必填,长度1-60);productNum产品件数(必填1-999);productDeclareAmount为产品申报金额(必填,0.01-10000.00);productWeight为产品申报重量(必填0.001-2.000);isContainsBattery为是否包含锂电池(必填0/1);scItemId为仓储发货属性代码（团购订单，仓储发货必填，物流服务为RUSTON 哈尔滨备货仓 HRB_WLB_RUSTONHEB，属性代码对应AE商品的sku属性一级，暂时没有提供接口查询属性代码，可以在仓储管理--库存管理页面查看，例如： 团购产品的sku属性White对应属性代码 40414943126）;skuValue为属性名称（团购订单，仓储发货必填，例如：White）;hsCode为产品海关编码，获取相关数据请至：http://www.customs.gov.cn/Tabid/67737/Default.aspx};isAneroidMarkup为是否含非液体化妆品（必填，填0代表不含非液体化妆品；填1代表含非液体化妆品；默认为0）;isOnlyBattery为是否含纯电池产品（必填，填0代表不含纯电池产品；填1代表含纯电池产品；默认为0）; */
    private String declareProductDTOs;
    /** 国内快递公司编码，只有传了pickupType时可以非必填 */
    private String domesticLogisticsCompany;
    /** 国内快递ID(自送ID为-1)，只有传了pickupType时可以非必填 */
    private Long domesticLogisticsCompanyId;
    /** 国内快递运单号,长度1-32，只有传了pickupType时可以非必填 */
    private String domesticTrackingNo;
    /** 包裹数量： 创建国家小包订单时非必填，创建国家快递订单时必填 */
    private Long packageNum;
    /** 订单来源 */
    private String tradeOrderFrom;
    /** 交易订单号 */
    private Long tradeOrderId;
    /** 不可达处理(退回:0/销毁:1) 。详情请参考：http://bbs.seller.aliexpress.com/bbs/read.php?tid=514111 */
    private Integer undeliverableDecision;
    /** ”根据订单号获取线上发货物流方案“API获取用户选择的实际发货物流服务（物流服务key,即仓库服务名称)例如：HRB_WLB_ZTOGZ是 中俄航空 Ruston广州仓库； HRB_WLB_RUSTONHEB为哈尔滨备货仓暂不支持，该渠道请做忽略。 */
    private String warehouseCarrierService;
    /** addresses */
    private AliexpressLogisticsOrderCreateorderAeopWlDeclareAddressDTO addressDTOs;
    /** 发票号（可空） */
    private String invoiceNumber;
    /** ISV用户唯一标识，一般为userId,最大长度为16个字符 */
    private String topUserKey;
    /** 包裹保额 */
    private AliexpressLogisticsOrderCreateorderMoney insuranceCoverage;

    public String getIsAgreeUpgradeReverseParcelInsure(){
        return this.isAgreeUpgradeReverseParcelInsure;
    }
    public void setIsAgreeUpgradeReverseParcelInsure(String isAgreeUpgradeReverseParcelInsure){
        this.isAgreeUpgradeReverseParcelInsure = isAgreeUpgradeReverseParcelInsure;
        }
    public String getOaid(){
        return this.oaid;
    }
    public void setOaid(String oaid){
        this.oaid = oaid;
        }
    public String getPickupType(){
        return this.pickupType;
    }
    public void setPickupType(String pickupType){
        this.pickupType = pickupType;
        }
    public String getDeclareProductDTOs(){
        return this.declareProductDTOs;
    }
    public void setDeclareProductDTOs(String declareProductDTOs){
        this.declareProductDTOs = declareProductDTOs;
        }
    public String getDomesticLogisticsCompany(){
        return this.domesticLogisticsCompany;
    }
    public void setDomesticLogisticsCompany(String domesticLogisticsCompany){
        this.domesticLogisticsCompany = domesticLogisticsCompany;
        }
    public Long getDomesticLogisticsCompanyId(){
        return this.domesticLogisticsCompanyId;
    }
    public void setDomesticLogisticsCompanyId(Long domesticLogisticsCompanyId){
        this.domesticLogisticsCompanyId = domesticLogisticsCompanyId;
        }
    public String getDomesticTrackingNo(){
        return this.domesticTrackingNo;
    }
    public void setDomesticTrackingNo(String domesticTrackingNo){
        this.domesticTrackingNo = domesticTrackingNo;
        }
    public Long getPackageNum(){
        return this.packageNum;
    }
    public void setPackageNum(Long packageNum){
        this.packageNum = packageNum;
        }
    public String getTradeOrderFrom(){
        return this.tradeOrderFrom;
    }
    public void setTradeOrderFrom(String tradeOrderFrom){
        this.tradeOrderFrom = tradeOrderFrom;
        }
    public Long getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(Long tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public Integer getUndeliverableDecision(){
        return this.undeliverableDecision;
    }
    public void setUndeliverableDecision(Integer undeliverableDecision){
        this.undeliverableDecision = undeliverableDecision;
        }
    public String getWarehouseCarrierService(){
        return this.warehouseCarrierService;
    }
    public void setWarehouseCarrierService(String warehouseCarrierService){
        this.warehouseCarrierService = warehouseCarrierService;
        }
    public AliexpressLogisticsOrderCreateorderAeopWlDeclareAddressDTO getAddressDTOs(){
        return this.addressDTOs;
    }
    public void setAddressDTOs(AliexpressLogisticsOrderCreateorderAeopWlDeclareAddressDTO addressDTOs){
        this.addressDTOs = addressDTOs;
        }
    public String getInvoiceNumber(){
        return this.invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
        }
    public String getTopUserKey(){
        return this.topUserKey;
    }
    public void setTopUserKey(String topUserKey){
        this.topUserKey = topUserKey;
        }
    public AliexpressLogisticsOrderCreateorderMoney getInsuranceCoverage(){
        return this.insuranceCoverage;
    }
    public void setInsuranceCoverage(AliexpressLogisticsOrderCreateorderMoney insuranceCoverage){
        this.insuranceCoverage = insuranceCoverage;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.order.createorder";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (isAgreeUpgradeReverseParcelInsure != null) {
                        super.addApiParameter("is_agree_upgrade_reverse_parcel_insure", isAgreeUpgradeReverseParcelInsure.toString());
                    }
                            if (oaid != null) {
                        super.addApiParameter("oaid", oaid.toString());
                    }
                            if (pickupType != null) {
                        super.addApiParameter("pickup_type", pickupType.toString());
                    }
                            if (declareProductDTOs != null) {
                        super.addApiParameter("declare_product_d_t_os", declareProductDTOs.toString());
                    }
                            if (domesticLogisticsCompany != null) {
                        super.addApiParameter("domestic_logistics_company", domesticLogisticsCompany.toString());
                    }
                            if (domesticLogisticsCompanyId != null) {
                        super.addApiParameter("domestic_logistics_company_id", domesticLogisticsCompanyId.toString());
                    }
                            if (domesticTrackingNo != null) {
                        super.addApiParameter("domestic_tracking_no", domesticTrackingNo.toString());
                    }
                            if (packageNum != null) {
                        super.addApiParameter("package_num", packageNum.toString());
                    }
                            if (tradeOrderFrom != null) {
                        super.addApiParameter("trade_order_from", tradeOrderFrom.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                            if (undeliverableDecision != null) {
                        super.addApiParameter("undeliverable_decision", undeliverableDecision.toString());
                    }
                            if (warehouseCarrierService != null) {
                        super.addApiParameter("warehouse_carrier_service", warehouseCarrierService.toString());
                    }
                            if (addressDTOs != null) {
                        super.addApiParameter("address_d_t_os", new JSONWriter(true, false).write(addressDTOs));
                    }
                            if (invoiceNumber != null) {
                        super.addApiParameter("invoice_number", invoiceNumber.toString());
                    }
                            if (topUserKey != null) {
                        super.addApiParameter("top_user_key", topUserKey.toString());
                    }
                            if (insuranceCoverage != null) {
                        super.addApiParameter("insurance_coverage", new JSONWriter(true, false).write(insuranceCoverage));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsOrderCreateorderResponse> getResponseClass() {
        return AliexpressLogisticsOrderCreateorderResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}