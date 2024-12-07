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

public class GspOrderQueryforsupplierOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 销售订单 */
                @ApiField("salesOrder")
            private GspOrderQueryforsupplierSalesOrderDTO salesOrder;
        /** 分销商 */
                @ApiField("distributor")
            private GspOrderQueryforsupplierDistributorDTO distributor;
        /** 供应商 */
                @ApiField("supplier")
            private GspOrderQueryforsupplierSupplierDTO supplier;
        /** 采购订单 */
                @ApiListField("purchaseOrders")
            private List<GspOrderQueryforsupplierPurchaseOrdrerDTO> purchaseOrders;
    
        public GspOrderQueryforsupplierSalesOrderDTO getSalesOrder() {
    return this.salesOrder;
    }
    public void setSalesOrder(GspOrderQueryforsupplierSalesOrderDTO salesOrder) {
    this.salesOrder = salesOrder;
    }
        public GspOrderQueryforsupplierDistributorDTO getDistributor() {
    return this.distributor;
    }
    public void setDistributor(GspOrderQueryforsupplierDistributorDTO distributor) {
    this.distributor = distributor;
    }
        public GspOrderQueryforsupplierSupplierDTO getSupplier() {
    return this.supplier;
    }
    public void setSupplier(GspOrderQueryforsupplierSupplierDTO supplier) {
    this.supplier = supplier;
    }
        public List<GspOrderQueryforsupplierPurchaseOrdrerDTO> getPurchaseOrders() {
    return this.purchaseOrders;
    }
    public void setPurchaseOrders(List<GspOrderQueryforsupplierPurchaseOrdrerDTO> purchaseOrders) {
    this.purchaseOrders = purchaseOrders;
    }
    }