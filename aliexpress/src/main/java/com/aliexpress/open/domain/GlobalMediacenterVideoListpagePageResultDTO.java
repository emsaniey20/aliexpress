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

public class GlobalMediacenterVideoListpagePageResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 总页数 */
                @ApiField("total_page")
            private Integer totalPage;
        /** 调用是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 每页数据量 */
                @ApiField("page_size")
            private Integer pageSize;
        /** 查询条件下的图片总数量 */
                @ApiField("total_count")
            private Integer totalCount;
        /** 当前页面。从1开始 */
                @ApiField("current_page")
            private Integer currentPage;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
        /** 视频信息列表 */
                @ApiListField("video_list")
            private List<GlobalMediacenterVideoListpageMediaVideoOpenDTO> videoList;
    
        public Integer getTotalPage() {
    return this.totalPage;
    }
    public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public Integer getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
    }
        public Integer getTotalCount() {
    return this.totalCount;
    }
    public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
    }
        public Integer getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public List<GlobalMediacenterVideoListpageMediaVideoOpenDTO> getVideoList() {
    return this.videoList;
    }
    public void setVideoList(List<GlobalMediacenterVideoListpageMediaVideoOpenDTO> videoList) {
    this.videoList = videoList;
    }
    }