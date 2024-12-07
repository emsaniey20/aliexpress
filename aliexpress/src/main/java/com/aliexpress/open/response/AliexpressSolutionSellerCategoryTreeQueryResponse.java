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
*  aliexpress.solution.seller.category.tree.query
*/
public class AliexpressSolutionSellerCategoryTreeQueryResponse extends IopResponse {

    /** children category list under category_id */
        @ApiListField("children_category_list")
        private List<AliexpressSolutionSellerCategoryTreeQueryAeopPostCategoryDTO> childrenCategoryList;
    /** whether success or not */
        @ApiField("is_success")
        private Boolean isSuccess;

public List<AliexpressSolutionSellerCategoryTreeQueryAeopPostCategoryDTO> getChildrenCategoryList(){
return this.childrenCategoryList;
}
public void setChildrenCategoryList(List<AliexpressSolutionSellerCategoryTreeQueryAeopPostCategoryDTO> childrenCategoryList){
    this.childrenCategoryList = childrenCategoryList;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}

}