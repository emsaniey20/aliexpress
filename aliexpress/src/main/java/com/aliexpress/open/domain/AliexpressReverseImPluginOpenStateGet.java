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

public class AliexpressReverseImPluginOpenStateGet implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 卖家id */
                @ApiField("user_id")
            private String userId;
        /** 插件模块。 plugin_key 的枚举值： 基础接待: s_basic_reception  智能接待: s_smart_reception  自动任务: s_auto_task  客服面板工具: s_service_pannel */
                @ApiField("plugin_key")
            private String pluginKey;
    
        public String getUserId() {
    return this.userId;
    }
    public void setUserId(String userId) {
    this.userId = userId;
    }
        public String getPluginKey() {
    return this.pluginKey;
    }
    public void setPluginKey(String pluginKey) {
    this.pluginKey = pluginKey;
    }
    }