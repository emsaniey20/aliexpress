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
*  cainiao.global.handover.savedraft
*/
public class CainiaoGlobalHandoverSavedraftRequest extends BaseGopRequest<CainiaoGlobalHandoverSavedraftResponse> {

    /** 用户信息 */
    private CainiaoGlobalHandoverSavedraftUserInfoDTO userInfo;
    /** 大包重量 */
    private Long weight;
    /** 重量单位，克:g, 千克:kg，默认g */
    private String weightUnit;
    /** 需要组装大包的小包编码集合，最多限制200个小包 */
    private List<String> orderCodeList;
    /** 揽收信息 */
    private CainiaoGlobalHandoverSavedraftPickupDTO pickupInfo;
    /** 退件信息 */
    private CainiaoGlobalHandoverSavedraftReturnerDTO returnInfo;
    /** 备注 */
    private String remark;
    /** 客户端名称，ISV：ISV-ISV英文或拼音名称、商家ERP：SELLER-商家英文或拼音名称 */
    private String client;
    /** 多语言 */
    private String locale;

    public CainiaoGlobalHandoverSavedraftUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalHandoverSavedraftUserInfoDTO userInfo){
        this.userInfo = userInfo;
        }
    public Long getWeight(){
        return this.weight;
    }
    public void setWeight(Long weight){
        this.weight = weight;
        }
    public String getWeightUnit(){
        return this.weightUnit;
    }
    public void setWeightUnit(String weightUnit){
        this.weightUnit = weightUnit;
        }
    public List<String> getOrderCodeList(){
        return this.orderCodeList;
    }
    public void setOrderCodeList(List<String> orderCodeList){
        this.orderCodeList = orderCodeList;
        }
    public CainiaoGlobalHandoverSavedraftPickupDTO getPickupInfo(){
        return this.pickupInfo;
    }
    public void setPickupInfo(CainiaoGlobalHandoverSavedraftPickupDTO pickupInfo){
        this.pickupInfo = pickupInfo;
        }
    public CainiaoGlobalHandoverSavedraftReturnerDTO getReturnInfo(){
        return this.returnInfo;
    }
    public void setReturnInfo(CainiaoGlobalHandoverSavedraftReturnerDTO returnInfo){
        this.returnInfo = returnInfo;
        }
    public String getRemark(){
        return this.remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
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
        return "cainiao.global.handover.savedraft";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (userInfo != null) {
                        super.addApiParameter("user_info", new JSONWriter(true, false).write(userInfo));
                    }
                            if (weight != null) {
                        super.addApiParameter("weight", weight.toString());
                    }
                            if (weightUnit != null) {
                        super.addApiParameter("weight_unit", weightUnit.toString());
                    }
                            if (orderCodeList != null) {
                        super.addApiParameter("order_code_list", new JSONWriter(true, false).write(orderCodeList));
                    }
                            if (pickupInfo != null) {
                        super.addApiParameter("pickup_info", new JSONWriter(true, false).write(pickupInfo));
                    }
                            if (returnInfo != null) {
                        super.addApiParameter("return_info", new JSONWriter(true, false).write(returnInfo));
                    }
                            if (remark != null) {
                        super.addApiParameter("remark", remark.toString());
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
    public Class<CainiaoGlobalHandoverSavedraftResponse> getResponseClass() {
        return CainiaoGlobalHandoverSavedraftResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}