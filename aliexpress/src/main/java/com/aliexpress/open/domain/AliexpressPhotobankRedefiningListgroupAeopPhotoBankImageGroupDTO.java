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

public class AliexpressPhotobankRedefiningListgroupAeopPhotoBankImageGroupDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片分组ID */
                @ApiField("group_id")
            private String groupId;
        /** 图片分组名称 */
                @ApiField("group_name")
            private String groupName;
    
        public String getGroupId() {
    return this.groupId;
    }
    public void setGroupId(String groupId) {
    this.groupId = groupId;
    }
        public String getGroupName() {
    return this.groupName;
    }
    public void setGroupName(String groupName) {
    this.groupName = groupName;
    }
    }