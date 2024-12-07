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
*  aliexpress.offer.redefining.copysizetemplate
*/
public class AliexpressOfferRedefiningCopysizetemplateRequest extends BaseGopRequest<AliexpressOfferRedefiningCopysizetemplateResponse> {

    /** 被复制的尺码模版ID */
    private Long sizeTemplateId;
    /** 要复制到的目标叶子类目ID */
    private Long targetLeafId;

    public Long getSizeTemplateId(){
        return this.sizeTemplateId;
    }
    public void setSizeTemplateId(Long sizeTemplateId){
        this.sizeTemplateId = sizeTemplateId;
        }
    public Long getTargetLeafId(){
        return this.targetLeafId;
    }
    public void setTargetLeafId(Long targetLeafId){
        this.targetLeafId = targetLeafId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.offer.redefining.copysizetemplate";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sizeTemplateId != null) {
                        super.addApiParameter("size_template_id", sizeTemplateId.toString());
                    }
                            if (targetLeafId != null) {
                        super.addApiParameter("target_leaf_id", targetLeafId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressOfferRedefiningCopysizetemplateResponse> getResponseClass() {
        return AliexpressOfferRedefiningCopysizetemplateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}