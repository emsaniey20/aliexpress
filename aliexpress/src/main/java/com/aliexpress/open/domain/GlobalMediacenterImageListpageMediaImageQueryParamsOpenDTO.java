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

public class GlobalMediacenterImageListpageMediaImageQueryParamsOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 分页的单页数据量。不能超过50 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 分页页码。从1开始 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 文件夹id，必须大于等于0。0表示根文件夹 */
                @ApiField("folder_id")
            private Long folderId;
    
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public Long getFolderId() {
    return this.folderId;
    }
    public void setFolderId(Long folderId) {
    this.folderId = folderId;
    }
    }