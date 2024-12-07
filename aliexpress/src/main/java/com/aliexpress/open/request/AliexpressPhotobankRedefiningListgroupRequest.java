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
*  aliexpress.photobank.redefining.listgroup
*/
public class AliexpressPhotobankRedefiningListgroupRequest extends BaseGopRequest<AliexpressPhotobankRedefiningListgroupResponse> {

    /** 图片组ID。不填groupId则返回所有图片组信息 */
    private String groupId;

    public String getGroupId(){
        return this.groupId;
    }
    public void setGroupId(String groupId){
        this.groupId = groupId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.photobank.redefining.listgroup";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (groupId != null) {
                        super.addApiParameter("group_id", groupId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressPhotobankRedefiningListgroupResponse> getResponseClass() {
        return AliexpressPhotobankRedefiningListgroupResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}