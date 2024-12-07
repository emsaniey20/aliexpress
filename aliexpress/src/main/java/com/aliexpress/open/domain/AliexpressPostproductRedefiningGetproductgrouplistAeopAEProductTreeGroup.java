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

public class AliexpressPostproductRedefiningGetproductgrouplistAeopAEProductTreeGroup implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 子分组名称 */
                @ApiField("group_name")
            private String groupName;
        /** 子分组id */
                @ApiField("group_id")
            private Long groupId;
    
        public String getGroupName() {
    return this.groupName;
    }
    public void setGroupName(String groupName) {
    this.groupName = groupName;
    }
        public Long getGroupId() {
    return this.groupId;
    }
    public void setGroupId(Long groupId) {
    this.groupId = groupId;
    }
    }