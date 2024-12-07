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

public class GlobalMediacenterBaseinfoGetMediaGalleryOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 总容量大小，单位字节 */
                @ApiField("capicity")
            private String capicity;
        /** 已使用容量，单位字节 */
                @ApiField("usage")
            private String usage;
    
        public String getCapicity() {
    return this.capicity;
    }
    public void setCapicity(String capicity) {
    this.capicity = capicity;
    }
        public String getUsage() {
    return this.usage;
    }
    public void setUsage(String usage) {
    this.usage = usage;
    }
    }