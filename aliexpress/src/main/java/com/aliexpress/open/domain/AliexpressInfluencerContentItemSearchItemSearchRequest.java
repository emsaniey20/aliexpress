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

public class AliexpressInfluencerContentItemSearchItemSearchRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 邮箱 */
                @ApiField("email")
            private String email;
        /** 分页参数 */
                @ApiField("next_start_row_key")
            private String nextStartRowKey;
        /** 分页参数 */
                @ApiField("page_size")
            private Long pageSize;
        /** 语言_国家 */
                @ApiField("locale")
            private String locale;
        /** 货币 */
                @ApiField("currency")
            private String currency;
        /** 搜索关键词 */
                @ApiField("search_key")
            private String searchKey;
    
        public String getEmail() {
    return this.email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
        public String getNextStartRowKey() {
    return this.nextStartRowKey;
    }
    public void setNextStartRowKey(String nextStartRowKey) {
    this.nextStartRowKey = nextStartRowKey;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getCurrency() {
    return this.currency;
    }
    public void setCurrency(String currency) {
    this.currency = currency;
    }
        public String getSearchKey() {
    return this.searchKey;
    }
    public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
    }
    }