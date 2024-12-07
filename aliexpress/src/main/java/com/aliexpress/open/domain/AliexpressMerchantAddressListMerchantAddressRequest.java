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

public class AliexpressMerchantAddressListMerchantAddressRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /**  请输入全托管店铺的id。 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_seller_id")
            private Long channelSellerId;
        /** 地址类型：SALESRETURN（退货地址），WAREHOUSE（发货地址） */
                @ApiListField("address_types")
            private List<String> addressTypes;
    
        public Long getChannelSellerId() {
    return this.channelSellerId;
    }
    public void setChannelSellerId(Long channelSellerId) {
    this.channelSellerId = channelSellerId;
    }
        public List<String> getAddressTypes() {
    return this.addressTypes;
    }
    public void setAddressTypes(List<String> addressTypes) {
    this.addressTypes = addressTypes;
    }
    }