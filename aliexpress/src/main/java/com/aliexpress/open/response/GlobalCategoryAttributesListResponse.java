package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  global.category.attributes.list
*/
public class GlobalCategoryAttributesListResponse extends IopResponse {

    /** 成功失败 */
        @ApiField("success")
        private Boolean success;
    /** 商品属性列表 */
        @ApiListField("attribute_list")
        private List<GlobalCategoryAttributesListCspAttributeDTO> attributeList;

public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public List<GlobalCategoryAttributesListCspAttributeDTO> getAttributeList(){
return this.attributeList;
}
public void setAttributeList(List<GlobalCategoryAttributesListCspAttributeDTO> attributeList){
    this.attributeList = attributeList;
}

}