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
*  arise.products.list
*/
public class AriseProductsListResponse extends IopResponse {

    /** 总页数 */
        @ApiField("total_page")
        private Integer totalPage;
    /** 每页数量 */
        @ApiField("page_size")
        private Integer pageSize;
    /** 总数 */
        @ApiField("total_count")
        private Integer totalCount;
    /** 当前页号 */
        @ApiField("current_page")
        private Integer currentPage;
    /** 产品信息列表 */
        @ApiListField("product_list")
        private List<AriseProductsListAriseProductSearchApiSingleResultDTO> productList;

public Integer getTotalPage(){
return this.totalPage;
}
public void setTotalPage(Integer totalPage){
    this.totalPage = totalPage;
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
public Integer getCurrentPage(){
return this.currentPage;
}
public void setCurrentPage(Integer currentPage){
    this.currentPage = currentPage;
}
public List<AriseProductsListAriseProductSearchApiSingleResultDTO> getProductList(){
return this.productList;
}
public void setProductList(List<AriseProductsListAriseProductSearchApiSingleResultDTO> productList){
    this.productList = productList;
}

}