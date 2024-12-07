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

public class AliexpressOfferProductQueryMarketImage implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 营销图片URL */
                @ApiField("url")
            private String url;
        /** 1：代表长图，大小为750*1000;	2：代表方图，大小为800*800 */
                @ApiField("image_type")
            private Integer imageType;
    
        public String getUrl() {
    return this.url;
    }
    public void setUrl(String url) {
    this.url = url;
    }
        public Integer getImageType() {
    return this.imageType;
    }
    public void setImageType(Integer imageType) {
    this.imageType = imageType;
    }
    }