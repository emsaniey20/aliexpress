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

public class AliexpressProductProductgroupsGetAeopResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 产品分组信息 */
                @ApiListField("target_list")
            private List<AliexpressProductProductgroupsGetAeopAEProductTreeGroup> targetList;
    
        public List<AliexpressProductProductgroupsGetAeopAEProductTreeGroup> getTargetList() {
    return this.targetList;
    }
    public void setTargetList(List<AliexpressProductProductgroupsGetAeopAEProductTreeGroup> targetList) {
    this.targetList = targetList;
    }
    }