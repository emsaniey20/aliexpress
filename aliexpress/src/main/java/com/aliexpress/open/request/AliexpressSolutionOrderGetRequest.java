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
*  aliexpress.solution.order.get
*/
public class AliexpressSolutionOrderGetRequest extends BaseGopRequest<AliexpressSolutionOrderGetResponse> {

    /** create-end date. It should be set to Pacific Standard Time. Format: yyyy-MM-dd HH:mm:ss. The interval between the create_date_start and the create_date_end cannot exceed 180 days. The time interval for inquiring about a FINISH order cannot exceed 30 days. */
    private String createDateEnd;
    /** create-start date. It should be set to Pacific Standard Time. The create_date_start and modified_date_start cannot be both empty. Format: yyyy-MM-dd HH:mm:ss. The interval between the create_date_start and the create_date_end cannot exceed 180 days.  The time interval for inquiring about a FINISH order cannot exceed 30 days. */
    private String createDateStart;
    /** modified-start date. It should be set to Pacific Standard Time. The create_date_start and modified_date_start cannot be both empty. Format: yyyy-MM-dd HH:mm:ss  */
    private String modifiedDateStart;
    /** Query order information in multiple order status. For specific order status, see order_status description. */
    private List<String> orderStatusList;
    /** buyer login id */
    private String buyerLoginId;
    /** Number of pages per page */
    private Integer pageSize;
    /** modified-end date. It should be set to Pacific Standard Time. Format: yyyy-MM-dd HH:mm:ss  */
    private String modifiedDateEnd;
    /** the current page */
    private Integer currentPage;
    /** Order status: PLACE_ORDER_SUCCESS: Waiting for buyer to pay; IN_CANCEL: Buyer request cancellation; WAIT_SELLER_SEND_GOODS: Waiting for your shipment; SELLER_PART_SEND_GOODS: Partial delivery; WAIT_BUYER_ACCEPT_GOODS: Waiting for buyer to receive goods; FUND_PROCESSING: Buyers agree, funds processing; IN_ISSUE : Orders in disputes; IN_FROZEN: Orders in freeze; WAIT_SELLER_EXAMINE_MONEY: Waiting for your confirmation amount; RISK_CONTROL: Orders are in 24 hours of risk control, starting 24 hours after the buyer's online payment is completed. The above status query can be separately queried separately, and the order status information is not included in the order status. (FINISH, closed order status) FINISH: The completed order needs to be queried separately. */
    private String orderStatus;

    public String getCreateDateEnd(){
        return this.createDateEnd;
    }
    public void setCreateDateEnd(String createDateEnd){
        this.createDateEnd = createDateEnd;
        }
    public String getCreateDateStart(){
        return this.createDateStart;
    }
    public void setCreateDateStart(String createDateStart){
        this.createDateStart = createDateStart;
        }
    public String getModifiedDateStart(){
        return this.modifiedDateStart;
    }
    public void setModifiedDateStart(String modifiedDateStart){
        this.modifiedDateStart = modifiedDateStart;
        }
    public List<String> getOrderStatusList(){
        return this.orderStatusList;
    }
    public void setOrderStatusList(List<String> orderStatusList){
        this.orderStatusList = orderStatusList;
        }
    public String getBuyerLoginId(){
        return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId){
        this.buyerLoginId = buyerLoginId;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public String getModifiedDateEnd(){
        return this.modifiedDateEnd;
    }
    public void setModifiedDateEnd(String modifiedDateEnd){
        this.modifiedDateEnd = modifiedDateEnd;
        }
    public Integer getCurrentPage(){
        return this.currentPage;
    }
    public void setCurrentPage(Integer currentPage){
        this.currentPage = currentPage;
        }
    public String getOrderStatus(){
        return this.orderStatus;
    }
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.order.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (createDateEnd != null) {
                        super.addApiParameter("create_date_end", createDateEnd.toString());
                    }
                            if (createDateStart != null) {
                        super.addApiParameter("create_date_start", createDateStart.toString());
                    }
                            if (modifiedDateStart != null) {
                        super.addApiParameter("modified_date_start", modifiedDateStart.toString());
                    }
                            if (orderStatusList != null) {
                        super.addApiParameter("order_status_list", new JSONWriter(true, false).write(orderStatusList));
                    }
                            if (buyerLoginId != null) {
                        super.addApiParameter("buyer_login_id", buyerLoginId.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (modifiedDateEnd != null) {
                        super.addApiParameter("modified_date_end", modifiedDateEnd.toString());
                    }
                            if (currentPage != null) {
                        super.addApiParameter("current_page", currentPage.toString());
                    }
                            if (orderStatus != null) {
                        super.addApiParameter("order_status", orderStatus.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionOrderGetResponse> getResponseClass() {
        return AliexpressSolutionOrderGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}