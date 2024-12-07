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
*  cainiao.global.pickup.resource.recommend
*/
public class CainiaoGlobalPickupResourceRecommendRequest extends BaseGopRequest<CainiaoGlobalPickupResourceRecommendResponse> {

    /** 解决方案编码 */
    private String solutionCode;
    /** 发货方式：上门揽收DOOR_PICKUP, 自寄SELF_POST, 自送SELF_SEND */
    private String pickupType;
    /** 揽收地址 */
    private CainiaoGlobalPickupResourceRecommendPickupDTO pickupInfo;
    /** 登陆信息 */
    private CainiaoGlobalPickupResourceRecommendUserInfoDTO userInfo;

    public String getSolutionCode(){
        return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode){
        this.solutionCode = solutionCode;
        }
    public String getPickupType(){
        return this.pickupType;
    }
    public void setPickupType(String pickupType){
        this.pickupType = pickupType;
        }
    public CainiaoGlobalPickupResourceRecommendPickupDTO getPickupInfo(){
        return this.pickupInfo;
    }
    public void setPickupInfo(CainiaoGlobalPickupResourceRecommendPickupDTO pickupInfo){
        this.pickupInfo = pickupInfo;
        }
    public CainiaoGlobalPickupResourceRecommendUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalPickupResourceRecommendUserInfoDTO userInfo){
        this.userInfo = userInfo;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.pickup.resource.recommend";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (solutionCode != null) {
                        super.addApiParameter("solution_code", solutionCode.toString());
                    }
                            if (pickupType != null) {
                        super.addApiParameter("pickup_type", pickupType.toString());
                    }
                            if (pickupInfo != null) {
                        super.addApiParameter("pickup_info", new JSONWriter(true, false).write(pickupInfo));
                    }
                            if (userInfo != null) {
                        super.addApiParameter("user_info", new JSONWriter(true, false).write(userInfo));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalPickupResourceRecommendResponse> getResponseClass() {
        return CainiaoGlobalPickupResourceRecommendResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}