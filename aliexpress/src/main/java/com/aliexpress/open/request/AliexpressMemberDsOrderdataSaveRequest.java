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
*  aliexpress.member.ds.orderdata.save
*/
public class AliexpressMemberDsOrderdataSaveRequest extends BaseGopRequest<AliexpressMemberDsOrderdataSaveResponse> {

    /** DS订单和用户数据 */
    private AliexpressMemberDsOrderdataSaveDserCollectDataDto dserCollectData;

    public AliexpressMemberDsOrderdataSaveDserCollectDataDto getDserCollectData(){
        return this.dserCollectData;
    }
    public void setDserCollectData(AliexpressMemberDsOrderdataSaveDserCollectDataDto dserCollectData){
        this.dserCollectData = dserCollectData;
        }

    @Override
    public String getApiName() {
        return "aliexpress.member.ds.orderdata.save";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (dserCollectData != null) {
                        super.addApiParameter("dser_collect_data", new JSONWriter(true, false).write(dserCollectData));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressMemberDsOrderdataSaveResponse> getResponseClass() {
        return AliexpressMemberDsOrderdataSaveResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}