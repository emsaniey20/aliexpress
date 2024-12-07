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
*  aliexpress.postproduct.redefining.querypromisetemplatebyid
*/
public class AliexpressPostproductRedefiningQuerypromisetemplatebyidRequest extends BaseGopRequest<AliexpressPostproductRedefiningQuerypromisetemplatebyidResponse> {

    /** 输入服务模板编号。注：输入为-1时，获取所有服务模板列表。 */
    private Long templateId;

    public Long getTemplateId(){
        return this.templateId;
    }
    public void setTemplateId(Long templateId){
        this.templateId = templateId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.querypromisetemplatebyid";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (templateId != null) {
                        super.addApiParameter("template_id", templateId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningQuerypromisetemplatebyidResponse> getResponseClass() {
        return AliexpressPostproductRedefiningQuerypromisetemplatebyidResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}