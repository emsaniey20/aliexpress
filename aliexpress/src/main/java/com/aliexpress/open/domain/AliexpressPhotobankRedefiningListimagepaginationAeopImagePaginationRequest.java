package com.aliexpress.open.domain;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressPhotobankRedefiningListimagepaginationAeopImagePaginationRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 当前页码 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 图片组id */
                @ApiField("group_id")
            private String groupId;
        /** 图片存放位置.可选值:allGroup(所有分组), temp(被禁用的图片), subGroup(某一分组), unGroup(非分组). 如果locationType参数值为allGroup,temp,unGroup时，将忽略groupId参数。 如果locationType的参数值为subGroup,须指定groupId参数。 */
                @ApiField("location_type")
            private String locationType;
        /** 默认18个，最大值 50 */
                @ApiField("page_size")
            private Integer pageSize;
    
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public String getGroupId() {
    return this.groupId;
    }
    public void setGroupId(String groupId) {
    this.groupId = groupId;
    }
        public String getLocationType() {
    return this.locationType;
    }
    public void setLocationType(String locationType) {
    this.locationType = locationType;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
    }