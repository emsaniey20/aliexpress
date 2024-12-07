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

public class AliexpressTradeNewRedefiningFindorderbyidcopy1692616251789AeopTpSingleOrderQuery implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 扩展信息目前支持纠纷信息，放款信息，物流信息，买方信息和退款信息，分别对应二进制位1,2,3,4,5。例如，只查询纠纷信息和物流信息，extInfoBitFlag=10100；将此字段留空意味着返回所有信息。 */
                @ApiField("ext_info_bit_flag")
            private Integer extInfoBitFlag;
        /** 暂不支持. */
                @ApiField("field_list")
            private String fieldList;
        /** 订单id */
                @ApiField("order_id")
            private Long orderId;
        /** 暂不支持 */
                @ApiField("show_id")
            private String showId;
    
        public Integer getExtInfoBitFlag() {
    return this.extInfoBitFlag;
    }
    public void setExtInfoBitFlag(Integer extInfoBitFlag) {
    this.extInfoBitFlag = extInfoBitFlag;
    }
        public String getFieldList() {
    return this.fieldList;
    }
    public void setFieldList(String fieldList) {
    this.fieldList = fieldList;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
        public String getShowId() {
    return this.showId;
    }
    public void setShowId(String showId) {
    this.showId = showId;
    }
    }