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

public class AliexpressDsProductGetAeMultimediaInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Video information */
                @ApiListField("ae_video_dtos")
            private List<AliexpressDsProductGetAeVideoDTO> aeVideoDtos;
        /** List of main images of the product */
                @ApiField("image_urls")
            private String imageUrls;
    
        public List<AliexpressDsProductGetAeVideoDTO> getAeVideoDtos() {
    return this.aeVideoDtos;
    }
    public void setAeVideoDtos(List<AliexpressDsProductGetAeVideoDTO> aeVideoDtos) {
    this.aeVideoDtos = aeVideoDtos;
    }
        public String getImageUrls() {
    return this.imageUrls;
    }
    public void setImageUrls(String imageUrls) {
    this.imageUrls = imageUrls;
    }
    }