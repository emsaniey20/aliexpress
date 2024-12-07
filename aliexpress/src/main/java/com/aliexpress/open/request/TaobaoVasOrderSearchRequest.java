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
*  taobao.vas.order.search
*/
public class TaobaoVasOrderSearchRequest extends BaseGopRequest<TaobaoVasOrderSearchResponse> {

    /** 订单创建时间（订购时间）结束值 */
    private String endCreated;
    /** 订单类型，1=新订 2=续订 3=升级 4=后台赠送 5=后台自动续订 6=订单审核后生成订购关系（暂时用不到） 空=全部 */
    private Long bizType;
    /** 订单id号 */
    private Long bizOrderId;
    /** 子订单id号 */
    private Long orderId;
    /** 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码 */
    private String itemCode;
    /** 订单创建时间（订购时间）起始值（当start_created和end_created都不填写时，默认返回最近90天的数据） */
    private String startCreated;
    /** 应用收费代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的收费代码 */
    private String articleCode;
    /** 一页包含的记录数 */
    private String pageNo;
    /** 页码 */
    private String pageSize;
    /** ae会员 */
    private String nick;

    public String getEndCreated(){
        return this.endCreated;
    }
    public void setEndCreated(String endCreated){
        this.endCreated = endCreated;
        }
    public Long getBizType(){
        return this.bizType;
    }
    public void setBizType(Long bizType){
        this.bizType = bizType;
        }
    public Long getBizOrderId(){
        return this.bizOrderId;
    }
    public void setBizOrderId(Long bizOrderId){
        this.bizOrderId = bizOrderId;
        }
    public Long getOrderId(){
        return this.orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId = orderId;
        }
    public String getItemCode(){
        return this.itemCode;
    }
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
        }
    public String getStartCreated(){
        return this.startCreated;
    }
    public void setStartCreated(String startCreated){
        this.startCreated = startCreated;
        }
    public String getArticleCode(){
        return this.articleCode;
    }
    public void setArticleCode(String articleCode){
        this.articleCode = articleCode;
        }
    public String getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(String pageNo){
        this.pageNo = pageNo;
        }
    public String getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(String pageSize){
        this.pageSize = pageSize;
        }
    public String getNick(){
        return this.nick;
    }
    public void setNick(String nick){
        this.nick = nick;
        }

    @Override
    public String getApiName() {
        return "taobao.vas.order.search";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (endCreated != null) {
                        super.addApiParameter("end_created", endCreated.toString());
                    }
                            if (bizType != null) {
                        super.addApiParameter("biz_type", bizType.toString());
                    }
                            if (bizOrderId != null) {
                        super.addApiParameter("biz_order_id", bizOrderId.toString());
                    }
                            if (orderId != null) {
                        super.addApiParameter("order_id", orderId.toString());
                    }
                            if (itemCode != null) {
                        super.addApiParameter("item_code", itemCode.toString());
                    }
                            if (startCreated != null) {
                        super.addApiParameter("start_created", startCreated.toString());
                    }
                            if (articleCode != null) {
                        super.addApiParameter("article_code", articleCode.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (nick != null) {
                        super.addApiParameter("nick", nick.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                    return super.getFileParams();
    }

    @Override
    public Class<TaobaoVasOrderSearchResponse> getResponseClass() {
        return TaobaoVasOrderSearchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}