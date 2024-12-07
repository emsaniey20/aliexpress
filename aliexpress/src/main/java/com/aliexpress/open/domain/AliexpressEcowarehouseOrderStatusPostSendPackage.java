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

public class AliexpressEcowarehouseOrderStatusPostSendPackage implements Serializable {
    private static final long serialVersionUID = 1L;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("package_height")
            private Integer packageHeight;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("order_mail_no")
            private String orderMailNo;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("package_weight")
            private Integer packageWeight;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("shipping_method")
            private String shippingMethod;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("logistics_company_en")
            private String logisticsCompanyEn;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("package_length")
            private Integer packageLength;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("package_width")
            private Integer packageWidth;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiListField("package_sku_list")
            private List<AliexpressEcowarehouseOrderStatusPostSendPackageSku> packageSkuList;
        /** https://www.yuque.com/docs/share/32c97498-eeab-4e31-8430-b9fe937a9b14?#RHzoQ */
                @ApiField("logistics_company_cn")
            private String logisticsCompanyCn;
    
        public Integer getPackageHeight() {
    return this.packageHeight;
    }
    public void setPackageHeight(Integer packageHeight) {
    this.packageHeight = packageHeight;
    }
        public String getOrderMailNo() {
    return this.orderMailNo;
    }
    public void setOrderMailNo(String orderMailNo) {
    this.orderMailNo = orderMailNo;
    }
        public Integer getPackageWeight() {
    return this.packageWeight;
    }
    public void setPackageWeight(Integer packageWeight) {
    this.packageWeight = packageWeight;
    }
        public String getShippingMethod() {
    return this.shippingMethod;
    }
    public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    }
        public String getLogisticsCompanyEn() {
    return this.logisticsCompanyEn;
    }
    public void setLogisticsCompanyEn(String logisticsCompanyEn) {
    this.logisticsCompanyEn = logisticsCompanyEn;
    }
        public Integer getPackageLength() {
    return this.packageLength;
    }
    public void setPackageLength(Integer packageLength) {
    this.packageLength = packageLength;
    }
        public Integer getPackageWidth() {
    return this.packageWidth;
    }
    public void setPackageWidth(Integer packageWidth) {
    this.packageWidth = packageWidth;
    }
        public List<AliexpressEcowarehouseOrderStatusPostSendPackageSku> getPackageSkuList() {
    return this.packageSkuList;
    }
    public void setPackageSkuList(List<AliexpressEcowarehouseOrderStatusPostSendPackageSku> packageSkuList) {
    this.packageSkuList = packageSkuList;
    }
        public String getLogisticsCompanyCn() {
    return this.logisticsCompanyCn;
    }
    public void setLogisticsCompanyCn(String logisticsCompanyCn) {
    this.logisticsCompanyCn = logisticsCompanyCn;
    }
    }