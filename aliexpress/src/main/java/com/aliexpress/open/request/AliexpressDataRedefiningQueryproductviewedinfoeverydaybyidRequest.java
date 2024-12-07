package com.aliexpress.open.request;

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
import com.aliexpress.open.domain.*;
import com.aliexpress.open.response.*;


/**
*  aliexpress.data.redefining.queryproductviewedinfoeverydaybyid
*/
public class AliexpressDataRedefiningQueryproductviewedinfoeverydaybyidRequest extends BaseGopRequest<AliexpressDataRedefiningQueryproductviewedinfoeverydaybyidResponse> {

    /** 当前页码 */
    private Integer currentPage;
    /** 查询时间段的截止时间。例如：yyyy-mm-dd */
    private String endDate;
    /** 每页结果数量，默认20个，最大值 50 */
    private Integer pageSize;
    /** 商品id */
    private String productId;
    /** 查询时间段的开始时间。例如：yyyy-mm-dd */
    private String startDate;

    public Integer getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage){
        this.currentPage = currentPage;
        }
    public String getEndDate(){
        return this.endDate;
    }
    public void setEndDate(String endDate){
        this.endDate = endDate;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public String getProductId(){
        return this.productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
        }
    public String getStartDate(){
        return this.startDate;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
        }

    @Override
    public String getApiName() {
        return "aliexpress.data.redefining.queryproductviewedinfoeverydaybyid";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                            if (endDate != null) {
                        super.addApiParameter("end_date", endDate.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (startDate != null) {
                        super.addApiParameter("start_date", startDate.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressDataRedefiningQueryproductviewedinfoeverydaybyidResponse> getResponseClass() {
        return AliexpressDataRedefiningQueryproductviewedinfoeverydaybyidResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}