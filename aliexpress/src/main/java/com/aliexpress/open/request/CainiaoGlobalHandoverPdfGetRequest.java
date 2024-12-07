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
*  cainiao.global.handover.pdf.get
*/
public class CainiaoGlobalHandoverPdfGetRequest extends BaseGopRequest<CainiaoGlobalHandoverPdfGetResponse> {

    /** 用户信息 */
    private CainiaoGlobalHandoverPdfGetUserInfoDTO userInfo;
    /** 客户端名称，ISV：ISV-ISV英文或拼音名称、商家ERP：SELLER-商家英文或拼音名称 */
    private String client;
    /** 多语言 */
    private String locale;
    /** 大包编号id */
    private Long handoverContentId;
    /** 打印数据类型，1：面单、4：发货标签、512：交接清单 */
    private Integer type;

    public CainiaoGlobalHandoverPdfGetUserInfoDTO getUserInfo(){
        return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalHandoverPdfGetUserInfoDTO userInfo){
        this.userInfo = userInfo;
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
    public Long getHandoverContentId(){
        return this.handoverContentId;
    }
    public void setHandoverContentId(Long handoverContentId){
        this.handoverContentId = handoverContentId;
        }
    public Integer getType(){
        return this.type;
    }
    public void setType(Integer type){
        this.type = type;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.handover.pdf.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (userInfo != null) {
                        super.addApiParameter("user_info", new JSONWriter(true, false).write(userInfo));
                    }
                            if (client != null) {
                        super.addApiParameter("client", client.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (handoverContentId != null) {
                        super.addApiParameter("handover_content_id", handoverContentId.toString());
                    }
                            if (type != null) {
                        super.addApiParameter("type", type.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalHandoverPdfGetResponse> getResponseClass() {
        return CainiaoGlobalHandoverPdfGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}