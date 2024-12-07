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

public class AiVirtualModelGenerationQueryImageGenClothesResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 生成图片宽度 */
                @ApiField("width")
            private Integer width;
        /** 生成图片URL */
                @ApiField("url")
            private String url;
        /** 生成图片高度 */
                @ApiField("height")
            private Integer height;
    
        public Integer getWidth() {
    return this.width;
    }
    public void setWidth(Integer width) {
    this.width = width;
    }
        public String getUrl() {
    return this.url;
    }
    public void setUrl(String url) {
    this.url = url;
    }
        public Integer getHeight() {
    return this.height;
    }
    public void setHeight(Integer height) {
    this.height = height;
    }
    }