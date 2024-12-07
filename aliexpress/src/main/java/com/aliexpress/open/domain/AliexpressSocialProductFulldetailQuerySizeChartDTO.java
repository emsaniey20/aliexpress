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

public class AliexpressSocialProductFulldetailQuerySizeChartDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** if has size info */
                @ApiField("has_size_info")
            private Boolean hasSizeInfo;
        /** url for size info */
                @ApiField("size_info_url")
            private String sizeInfoUrl;
        /** size title */
                @ApiField("title")
            private String title;
    
        public Boolean getHasSizeInfo() {
    return this.hasSizeInfo;
    }
    public void setHasSizeInfo(Boolean hasSizeInfo) {
    this.hasSizeInfo = hasSizeInfo;
    }
        public String getSizeInfoUrl() {
    return this.sizeInfoUrl;
    }
    public void setSizeInfoUrl(String sizeInfoUrl) {
    this.sizeInfoUrl = sizeInfoUrl;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
    }