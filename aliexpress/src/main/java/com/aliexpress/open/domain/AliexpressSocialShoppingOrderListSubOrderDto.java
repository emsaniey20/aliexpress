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

public class AliexpressSocialShoppingOrderListSubOrderDto implements Serializable {
    private static final long serialVersionUID = 1L;
        /** can_additional_eval */
                @ApiField("can_additional_eval")
            private Boolean canAdditionalEval;
        /** issue_status */
                @ApiField("issue_status")
            private String issueStatus;
        /** parent_id */
                @ApiField("parent_id")
            private Long parentId;
        /** product_count */
                @ApiField("product_count")
            private Integer productCount;
        /** product_id */
                @ApiField("product_id")
            private Long productId;
        /** product_name */
                @ApiField("product_name")
            private String productName;
        /** product_sku_list */
                @ApiListField("product_sku_list")
            private List<AliexpressSocialShoppingOrderListOrderProductSkuDisplayDto> productSkuList;
        /** small_photo_full_path */
                @ApiField("small_photo_full_path")
            private String smallPhotoFullPath;
        /** snapshot_id */
                @ApiField("snapshot_id")
            private String snapshotId;
        /** sub_order_id */
                @ApiField("sub_order_id")
            private Long subOrderId;
        /** sub_order_status */
                @ApiField("sub_order_status")
            private String subOrderStatus;
        /** warranty_type_name */
                @ApiField("warranty_type_name")
            private String warrantyTypeName;
    
        public Boolean getCanAdditionalEval() {
    return this.canAdditionalEval;
    }
    public void setCanAdditionalEval(Boolean canAdditionalEval) {
    this.canAdditionalEval = canAdditionalEval;
    }
        public String getIssueStatus() {
    return this.issueStatus;
    }
    public void setIssueStatus(String issueStatus) {
    this.issueStatus = issueStatus;
    }
        public Long getParentId() {
    return this.parentId;
    }
    public void setParentId(Long parentId) {
    this.parentId = parentId;
    }
        public Integer getProductCount() {
    return this.productCount;
    }
    public void setProductCount(Integer productCount) {
    this.productCount = productCount;
    }
        public Long getProductId() {
    return this.productId;
    }
    public void setProductId(Long productId) {
    this.productId = productId;
    }
        public String getProductName() {
    return this.productName;
    }
    public void setProductName(String productName) {
    this.productName = productName;
    }
        public List<AliexpressSocialShoppingOrderListOrderProductSkuDisplayDto> getProductSkuList() {
    return this.productSkuList;
    }
    public void setProductSkuList(List<AliexpressSocialShoppingOrderListOrderProductSkuDisplayDto> productSkuList) {
    this.productSkuList = productSkuList;
    }
        public String getSmallPhotoFullPath() {
    return this.smallPhotoFullPath;
    }
    public void setSmallPhotoFullPath(String smallPhotoFullPath) {
    this.smallPhotoFullPath = smallPhotoFullPath;
    }
        public String getSnapshotId() {
    return this.snapshotId;
    }
    public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    }
        public Long getSubOrderId() {
    return this.subOrderId;
    }
    public void setSubOrderId(Long subOrderId) {
    this.subOrderId = subOrderId;
    }
        public String getSubOrderStatus() {
    return this.subOrderStatus;
    }
    public void setSubOrderStatus(String subOrderStatus) {
    this.subOrderStatus = subOrderStatus;
    }
        public String getWarrantyTypeName() {
    return this.warrantyTypeName;
    }
    public void setWarrantyTypeName(String warrantyTypeName) {
    this.warrantyTypeName = warrantyTypeName;
    }
    }