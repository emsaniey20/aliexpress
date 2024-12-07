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

public class AliexpressSolutionOrderInfoGetcopy1692615547969OrderDetailQuery implements Serializable {
    private static final long serialVersionUID = 1L;
        /** It defines which details to be returned. Convert the number into binary format, for example, 16 to 10000. Only the last 5 bits take effects, starting from the end, 1st bit is for issue information, 2nd bit is for loan information, 3rd bit is for logistics information, 4th bit is for buyer information and 5th bit is for refund information. If any bit is 1, it means to return the corresponding information, for example, 3 wich is 00011, means to return issue information and logistics information. Leaving this field blank means return all information. */
                @ApiField("ext_info_bit_flag")
            private Integer extInfoBitFlag;
        /** Order id */
                @ApiField("order_id")
            private Long orderId;
    
        public Integer getExtInfoBitFlag() {
    return this.extInfoBitFlag;
    }
    public void setExtInfoBitFlag(Integer extInfoBitFlag) {
    this.extInfoBitFlag = extInfoBitFlag;
    }
        public Long getOrderId() {
    return this.orderId;
    }
    public void setOrderId(Long orderId) {
    this.orderId = orderId;
    }
    }