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

public class AliexpressInfluencerContentResourceCheckUgcApiResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 请求状态 */
                @ApiField("success")
            private Boolean success;
        /** 请求状态 */
                @ApiField("fail")
            private Boolean fail;
        /** 返回数据 */
                @ApiField("data")
            private AliexpressInfluencerContentResourceCheckResourceResponseDTO data;
    
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Boolean getFail() {
    return this.fail;
    }
    public void setFail(Boolean fail) {
    this.fail = fail;
    }
        public AliexpressInfluencerContentResourceCheckResourceResponseDTO getData() {
    return this.data;
    }
    public void setData(AliexpressInfluencerContentResourceCheckResourceResponseDTO data) {
    this.data = data;
    }
    }