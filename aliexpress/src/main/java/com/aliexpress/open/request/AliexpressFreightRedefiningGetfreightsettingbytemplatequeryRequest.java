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
*  aliexpress.freight.redefining.getfreightsettingbytemplatequery
*/
public class AliexpressFreightRedefiningGetfreightsettingbytemplatequeryRequest extends BaseGopRequest<AliexpressFreightRedefiningGetfreightsettingbytemplatequeryResponse> {

    /** Template id */
    private Long templateId;

    public Long getTemplateId(){
        return this.templateId;
    }
    public void setTemplateId(Long templateId){
        this.templateId = templateId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.freight.redefining.getfreightsettingbytemplatequery";
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
    public Class<AliexpressFreightRedefiningGetfreightsettingbytemplatequeryResponse> getResponseClass() {
        return AliexpressFreightRedefiningGetfreightsettingbytemplatequeryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}