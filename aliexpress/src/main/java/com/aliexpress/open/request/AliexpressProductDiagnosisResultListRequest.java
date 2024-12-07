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
*  aliexpress.product.diagnosis.result.list
*/
public class AliexpressProductDiagnosisResultListRequest extends BaseGopRequest<AliexpressProductDiagnosisResultListResponse> {

    /** 当前页数 */
    private Long current;
    /**  每页已优化商品数量，默认是10 */
    private Long pageSize;

    public Long getCurrent(){
        return this.current;
    }
    public void setCurrent(Long current){
        this.current = current;
        }
    public Long getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Long pageSize){
        this.pageSize = pageSize;
        }

    @Override
    public String getApiName() {
        return "aliexpress.product.diagnosis.result.list";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (current != null) {
                        super.addApiParameter("current", current.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressProductDiagnosisResultListResponse> getResponseClass() {
        return AliexpressProductDiagnosisResultListResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}