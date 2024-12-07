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
*  global.mediacenter.video.listpage
*/
public class GlobalMediacenterVideoListpageRequest extends BaseGopRequest<GlobalMediacenterVideoListpageResponse> {

    /** 上传视频时自定义的视频名称 */
    private String videoName;
    /** 分页的单页数据量。不能超过50 */
    private Integer pageSize;
    /** 分页页码。从1开始 */
    private Integer currentPage;

    public String getVideoName(){
        return this.videoName;
    }
    public void setVideoName(String videoName){
        this.videoName = videoName;
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
        return "global.mediacenter.video.listpage";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (videoName != null) {
                        super.addApiParameter("video_name", videoName.toString());
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
    public Class<GlobalMediacenterVideoListpageResponse> getResponseClass() {
        return GlobalMediacenterVideoListpageResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}