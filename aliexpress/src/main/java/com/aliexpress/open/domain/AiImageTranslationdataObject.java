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

public class AiImageTranslationdataObject implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 生成结果图片URL */
                @ApiField("imageUrl")
            private String imageUrl;
        /** 生成结果Base64 */
                @ApiField("imageBase64")
            private String imageBase64;
    
        public String getImageUrl() {
    return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    }
        public String getImageBase64() {
    return this.imageBase64;
    }
    public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
    }
    }