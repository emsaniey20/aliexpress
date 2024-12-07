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
*  aliexpress.category.tree.list
*/
public class AliexpressCategoryTreeListResponse extends IopResponse {

    /** 返回的子类目信息 */
        @ApiListField("aeop_post_category_list")
        private List<AliexpressCategoryTreeListAeopPostCategoryDTO> aeopPostCategoryList;
    /** 请求成功 */
        @ApiField("success")
        private String success;

public List<AliexpressCategoryTreeListAeopPostCategoryDTO> getAeopPostCategoryList(){
return this.aeopPostCategoryList;
}
public void setAeopPostCategoryList(List<AliexpressCategoryTreeListAeopPostCategoryDTO> aeopPostCategoryList){
    this.aeopPostCategoryList = aeopPostCategoryList;
}
public String getSuccess(){
return this.success;
}
public void setSuccess(String success){
    this.success = success;
}

}