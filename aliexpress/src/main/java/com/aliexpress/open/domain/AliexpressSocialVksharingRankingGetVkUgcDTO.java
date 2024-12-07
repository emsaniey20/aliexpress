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

public class AliexpressSocialVksharingRankingGetVkUgcDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** for type is banner, image url */
                @ApiField("image_url")
            private String imageUrl;
        /** item id */
                @ApiField("item_id")
            private String itemId;
        /** for type is banner, banner link */
                @ApiField("link")
            private String link;
        /** owner id */
                @ApiField("owner_id")
            private String ownerId;
        /** trace info, for arithmetic */
                @ApiField("trace_info")
            private String traceInfo;
        /** content type, include article,video,photo,product,story,post,banner */
                @ApiField("type")
            private String type;
    
        public String getImageUrl() {
    return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    }
        public String getItemId() {
    return this.itemId;
    }
    public void setItemId(String itemId) {
    this.itemId = itemId;
    }
        public String getLink() {
    return this.link;
    }
    public void setLink(String link) {
    this.link = link;
    }
        public String getOwnerId() {
    return this.ownerId;
    }
    public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
    }
        public String getTraceInfo() {
    return this.traceInfo;
    }
    public void setTraceInfo(String traceInfo) {
    this.traceInfo = traceInfo;
    }
        public String getType() {
    return this.type;
    }
    public void setType(String type) {
    this.type = type;
    }
    }