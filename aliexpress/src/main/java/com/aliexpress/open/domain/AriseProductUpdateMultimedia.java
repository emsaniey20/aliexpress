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

public class AriseProductUpdateMultimedia implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 视频模块 */
                @ApiListField("video_list")
            private List<AriseProductUpdateVideo> videoList;
        /** 营销图模块 */
                @ApiListField("market_image_list")
            private List<AriseProductUpdateProductMarketImage> marketImageList;
        /** 主图url集合 */
                @ApiListField("main_image_list")
            private List<String> mainImageList;
    
        public List<AriseProductUpdateVideo> getVideoList() {
    return this.videoList;
    }
    public void setVideoList(List<AriseProductUpdateVideo> videoList) {
    this.videoList = videoList;
    }
        public List<AriseProductUpdateProductMarketImage> getMarketImageList() {
    return this.marketImageList;
    }
    public void setMarketImageList(List<AriseProductUpdateProductMarketImage> marketImageList) {
    this.marketImageList = marketImageList;
    }
        public List<String> getMainImageList() {
    return this.mainImageList;
    }
    public void setMainImageList(List<String> mainImageList) {
    this.mainImageList = mainImageList;
    }
    }