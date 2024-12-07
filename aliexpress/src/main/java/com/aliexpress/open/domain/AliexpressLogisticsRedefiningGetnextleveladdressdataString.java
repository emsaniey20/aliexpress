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

public class AliexpressLogisticsRedefiningGetnextleveladdressdataString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** pyDiplayName */
                @ApiField("py_diplay_name")
            private String pyDiplayName;
        /** cnDiplayName */
                @ApiField("cn_diplay_name")
            private String cnDiplayName;
        /** areaId */
                @ApiField("area_id")
            private Long areaId;
    
        public String getPyDiplayName() {
    return this.pyDiplayName;
    }
    public void setPyDiplayName(String pyDiplayName) {
    this.pyDiplayName = pyDiplayName;
    }
        public String getCnDiplayName() {
    return this.cnDiplayName;
    }
    public void setCnDiplayName(String cnDiplayName) {
    this.cnDiplayName = cnDiplayName;
    }
        public Long getAreaId() {
    return this.areaId;
    }
    public void setAreaId(Long areaId) {
    this.areaId = areaId;
    }
    }