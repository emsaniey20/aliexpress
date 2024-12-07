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

public class CainiaoGlobalCommithandovercontentUpdateOpenHandoverContentUpdateResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否成功 */
                @ApiField("result")
            private Boolean result;
        /** 报错小包列表 */
                @ApiListField("update_error_parcel_order_list")
            private List<CainiaoGlobalCommithandovercontentUpdateHandoverContentUpdateErrorParcelDTO> updateErrorParcelOrderList;
    
        public Boolean getResult() {
    return this.result;
    }
    public void setResult(Boolean result) {
    this.result = result;
    }
        public List<CainiaoGlobalCommithandovercontentUpdateHandoverContentUpdateErrorParcelDTO> getUpdateErrorParcelOrderList() {
    return this.updateErrorParcelOrderList;
    }
    public void setUpdateErrorParcelOrderList(List<CainiaoGlobalCommithandovercontentUpdateHandoverContentUpdateErrorParcelDTO> updateErrorParcelOrderList) {
    this.updateErrorParcelOrderList = updateErrorParcelOrderList;
    }
    }