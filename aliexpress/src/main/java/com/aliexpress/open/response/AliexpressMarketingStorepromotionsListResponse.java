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
*  aliexpress.marketing.storepromotions.list
*/
public class AliexpressMarketingStorepromotionsListResponse extends IopResponse {

    /** 当前页码 */
        @ApiField("current_page")
        private Integer currentPage;
    /** 页大小 */
        @ApiField("page_size")
        private Integer pageSize;
    /** 总记录数 */
        @ApiField("total_count")
        private Integer totalCount;
    /** 出参集合 */
        @ApiListField("data_list")
        private List<AliexpressMarketingStorepromotionsListPromotionSimpleInfoDTO> dataList;

public Integer getCurrentPage(){
return this.currentPage;
}
public void setCurrentPage(Integer currentPage){
    this.currentPage = currentPage;
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
public List<AliexpressMarketingStorepromotionsListPromotionSimpleInfoDTO> getDataList(){
return this.dataList;
}
public void setDataList(List<AliexpressMarketingStorepromotionsListPromotionSimpleInfoDTO> dataList){
    this.dataList = dataList;
}

}