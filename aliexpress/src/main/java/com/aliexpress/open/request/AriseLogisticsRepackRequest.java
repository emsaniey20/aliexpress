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
*  arise.logistics.repack
*/
public class AriseLogisticsRepackRequest extends BaseGopRequest<AriseLogisticsRepackResponse> {

    /** 作废包裹请求 */
    private AriseLogisticsRepackRepackApiRequestDTO repackRequest;

    public AriseLogisticsRepackRepackApiRequestDTO getRepackRequest(){
        return this.repackRequest;
    }
    public void setRepackRequest(AriseLogisticsRepackRepackApiRequestDTO repackRequest){
        this.repackRequest = repackRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.repack";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (repackRequest != null) {
                        super.addApiParameter("repack_request", new JSONWriter(true, false).write(repackRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AriseLogisticsRepackResponse> getResponseClass() {
        return AriseLogisticsRepackResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}