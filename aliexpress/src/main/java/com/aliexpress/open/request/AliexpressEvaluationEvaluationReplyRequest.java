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
*  aliexpress.evaluation.evaluation.reply
*/
public class AliexpressEvaluationEvaluationReplyRequest extends BaseGopRequest<AliexpressEvaluationEvaluationReplyResponse> {

    /** 要回复的子订单id */
    private Long childOrderId;
    /** 父订单id */
    private Long parentOrderId;
    /** 回复内容 */
    private String text;

    public Long getChildOrderId(){
        return this.childOrderId;
    }
    public void setChildOrderId(Long childOrderId){
        this.childOrderId = childOrderId;
        }
    public Long getParentOrderId(){
        return this.parentOrderId;
    }
    public void setParentOrderId(Long parentOrderId){
        this.parentOrderId = parentOrderId;
        }
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
        }

    @Override
    public String getApiName() {
        return "aliexpress.evaluation.evaluation.reply";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (childOrderId != null) {
                        super.addApiParameter("child_order_id", childOrderId.toString());
                    }
                            if (parentOrderId != null) {
                        super.addApiParameter("parent_order_id", parentOrderId.toString());
                    }
                            if (text != null) {
                        super.addApiParameter("text", text.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressEvaluationEvaluationReplyResponse> getResponseClass() {
        return AliexpressEvaluationEvaluationReplyResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}