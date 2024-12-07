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

public class AriseProductQueryMultimedia implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 视频模块 */
                @ApiListField("video_list")
            private List<AriseProductQueryVideo> videoList;
        /** 营销图模块 */
                @ApiListField("market_image_list")
            private List<AriseProductQueryProductMarketImage> marketImageList;
        /** 主图url集合 ["URL1","url2"] */
                @ApiListField("main_image_list")
            private List<String> mainImageList;
    
        public List<AriseProductQueryVideo> getVideoList() {
    return this.videoList;
    }
    public void setVideoList(List<AriseProductQueryVideo> videoList) {
    this.videoList = videoList;
    }
        public List<AriseProductQueryProductMarketImage> getMarketImageList() {
    return this.marketImageList;
    }
    public void setMarketImageList(List<AriseProductQueryProductMarketImage> marketImageList) {
    this.marketImageList = marketImageList;
    }
        public List<String> getMainImageList() {
    return this.mainImageList;
    }
    public void setMainImageList(List<String> mainImageList) {
    this.mainImageList = mainImageList;
    }
    }