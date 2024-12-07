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
*  /lh/test/fourth/api
*/
public class LhTestFourthApiRequest extends BaseGopRequest<LhTestFourthApiResponse> {

    /** 测试ID */
    private Long id;

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
        }

    @Override
    public String getApiName() {
        return "/lh/test/fourth/api";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (id != null) {
                        super.addApiParameter("id", id.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<LhTestFourthApiResponse> getResponseClass() {
        return LhTestFourthApiResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}