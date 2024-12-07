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

public class AliexpressPhotobankRedefiningWbimageGetGetWBImageRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 原图片链接 */
                @ApiField("original_image_url")
            private String originalImageUrl;
    
        public String getOriginalImageUrl() {
    return this.originalImageUrl;
    }
    public void setOriginalImageUrl(String originalImageUrl) {
    this.originalImageUrl = originalImageUrl;
    }
    }