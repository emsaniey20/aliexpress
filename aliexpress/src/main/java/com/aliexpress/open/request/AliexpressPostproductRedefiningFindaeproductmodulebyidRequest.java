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
*  aliexpress.postproduct.redefining.findaeproductmodulebyid
*/
public class AliexpressPostproductRedefiningFindaeproductmodulebyidRequest extends BaseGopRequest<AliexpressPostproductRedefiningFindaeproductmodulebyidResponse> {

    /** moduleId 对应商品详情中的kse标签中的id属性;如: id="1004" */
    private Long moduleId;

    public Long getModuleId(){
        return this.moduleId;
    }
    public void setModuleId(Long moduleId){
        this.moduleId = moduleId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.findaeproductmodulebyid";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (moduleId != null) {
                        super.addApiParameter("module_id", moduleId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningFindaeproductmodulebyidResponse> getResponseClass() {
        return AliexpressPostproductRedefiningFindaeproductmodulebyidResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}