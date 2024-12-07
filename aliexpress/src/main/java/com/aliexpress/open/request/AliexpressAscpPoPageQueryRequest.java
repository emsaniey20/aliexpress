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
*  aliexpress.ascp.po.pageQuery
*/
public class AliexpressAscpPoPageQueryRequest extends BaseGopRequest<AliexpressAscpPoPageQueryResponse> {

    /** 略 */
    private AliexpressAscpPoPageQueryPurchaseOrderPageQueryDTO param0;

    public AliexpressAscpPoPageQueryPurchaseOrderPageQueryDTO getParam0(){
        return this.param0;
    }
    public void setParam0(AliexpressAscpPoPageQueryPurchaseOrderPageQueryDTO param0){
        this.param0 = param0;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ascp.po.pageQuery";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (param0 != null) {
                        super.addApiParameter("param0", new JSONWriter(true, false).write(param0));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressAscpPoPageQueryResponse> getResponseClass() {
        return AliexpressAscpPoPageQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}