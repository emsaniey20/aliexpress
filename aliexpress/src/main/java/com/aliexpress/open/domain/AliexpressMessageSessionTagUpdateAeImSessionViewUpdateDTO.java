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

public class AliexpressMessageSessionTagUpdateAeImSessionViewUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** true：去标 false：打标 */
                @ApiField("is_deleting")
            private Boolean isDeleting;
        /** 标记码 0：重点关注 1：需关注 */
                @ApiField("tag_code")
            private Integer tagCode;
        /** 买家id */
                @ApiField("buyer_id")
            private Long buyerId;
    
        public Boolean getIsDeleting() {
    return this.isDeleting;
    }
    public void setIsDeleting(Boolean isDeleting) {
    this.isDeleting = isDeleting;
    }
        public Integer getTagCode() {
    return this.tagCode;
    }
    public void setTagCode(Integer tagCode) {
    this.tagCode = tagCode;
    }
        public Long getBuyerId() {
    return this.buyerId;
    }
    public void setBuyerId(Long buyerId) {
    this.buyerId = buyerId;
    }
    }