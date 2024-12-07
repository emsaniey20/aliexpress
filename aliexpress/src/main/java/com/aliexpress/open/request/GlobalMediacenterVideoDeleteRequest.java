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
*  global.mediacenter.video.delete
*/
public class GlobalMediacenterVideoDeleteRequest extends BaseGopRequest<GlobalMediacenterVideoDeleteResponse> {

    /** 媒体中心视频id。用于管理媒体中心的视频文件 */
    private Long id;

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.video.delete";
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
    public Class<GlobalMediacenterVideoDeleteResponse> getResponseClass() {
        return GlobalMediacenterVideoDeleteResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}