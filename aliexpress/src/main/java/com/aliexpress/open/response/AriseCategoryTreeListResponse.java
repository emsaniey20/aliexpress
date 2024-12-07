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
*  arise.category.tree.list
*/
public class AriseCategoryTreeListResponse extends IopResponse {

    /** 类目树数据 */
        @ApiListField("children_category_list")
        private List<AriseCategoryTreeListAriseCategoryDTO> childrenCategoryList;

public List<AriseCategoryTreeListAriseCategoryDTO> getChildrenCategoryList(){
return this.childrenCategoryList;
}
public void setChildrenCategoryList(List<AriseCategoryTreeListAriseCategoryDTO> childrenCategoryList){
    this.childrenCategoryList = childrenCategoryList;
}

}