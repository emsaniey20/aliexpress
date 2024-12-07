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
*  cainiao.global.handover.update
*/
public class CainiaoGlobalHandoverUpdateRequest extends BaseGopRequest<CainiaoGlobalHandoverUpdateResponse> {

    /** 重量单位，克:g, 千克:kg，默认g */
    private String weightUnit;
    /** 大包重量 */
    private Long weight;
    /** 交接单id */
    private Long handoverOrderId;
    /** 用户信息 */
    private CainiaoGlobalHandoverUpdateUserInfoDTO userInfo;
    /** 大包备注 */
    private String remark;
    /** 退件信息 */
    private CainiaoGlobalHandoverUpdateReturnerDTO returnInfo;
    /** 揽收信息 */
    private CainiaoGlobalHandoverUpdatePickupDTO pickupInfo;
    /** 要创建交接单的小包编码集合，数量上限200 */
    private List<String> orderCodeList;
    /** 交接单类型，菜鸟揽收(cainiao_pickup)或自寄(self_post)，默认菜鸟揽收 */
    private String type;
    /** ISV名称，ISV：ISV-ISV英文或拼音名称、商家ERP：SELLER-商家英文或拼音名称 */
    private String client;
    /** 多语言 */
    private String locale;

    public String getWeightUnit(){
        return this.weightUnit;
    }
    public void setWeightUnit(String weightUnit){
        this.weightUnit = weightUnit;
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
    public CainiaoGlobalHandoverUpdateUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalHandoverUpdateUserInfoDTO userInfo){
        this.userInfo = userInfo;
        }
    public String getRemark(){
        return this.remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
        }
    public CainiaoGlobalHandoverUpdateReturnerDTO getReturnInfo(){
        return this.returnInfo;
    }
    public void setReturnInfo(CainiaoGlobalHandoverUpdateReturnerDTO returnInfo){
        this.returnInfo = returnInfo;
        }
    public CainiaoGlobalHandoverUpdatePickupDTO getPickupInfo(){
        return this.pickupInfo;
    }
    public void setPickupInfo(CainiaoGlobalHandoverUpdatePickupDTO pickupInfo){
        this.pickupInfo = pickupInfo;
        }
    public List<String> getOrderCodeList(){
        return this.orderCodeList;
    }
    public void setOrderCodeList(List<String> orderCodeList){
        this.orderCodeList = orderCodeList;
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

    @Override
    public String getApiName() {
        return "cainiao.global.handover.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (weightUnit != null) {
                        super.addApiParameter("weight_unit", weightUnit.toString());
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
                            if (type != null) {
                        super.addApiParameter("type", type.toString());
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
    public Class<CainiaoGlobalHandoverUpdateResponse> getResponseClass() {
        return CainiaoGlobalHandoverUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}