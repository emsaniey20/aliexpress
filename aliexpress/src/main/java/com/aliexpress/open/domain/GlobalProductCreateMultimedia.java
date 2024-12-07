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

public class GlobalProductCreateMultimedia implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 视频模块 */
                @ApiListField("video_list")
            private List<GlobalProductCreateVideo> videoList;
        /** 营销图模块 */
                @ApiListField("market_image_list")
            private List<GlobalProductCreateProductMarketImage> marketImageList;
        /** 主图url集合 */
                @ApiListField("main_image_list")
            private List<String> mainImageList;
    
        public List<GlobalProductCreateVideo> getVideoList() {
    return this.videoList;
    }
    public void setVideoList(List<GlobalProductCreateVideo> videoList) {
    this.videoList = videoList;
    }
        public List<GlobalProductCreateProductMarketImage> getMarketImageList() {
    return this.marketImageList;
    }
    public void setMarketImageList(List<GlobalProductCreateProductMarketImage> marketImageList) {
    this.marketImageList = marketImageList;
    }
        public List<String> getMainImageList() {
    return this.mainImageList;
    }
    public void setMainImageList(List<String> mainImageList) {
    this.mainImageList = mainImageList;
    }
    }