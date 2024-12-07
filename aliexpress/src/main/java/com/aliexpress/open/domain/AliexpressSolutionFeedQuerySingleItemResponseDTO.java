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

public class AliexpressSolutionFeedQuerySingleItemResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Execution result of each item */
                @ApiField("item_execution_result")
            private String itemExecutionResult;
        /** Corresponding to the item_content_id defined by the seller when invoking the API: aliexpress.solution.feed.submit */
                @ApiField("item_content_id")
            private String itemContentId;
    
        public String getItemExecutionResult() {
    return this.itemExecutionResult;
    }
    public void setItemExecutionResult(String itemExecutionResult) {
    this.itemExecutionResult = itemExecutionResult;
    }
        public String getItemContentId() {
    return this.itemContentId;
    }
    public void setItemContentId(String itemContentId) {
    this.itemContentId = itemContentId;
    }
    }