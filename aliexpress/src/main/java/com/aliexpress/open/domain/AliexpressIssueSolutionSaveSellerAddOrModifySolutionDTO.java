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

public class AliexpressIssueSolutionSaveSellerAddOrModifySolutionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 是否新增方案(true新增,false修改) */
                @ApiField("add_seller_solution")
            private Boolean addSellerSolution;
        /** 方案类型(SNAD才可更改类型)：退款refund,退货退款return_and_refund */
                @ApiField("add_solution_type")
            private String addSolutionType;
        /** 买家登录id */
                @ApiField("buyer_login_id")
            private String buyerLoginId;
        /** 拒绝买家方案id，增加方案时必填 */
                @ApiField("buyer_solution_id")
            private Long buyerSolutionId;
        /** 纠纷id */
                @ApiField("issue_id")
            private Long issueId;
        /** 修改的卖家方案id，修改方案时必填 */
                @ApiField("modify_seller_solution_id")
            private Long modifySellerSolutionId;
        /** 新增or修改金额(元) */
                @ApiField("refund_amount")
            private String refundAmount;
        /** 新增or修改金额的币种 */
                @ApiField("refund_amount_currency")
            private String refundAmountCurrency;
        /** 退货地址id，新增退货方案时必填 */
                @ApiField("return_good_address_id")
            private Long returnGoodAddressId;
        /** 新增or修改理由说明 */
                @ApiField("solution_context")
            private String solutionContext;
    
        public Boolean getAddSellerSolution() {
    return this.addSellerSolution;
    }
    public void setAddSellerSolution(Boolean addSellerSolution) {
    this.addSellerSolution = addSellerSolution;
    }
        public String getAddSolutionType() {
    return this.addSolutionType;
    }
    public void setAddSolutionType(String addSolutionType) {
    this.addSolutionType = addSolutionType;
    }
        public String getBuyerLoginId() {
    return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId) {
    this.buyerLoginId = buyerLoginId;
    }
        public Long getBuyerSolutionId() {
    return this.buyerSolutionId;
    }
    public void setBuyerSolutionId(Long buyerSolutionId) {
    this.buyerSolutionId = buyerSolutionId;
    }
        public Long getIssueId() {
    return this.issueId;
    }
    public void setIssueId(Long issueId) {
    this.issueId = issueId;
    }
        public Long getModifySellerSolutionId() {
    return this.modifySellerSolutionId;
    }
    public void setModifySellerSolutionId(Long modifySellerSolutionId) {
    this.modifySellerSolutionId = modifySellerSolutionId;
    }
        public String getRefundAmount() {
    return this.refundAmount;
    }
    public void setRefundAmount(String refundAmount) {
    this.refundAmount = refundAmount;
    }
        public String getRefundAmountCurrency() {
    return this.refundAmountCurrency;
    }
    public void setRefundAmountCurrency(String refundAmountCurrency) {
    this.refundAmountCurrency = refundAmountCurrency;
    }
        public Long getReturnGoodAddressId() {
    return this.returnGoodAddressId;
    }
    public void setReturnGoodAddressId(Long returnGoodAddressId) {
    this.returnGoodAddressId = returnGoodAddressId;
    }
        public String getSolutionContext() {
    return this.solutionContext;
    }
    public void setSolutionContext(String solutionContext) {
    this.solutionContext = solutionContext;
    }
    }