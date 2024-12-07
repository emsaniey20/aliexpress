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
*  aliexpress.solution.product.category.suggest
*/
public class AliexpressSolutionProductCategorySuggestResponse extends IopResponse {

    /**  */
        @ApiListField("suggest_category_list")
        private List<AliexpressSolutionProductCategorySuggestCategorySuggestDTO> suggestCategoryList;

public List<AliexpressSolutionProductCategorySuggestCategorySuggestDTO> getSuggestCategoryList(){
return this.suggestCategoryList;
}
public void setSuggestCategoryList(List<AliexpressSolutionProductCategorySuggestCategorySuggestDTO> suggestCategoryList){
    this.suggestCategoryList = suggestCategoryList;
}

}