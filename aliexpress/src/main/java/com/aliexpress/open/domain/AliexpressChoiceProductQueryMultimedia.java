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

public class AliexpressChoiceProductQueryMultimedia implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 多媒体信息。 */
                @ApiListField("video_list")
            private List<AliexpressChoiceProductQueryVideo> videoList;
        /** 营销图列表 */
                @ApiListField("market_image_list")
            private List<AliexpressChoiceProductQueryProductMarketImage> marketImageList;
        /** 商品主图列表 */
                @ApiListField("main_image_list")
            private List<String> mainImageList;
    
        public List<AliexpressChoiceProductQueryVideo> getVideoList() {
    return this.videoList;
    }
    public void setVideoList(List<AliexpressChoiceProductQueryVideo> videoList) {
    this.videoList = videoList;
    }
        public List<AliexpressChoiceProductQueryProductMarketImage> getMarketImageList() {
    return this.marketImageList;
    }
    public void setMarketImageList(List<AliexpressChoiceProductQueryProductMarketImage> marketImageList) {
    this.marketImageList = marketImageList;
    }
        public List<String> getMainImageList() {
    return this.mainImageList;
    }
    public void setMainImageList(List<String> mainImageList) {
    this.mainImageList = mainImageList;
    }
    }