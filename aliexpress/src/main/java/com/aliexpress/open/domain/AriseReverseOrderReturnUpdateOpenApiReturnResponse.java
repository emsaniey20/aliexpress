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

public class AriseReverseOrderReturnUpdateOpenApiReturnResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 原因 */
                @ApiListField("reason_infos")
            private List<AriseReverseOrderReturnUpdatereasonInfosMap> reasonInfos;
        /** 逆向主单 */
                @ApiField("reverse_order_id")
            private Long reverseOrderId;
        /** 逆向子单列表 */
                @ApiListField("reverse_order_line_dos")
            private List<AriseReverseOrderReturnUpdateReverseOrderLineAPIDTO> reverseOrderLineDos;
    
        public List<AriseReverseOrderReturnUpdatereasonInfosMap> getReasonInfos() {
    return this.reasonInfos;
    }
    public void setReasonInfos(List<AriseReverseOrderReturnUpdatereasonInfosMap> reasonInfos) {
    this.reasonInfos = reasonInfos;
    }
        public Long getReverseOrderId() {
    return this.reverseOrderId;
    }
    public void setReverseOrderId(Long reverseOrderId) {
    this.reverseOrderId = reverseOrderId;
    }
        public List<AriseReverseOrderReturnUpdateReverseOrderLineAPIDTO> getReverseOrderLineDos() {
    return this.reverseOrderLineDos;
    }
    public void setReverseOrderLineDos(List<AriseReverseOrderReturnUpdateReverseOrderLineAPIDTO> reverseOrderLineDos) {
    this.reverseOrderLineDos = reverseOrderLineDos;
    }
    }