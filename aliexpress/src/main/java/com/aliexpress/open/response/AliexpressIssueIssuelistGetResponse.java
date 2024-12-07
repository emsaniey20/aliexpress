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
*  aliexpress.issue.issuelist.get
*/
public class AliexpressIssueIssuelistGetResponse extends IopResponse {

    /** 当前页 */
        @ApiField("current_page")
        private Integer currentPage;
    /** dataList */
        @ApiListField("data_list")
        private List<AliexpressIssueIssuelistGetIssueAPIIssueDTO> dataList;
    /** 每页条数 */
        @ApiField("page_size")
        private Integer pageSize;
    /** 总记录数 */
        @ApiField("total_item")
        private Integer totalItem;

public Integer getCurrentPage(){
return this.currentPage;
}
public void setCurrentPage(Integer currentPage){
    this.currentPage = currentPage;
}
public List<AliexpressIssueIssuelistGetIssueAPIIssueDTO> getDataList(){
return this.dataList;
}
public void setDataList(List<AliexpressIssueIssuelistGetIssueAPIIssueDTO> dataList){
    this.dataList = dataList;
}
public Integer getPageSize(){
return this.pageSize;
}
public void setPageSize(Integer pageSize){
    this.pageSize = pageSize;
}
public Integer getTotalItem(){
return this.totalItem;
}
public void setTotalItem(Integer totalItem){
    this.totalItem = totalItem;
}

}