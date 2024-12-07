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

public class AriseLogisticsAwbPrintPrintAWBApiRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query） */
                @ApiField("seller_id")
            private Long sellerId;
        /** 包裹单号 */
                @ApiListField("package_id_list")
            private List<String> packageIdList;
        /** 渠道（可以在这个API中查询：global.seller.relation.query） */
                @ApiField("channel_type")
            private String channelType;
        /** 打印类型：HTML/PDF */
                @ApiField("file_type")
            private String fileType;
    
        public Long getSellerId() {
    return this.sellerId;
    }
    public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
    }
        public List<String> getPackageIdList() {
    return this.packageIdList;
    }
    public void setPackageIdList(List<String> packageIdList) {
    this.packageIdList = packageIdList;
    }
        public String getChannelType() {
    return this.channelType;
    }
    public void setChannelType(String channelType) {
    this.channelType = channelType;
    }
        public String getFileType() {
    return this.fileType;
    }
    public void setFileType(String fileType) {
    this.fileType = fileType;
    }
    }