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

public class TaobaoVasSubscribeGetArticleSub implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码 */
                @ApiField("item_code")
            private String itemCode;
        /** 订购关系到期时间 */
                @ApiField("deadline")
            private String deadline;
    
        public String getItemCode() {
    return this.itemCode;
    }
    public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
    }
        public String getDeadline() {
    return this.deadline;
    }
    public void setDeadline(String deadline) {
    this.deadline = deadline;
    }
    }