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
*  aliexpress.postproduct.redefining.findaeproductdetailmodulelistbyqurey
*/
public class AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyRequest extends BaseGopRequest<AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyResponse> {

    /** 要查询模块的状态，包含：tbd(审核不通过),auditing（审核中）,approved（审核通过） */
    private String moduleStatus;
    /** 要查询模块的类型，包含：custom（自定义模块）,relation（关联模块） */
    private String type;
    /** 要查询当前页码，每页返回50条记录，从1开始 */
    private Integer pageIndex;

    public String getModuleStatus(){
        return this.moduleStatus;
    }
    public void setModuleStatus(String moduleStatus){
        this.moduleStatus = moduleStatus;
        }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
        }
    public Integer getPageIndex(){
        return this.pageIndex;
    }
    public void setPageIndex(Integer pageIndex){
        this.pageIndex = pageIndex;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.findaeproductdetailmodulelistbyqurey";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (moduleStatus != null) {
                        super.addApiParameter("module_status", moduleStatus.toString());
                    }
                            if (type != null) {
                        super.addApiParameter("type", type.toString());
                    }
                            if (pageIndex != null) {
                        super.addApiParameter("page_index", pageIndex.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyResponse> getResponseClass() {
        return AliexpressPostproductRedefiningFindaeproductdetailmodulelistbyqureyResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}