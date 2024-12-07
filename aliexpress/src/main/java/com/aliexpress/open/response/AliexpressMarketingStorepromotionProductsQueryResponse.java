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
*  aliexpress.marketing.storepromotion.products.query
*/
public class AliexpressMarketingStorepromotionProductsQueryResponse extends IopResponse {

    /** 页码 */
        @ApiField("page_no")
        private Integer pageNo;
    /** 页大小 */
        @ApiField("page_size")
        private Integer pageSize;
    /** 总数 */
        @ApiField("total_count")
        private Integer totalCount;
    /** 商品列表 */
        @ApiListField("product_list")
        private List<Long> productList;

public Integer getPageNo(){
return this.pageNo;
}
public void setPageNo(Integer pageNo){
    this.pageNo = pageNo;
}
public Integer getPageSize(){
return this.pageSize;
}
public void setPageSize(Integer pageSize){
    this.pageSize = pageSize;
}
public Integer getTotalCount(){
return this.totalCount;
}
public void setTotalCount(Integer totalCount){
    this.totalCount = totalCount;
}
public List<Long> getProductList(){
return this.productList;
}
public void setProductList(List<Long> productList){
    this.productList = productList;
}

}