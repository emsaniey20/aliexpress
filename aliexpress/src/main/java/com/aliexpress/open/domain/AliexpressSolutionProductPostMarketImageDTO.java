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

public class AliexpressSolutionProductPostMarketImageDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 1 represents 3:4 rectangle(resolution at least 750*1000) image while 2 represents 1:1 square image(Resolution at least 800*800). */
                @ApiField("image_type")
            private Integer imageType;
        /** The image url needs to be obtained via uploading the image through Aliexpress API: aliexpress.photobank.redefining.uploadimageforsdk(https://developers.aliexpress.com/en/doc.htm?docId=30186&docType=2) */
                @ApiField("image_url")
            private String imageUrl;
    
        public Integer getImageType() {
    return this.imageType;
    }
    public void setImageType(Integer imageType) {
    this.imageType = imageType;
    }
        public String getImageUrl() {
    return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    }
    }