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
*  aliexpress.photobank.redefining.queryphotobankimagebypaths
*/
public class AliexpressPhotobankRedefiningQueryphotobankimagebypathsRequest extends BaseGopRequest<AliexpressPhotobankRedefiningQueryphotobankimagebypathsResponse> {

    /** 图片文件名，多个文件用逗号分隔 */
    private List<String> paths;

    public List<String> getPaths(){
        return this.paths;
    }
    public void setPaths(List<String> paths){
        this.paths = paths;
        }

    @Override
    public String getApiName() {
        return "aliexpress.photobank.redefining.queryphotobankimagebypaths";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (paths != null) {
                        super.addApiParameter("paths", new JSONWriter(true, false).write(paths));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPhotobankRedefiningQueryphotobankimagebypathsResponse> getResponseClass() {
        return AliexpressPhotobankRedefiningQueryphotobankimagebypathsResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}