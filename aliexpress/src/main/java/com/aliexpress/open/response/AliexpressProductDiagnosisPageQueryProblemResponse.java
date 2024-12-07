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
*  aliexpress.product.diagnosis.pageQueryProblem
*/
public class AliexpressProductDiagnosisPageQueryProblemResponse extends IopResponse {

    /** 请求是否成功 */
        @ApiField("success")
        private Boolean success;
    /** 问题商品列表 */
        @ApiListField("problematic_product_list")
        private List<AliexpressProductDiagnosisPageQueryProblemToBeOptimizedProductDTO> problematicProductList;
    /** 错误信息 */
        @ApiField("error_message")
        private String errorMessage;
    /** 每页查询商品数量 */
        @ApiField("page_size")
        private Integer pageSize;
    /** 错误码 */
        @ApiField("error_code")
        private String errorCode;
    /** 待优化商品总数 */
        @ApiField("total_count")
        private Integer totalCount;
    /** 当前页数 */
        @ApiField("current_page")
        private Integer currentPage;

public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public List<AliexpressProductDiagnosisPageQueryProblemToBeOptimizedProductDTO> getProblematicProductList(){
return this.problematicProductList;
}
public void setProblematicProductList(List<AliexpressProductDiagnosisPageQueryProblemToBeOptimizedProductDTO> problematicProductList){
    this.problematicProductList = problematicProductList;
}
public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public Integer getPageSize(){
return this.pageSize;
}
public void setPageSize(Integer pageSize){
    this.pageSize = pageSize;
}
public String getErrorCode(){
return this.errorCode;
}
public void setErrorCode(String errorCode){
    this.errorCode = errorCode;
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

}