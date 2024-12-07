package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  /gsp/order/queryforsupplier
*/
public class GspOrderQueryforsupplierRequest extends BaseGopRequest<GspOrderQueryforsupplierResponse> {

    /** 格式: yyyy-MM-dd hh:mm:ss, 当saleMarket为AE时，该时间为美国太平洋时间； */
    private String modifiedEnd;
    /** 销售订单ID */
    private String saleOrderId;
    /** 每页记录数, pageSize <= 500,      默认：20 */
    private Integer pageSize;
    /** 选项：Created Paid Shipped InBound OutBound Cancelled */
    private String status;
    /** 入驻的时候会发放给供应商的loginid */
    private String sellerLoginId;
    /** 当前页码，  pageNum  <= 10000，默认：1 */
    private Integer pageNum;
    /** 格式: yyyy-MM-dd hh:mm:ss, 当saleMarket为AE时，该时间为美国太平洋时间； */
    private String createdEnd;
    /** 格式: yyyy-MM-dd hh:mm:ss, 当saleMarket为AE时，该时间为美国太平洋时间； */
    private String modifiedBegin;
    /** 销售市场，必填 */
    private String saleMarket;
    /** 采购订单ID */
    private String purchaseOrderId;
    /** 格式: yyyy-MM-dd hh:mm:ss, 当saleMarket为AE时，该时间为美国太平洋时间； */
    private String createdBegin;

    public String getModifiedEnd(){
        return this.modifiedEnd;
    }
    public void setModifiedEnd(String modifiedEnd){
        this.modifiedEnd = modifiedEnd;
        }
    public String getSaleOrderId(){
        return this.saleOrderId;
    }
    public void setSaleOrderId(String saleOrderId){
        this.saleOrderId = saleOrderId;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
        }
    public String getSellerLoginId(){
        return this.sellerLoginId;
    }
    public void setSellerLoginId(String sellerLoginId){
        this.sellerLoginId = sellerLoginId;
        }
    public Integer getPageNum(){
        return this.pageNum;
    }
    public void setPageNum(Integer pageNum){
        this.pageNum = pageNum;
        }
    public String getCreatedEnd(){
        return this.createdEnd;
    }
    public void setCreatedEnd(String createdEnd){
        this.createdEnd = createdEnd;
        }
    public String getModifiedBegin(){
        return this.modifiedBegin;
    }
    public void setModifiedBegin(String modifiedBegin){
        this.modifiedBegin = modifiedBegin;
        }
    public String getSaleMarket(){
        return this.saleMarket;
    }
    public void setSaleMarket(String saleMarket){
        this.saleMarket = saleMarket;
        }
    public String getPurchaseOrderId(){
        return this.purchaseOrderId;
    }
    public void setPurchaseOrderId(String purchaseOrderId){
        this.purchaseOrderId = purchaseOrderId;
        }
    public String getCreatedBegin(){
        return this.createdBegin;
    }
    public void setCreatedBegin(String createdBegin){
        this.createdBegin = createdBegin;
        }

    @Override
    public String getApiName() {
        return "/gsp/order/queryforsupplier";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (modifiedEnd != null) {
                        super.addApiParameter("modified_end", modifiedEnd.toString());
                    }
                            if (saleOrderId != null) {
                        super.addApiParameter("sale_order_id", saleOrderId.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (status != null) {
                        super.addApiParameter("status", status.toString());
                    }
                            if (sellerLoginId != null) {
                        super.addApiParameter("seller_login_id", sellerLoginId.toString());
                    }
                            if (pageNum != null) {
                        super.addApiParameter("page_num", pageNum.toString());
                    }
                            if (createdEnd != null) {
                        super.addApiParameter("created_end", createdEnd.toString());
                    }
                            if (modifiedBegin != null) {
                        super.addApiParameter("modified_begin", modifiedBegin.toString());
                    }
                            if (saleMarket != null) {
                        super.addApiParameter("sale_market", saleMarket.toString());
                    }
                            if (purchaseOrderId != null) {
                        super.addApiParameter("purchase_order_id", purchaseOrderId.toString());
                    }
                            if (createdBegin != null) {
                        super.addApiParameter("created_begin", createdBegin.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                return super.getFileParams();
    }

    @Override
    public Class<GspOrderQueryforsupplierResponse> getResponseClass() {
        return GspOrderQueryforsupplierResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}