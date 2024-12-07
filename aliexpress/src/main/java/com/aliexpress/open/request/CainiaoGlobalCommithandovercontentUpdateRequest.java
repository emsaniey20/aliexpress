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
*  cainiao.global.commithandovercontent.update
*/
public class CainiaoGlobalCommithandovercontentUpdateRequest extends BaseGopRequest<CainiaoGlobalCommithandovercontentUpdateResponse> {

    /** 修改参数对象 */
    private CainiaoGlobalCommithandovercontentUpdateOpenHandoverContentUpdateCommitRequest openHandoverContentUpdateCommitRequest;

    public CainiaoGlobalCommithandovercontentUpdateOpenHandoverContentUpdateCommitRequest getOpenHandoverContentUpdateCommitRequest(){
        return this.openHandoverContentUpdateCommitRequest;
    }
    public void setOpenHandoverContentUpdateCommitRequest(CainiaoGlobalCommithandovercontentUpdateOpenHandoverContentUpdateCommitRequest openHandoverContentUpdateCommitRequest){
        this.openHandoverContentUpdateCommitRequest = openHandoverContentUpdateCommitRequest;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.commithandovercontent.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (openHandoverContentUpdateCommitRequest != null) {
                        super.addApiParameter("open_handover_content_update_commit_request", new JSONWriter(true, false).write(openHandoverContentUpdateCommitRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalCommithandovercontentUpdateResponse> getResponseClass() {
        return CainiaoGlobalCommithandovercontentUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}