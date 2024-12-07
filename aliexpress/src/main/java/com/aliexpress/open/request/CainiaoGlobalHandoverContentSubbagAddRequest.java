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
*  cainiao.global.handover.content.subbag.add
*/
public class CainiaoGlobalHandoverContentSubbagAddRequest extends BaseGopRequest<CainiaoGlobalHandoverContentSubbagAddResponse> {

    /** 用户信息 */
    private String userInfo;
    /** 批次约揽订单号 */
    private String orderCode;
    /** 批次追加大包数，单次不超过30个，总的不超过50个 */
    private Integer addSubbagQuantity;
    /** 多语言 */
    private String locale;

    public String getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(String userInfo){
        this.userInfo = userInfo;
        }
    public String getOrderCode(){
        return this.orderCode;
    }
    public void setOrderCode(String orderCode){
        this.orderCode = orderCode;
        }
    public Integer getAddSubbagQuantity(){
        return this.addSubbagQuantity;
    }
    public void setAddSubbagQuantity(Integer addSubbagQuantity){
        this.addSubbagQuantity = addSubbagQuantity;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.handover.content.subbag.add";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (userInfo != null) {
                        super.addApiParameter("user_info", userInfo.toString());
                    }
                            if (orderCode != null) {
                        super.addApiParameter("order_code", orderCode.toString());
                    }
                            if (addSubbagQuantity != null) {
                        super.addApiParameter("add_subbag_quantity", addSubbagQuantity.toString());
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
    public Class<CainiaoGlobalHandoverContentSubbagAddResponse> getResponseClass() {
        return CainiaoGlobalHandoverContentSubbagAddResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}