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

public class AliexpressAscpPoQueryCreateShippingMarkPdfShippingPrintDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 采购单号 */
                @ApiField("purchase_order_no")
            private String purchaseOrderNo;
        /** 业务租户Id，全托管 场景请填写 5110000, choice2.0(AEG)场景填: 288000 */
                @ApiField("biz_type")
            private Integer bizType;
        /** 送仓箱数 */
                @ApiField("box_number")
            private Integer boxNumber;
        /** 渠道seller id （可以在这个API中查询：global.seller.relation.query）， 请使用 business_type = ONE_STOP_SERVICE 的全托管店铺 channel_seller_id */
                @ApiField("channel_user_id")
            private Long channelUserId;
        /** PDF大小。全托管支持尺寸, 默认为: SIZE_100_150, 可选项: 1. SIZE_100_150：100mm*150mm；2. SIZE_100_100：100mm*100mm；3. SIZE_60_30：60mm*30mm；(新增)  半托管支持尺寸: 必须设置这个参数. 可选项:  1. SIZE_100_150：100mm*150mm；2. SIZE_100_100：100mm*100mm; 3. SIZE_60_30：60mm*30mm；(新增) */
                @ApiField("pdf_size")
            private String pdfSize;
        /** 是否一起打印条形码,  仅支持半托管 */
                @ApiField("print_barcode")
            private Boolean printBarcode;
    
        public String getPurchaseOrderNo() {
    return this.purchaseOrderNo;
    }
    public void setPurchaseOrderNo(String purchaseOrderNo) {
    this.purchaseOrderNo = purchaseOrderNo;
    }
        public Integer getBizType() {
    return this.bizType;
    }
    public void setBizType(Integer bizType) {
    this.bizType = bizType;
    }
        public Integer getBoxNumber() {
    return this.boxNumber;
    }
    public void setBoxNumber(Integer boxNumber) {
    this.boxNumber = boxNumber;
    }
        public Long getChannelUserId() {
    return this.channelUserId;
    }
    public void setChannelUserId(Long channelUserId) {
    this.channelUserId = channelUserId;
    }
        public String getPdfSize() {
    return this.pdfSize;
    }
    public void setPdfSize(String pdfSize) {
    this.pdfSize = pdfSize;
    }
        public Boolean getPrintBarcode() {
    return this.printBarcode;
    }
    public void setPrintBarcode(Boolean printBarcode) {
    this.printBarcode = printBarcode;
    }
    }