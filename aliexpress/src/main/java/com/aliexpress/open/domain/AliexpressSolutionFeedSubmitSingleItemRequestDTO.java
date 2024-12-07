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

public class AliexpressSolutionFeedSubmitSingleItemRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Content of each item, which follows different format according to different feed type. */
                @ApiField("item_content")
            private String itemContent;
        /** The id of the item_content, which could be defined by the seller. item_content_id should be unique among all the items in item_list.This field also appears in the API:aliexpress.solution.feed.query, which is regarding the convenience for the sellers to match the item_execuation_result with the item_content. */
                @ApiField("item_content_id")
            private String itemContentId;
    
        public String getItemContent() {
    return this.itemContent;
    }
    public void setItemContent(String itemContent) {
    this.itemContent = itemContent;
    }
        public String getItemContentId() {
    return this.itemContentId;
    }
    public void setItemContentId(String itemContentId) {
    this.itemContentId = itemContentId;
    }
    }