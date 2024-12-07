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

public class AliexpressMerchantPrivateFileGetSellerPrivateFileDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 文件名 */
                @ApiField("file_name")
            private String fileName;
        /** 文件字节流数据 */
                @ApiField("content")
            private String content;
    
        public String getFileName() {
    return this.fileName;
    }
    public void setFileName(String fileName) {
    this.fileName = fileName;
    }
        public String getContent() {
    return this.content;
    }
    public void setContent(String content) {
    this.content = content;
    }
    }