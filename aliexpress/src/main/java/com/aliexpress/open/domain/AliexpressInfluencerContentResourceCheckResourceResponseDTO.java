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

public class AliexpressInfluencerContentResourceCheckResourceResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /**  资源状态 */
                @ApiListField("resource_statuses")
            private List<AliexpressInfluencerContentResourceCheckResourceStatusDTO> resourceStatuses;
    
        public List<AliexpressInfluencerContentResourceCheckResourceStatusDTO> getResourceStatuses() {
    return this.resourceStatuses;
    }
    public void setResourceStatuses(List<AliexpressInfluencerContentResourceCheckResourceStatusDTO> resourceStatuses) {
    this.resourceStatuses = resourceStatuses;
    }
    }