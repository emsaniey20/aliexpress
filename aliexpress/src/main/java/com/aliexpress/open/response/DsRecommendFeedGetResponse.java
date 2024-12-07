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
*  /ds/recommend/feed/get
*/
public class DsRecommendFeedGetResponse extends IopResponse {

    /** total record count */
        @ApiField("total_record_count")
        private Integer totalRecordCount;
    /** current record count */
        @ApiField("current_record_count")
        private Integer currentRecordCount;
    /** is finished */
        @ApiField("is_finished")
        private Boolean isFinished;
    /** total page number */
        @ApiField("total_page_no")
        private String totalPageNo;
    /** count page number */
        @ApiField("current_page_no")
        private String currentPageNo;
    /** Product list */
        @ApiListField("products")
        private List<DsRecommendFeedGetTrafficProductDTO> products;

public Integer getTotalRecordCount(){
return this.totalRecordCount;
}
public void setTotalRecordCount(Integer totalRecordCount){
    this.totalRecordCount = totalRecordCount;
}
public Integer getCurrentRecordCount(){
return this.currentRecordCount;
}
public void setCurrentRecordCount(Integer currentRecordCount){
    this.currentRecordCount = currentRecordCount;
}
public Boolean getIsFinished(){
return this.isFinished;
}
public void setIsFinished(Boolean isFinished){
    this.isFinished = isFinished;
}
public String getTotalPageNo(){
return this.totalPageNo;
}
public void setTotalPageNo(String totalPageNo){
    this.totalPageNo = totalPageNo;
}
public String getCurrentPageNo(){
return this.currentPageNo;
}
public void setCurrentPageNo(String currentPageNo){
    this.currentPageNo = currentPageNo;
}
public List<DsRecommendFeedGetTrafficProductDTO> getProducts(){
return this.products;
}
public void setProducts(List<DsRecommendFeedGetTrafficProductDTO> products){
    this.products = products;
}

}