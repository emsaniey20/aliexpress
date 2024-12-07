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
*  aliexpress.product.diagnosis.pageQueryProblem
*/
public class AliexpressProductDiagnosisPageQueryProblemRequest extends BaseGopRequest<AliexpressProductDiagnosisPageQueryProblemResponse> {

    /** 商品的操作状态： 0（待优化） */
    private Integer operateStatus;
    /** 商品问题类型列表，参考查询商家下待优化的商品问题类型列表查询出的问题类型字段。如果为空则默认全部问题类型 */
    private List<String> problemTypeList;
    /** 每页查询商品数量，默认为10 */
    private Integer pageSize;
    /** 当前页数，默认第一页 */
    private Integer currentPage;

    public Integer getOperateStatus(){
        return this.operateStatus;
    }
    public void setOperateStatus(Integer operateStatus){
        this.operateStatus = operateStatus;
        }
    public List<String> getProblemTypeList(){
        return this.problemTypeList;
    }
    public void setProblemTypeList(List<String> problemTypeList){
        this.problemTypeList = problemTypeList;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public Integer getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage){
        this.currentPage = currentPage;
        }

    @Override
    public String getApiName() {
        return "aliexpress.product.diagnosis.pageQueryProblem";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (operateStatus != null) {
                        super.addApiParameter("operate_status", operateStatus.toString());
                    }
                            if (problemTypeList != null) {
                        super.addApiParameter("problem_type_list", new JSONWriter(true, false).write(problemTypeList));
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressProductDiagnosisPageQueryProblemResponse> getResponseClass() {
        return AliexpressProductDiagnosisPageQueryProblemResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}