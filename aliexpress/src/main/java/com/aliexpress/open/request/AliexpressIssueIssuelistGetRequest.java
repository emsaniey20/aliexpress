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
*  aliexpress.issue.issuelist.get
*/
public class AliexpressIssueIssuelistGetRequest extends BaseGopRequest<AliexpressIssueIssuelistGetResponse> {

    /** 详情描述如下 */
    private AliexpressIssueIssuelistGetIssueAPIListQueryDTO queryDto;

    public AliexpressIssueIssuelistGetIssueAPIListQueryDTO getQueryDto(){
        return this.queryDto;
    }
    public void setQueryDto(AliexpressIssueIssuelistGetIssueAPIListQueryDTO queryDto){
        this.queryDto = queryDto;
        }

    @Override
    public String getApiName() {
        return "aliexpress.issue.issuelist.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (queryDto != null) {
                        super.addApiParameter("query_dto", new JSONWriter(true, false).write(queryDto));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressIssueIssuelistGetResponse> getResponseClass() {
        return AliexpressIssueIssuelistGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}