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

public class GlobalMediacenterImageChannelTransferMediaImageOpsParamsOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 目标渠道。可选项：AE_GLOBAL,ARISE_ES,ARISE_FR */
                @ApiField("channel")
            private String channel;
        /** 媒体中心中的图片id */
                @ApiField("id")
            private Long id;
    
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public Long getId() {
    return this.id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    }