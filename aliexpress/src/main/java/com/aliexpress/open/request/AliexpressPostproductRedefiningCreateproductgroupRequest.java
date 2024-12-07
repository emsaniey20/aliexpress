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
*  aliexpress.postproduct.redefining.createproductgroup
*/
public class AliexpressPostproductRedefiningCreateproductgroupRequest extends BaseGopRequest<AliexpressPostproductRedefiningCreateproductgroupResponse> {

    /** 分组的名称, 请控制在1～50个英文字符之内。 */
    private String name;
    /** 父分组的ID。如果为0则表示创建根分组，否则创建指定分组下的二级分组。 */
    private Long parentId;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        }
    public Long getParentId(){
        return this.parentId;
    }
    public void setParentId(Long parentId){
        this.parentId = parentId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.createproductgroup";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (name != null) {
                        super.addApiParameter("name", name.toString());
                    }
                            if (parentId != null) {
                        super.addApiParameter("parent_id", parentId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningCreateproductgroupResponse> getResponseClass() {
        return AliexpressPostproductRedefiningCreateproductgroupResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}