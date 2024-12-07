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
*  aliexpress.logistics.abnormalorder.query
*/
public class AliexpressLogisticsAbnormalorderQueryResponse extends IopResponse {

    /** 订单详情 */
        @ApiListField("result")
        private List<AliexpressLogisticsAbnormalorderQueryAeopWarehouseAbnormalOrderResult> result;
    /** 错误描述 */
        @ApiField("error_desc")
        private String errorDesc;
    /** 总页数 */
        @ApiField("total_page")
        private Integer totalPage;
    /** 总条数 */
        @ApiField("total_count")
        private Integer totalCount;
    /** 当前页 */
        @ApiField("current_page")
        private Integer currentPage;
    /** 是否成功 */
        @ApiField("is_success")
        private Boolean isSuccess;

public List<AliexpressLogisticsAbnormalorderQueryAeopWarehouseAbnormalOrderResult> getResult(){
return this.result;
}
public void setResult(List<AliexpressLogisticsAbnormalorderQueryAeopWarehouseAbnormalOrderResult> result){
    this.result = result;
}
public String getErrorDesc(){
return this.errorDesc;
}
public void setErrorDesc(String errorDesc){
    this.errorDesc = errorDesc;
}
public Integer getTotalPage(){
return this.totalPage;
}
public void setTotalPage(Integer totalPage){
    this.totalPage = totalPage;
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
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}

}