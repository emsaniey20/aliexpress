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

public class AliexpressDataQdFileUploadFileUploadMeta implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 上传分区信息 */
                @ApiField("partition")
            private String partition;
        /** 业务代码 */
                @ApiField("biz_code")
            private String bizCode;
    
        public String getPartition() {
    return this.partition;
    }
    public void setPartition(String partition) {
    this.partition = partition;
    }
        public String getBizCode() {
    return this.bizCode;
    }
    public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
    }
    }