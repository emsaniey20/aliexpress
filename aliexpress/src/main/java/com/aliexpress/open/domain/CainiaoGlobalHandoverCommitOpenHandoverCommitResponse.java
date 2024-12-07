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

public class CainiaoGlobalHandoverCommitOpenHandoverCommitResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 未组包成功的小包信息 */
                @ApiField("not_commit_parcel_detail")
            private String notCommitParcelDetail;
        /** 交接物id，即大包id */
                @ApiField("handover_content_id")
            private Long handoverContentId;
        /** 交接批次号，即交接单id */
                @ApiField("handover_order_id")
            private Long handoverOrderId;
        /** 交接物编码，即大包LP号 */
                @ApiField("handover_content_code")
            private String handoverContentCode;
    
        public String getNotCommitParcelDetail() {
    return this.notCommitParcelDetail;
    }
    public void setNotCommitParcelDetail(String notCommitParcelDetail) {
    this.notCommitParcelDetail = notCommitParcelDetail;
    }
        public Long getHandoverContentId() {
    return this.handoverContentId;
    }
    public void setHandoverContentId(Long handoverContentId) {
    this.handoverContentId = handoverContentId;
    }
        public Long getHandoverOrderId() {
    return this.handoverOrderId;
    }
    public void setHandoverOrderId(Long handoverOrderId) {
    this.handoverOrderId = handoverOrderId;
    }
        public String getHandoverContentCode() {
    return this.handoverContentCode;
    }
    public void setHandoverContentCode(String handoverContentCode) {
    this.handoverContentCode = handoverContentCode;
    }
    }