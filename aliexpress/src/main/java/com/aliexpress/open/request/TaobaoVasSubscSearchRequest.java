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
*  taobao.vas.subsc.search
*/
public class TaobaoVasSubscSearchRequest extends BaseGopRequest<TaobaoVasSubscSearchResponse> {

    /** 到期时间结束值 */
    private String endDeadline;
    /** 到期时间起始值（当start_deadline和end_deadline都不填写时，默认返回最近90天的数据） */
    private String startDeadline;
    /** 是否到期提醒，true=到期提醒 false=非到期提醒 空=全部 */
    private Boolean expireNotice;
    /** 页码 */
    private Integer pageNo;
    /** 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码 */
    private String itemCode;
    /** 一页包含的记录数 */
    private Integer pageSize;
    /** 是否自动续费，true=自动续费 false=非自动续费 空=全部 */
    private Boolean autosub;
    /** 应用收费代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的收费代码 */
    private String articleCode;
    /** 订购记录状态，1=有效 2=过期 空=全部 */
    private Long status;
    /** ae会员 */
    private String nick;

    public String getEndDeadline(){
        return this.endDeadline;
    }
    public void setEndDeadline(String endDeadline){
        this.endDeadline = endDeadline;
        }
    public String getStartDeadline(){
        return this.startDeadline;
    }
    public void setStartDeadline(String startDeadline){
        this.startDeadline = startDeadline;
        }
    public Boolean getExpireNotice(){
        return this.expireNotice;
    }
    public void setExpireNotice(Boolean expireNotice){
        this.expireNotice = expireNotice;
        }
    public Integer getPageNo(){
        return this.pageNo;
    }
    public void setPageNo(Integer pageNo){
        this.pageNo = pageNo;
        }
    public String getItemCode(){
        return this.itemCode;
    }
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
        }
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        }
    public Boolean getAutosub(){
        return this.autosub;
    }
    public void setAutosub(Boolean autosub){
        this.autosub = autosub;
        }
    public String getArticleCode(){
        return this.articleCode;
    }
    public void setArticleCode(String articleCode){
        this.articleCode = articleCode;
        }
    public Long getStatus(){
        return this.status;
    }
    public void setStatus(Long status){
        this.status = status;
        }
    public String getNick(){
        return this.nick;
    }
    public void setNick(String nick){
        this.nick = nick;
        }

    @Override
    public String getApiName() {
        return "taobao.vas.subsc.search";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (endDeadline != null) {
                        super.addApiParameter("end_deadline", endDeadline.toString());
                    }
                            if (startDeadline != null) {
                        super.addApiParameter("start_deadline", startDeadline.toString());
                    }
                            if (expireNotice != null) {
                        super.addApiParameter("expire_notice", expireNotice.toString());
                    }
                            if (pageNo != null) {
                        super.addApiParameter("page_no", pageNo.toString());
                    }
                            if (itemCode != null) {
                        super.addApiParameter("item_code", itemCode.toString());
                    }
                            if (pageSize != null) {
                        super.addApiParameter("page_size", pageSize.toString());
                    }
                            if (autosub != null) {
                        super.addApiParameter("autosub", autosub.toString());
                    }
                            if (articleCode != null) {
                        super.addApiParameter("article_code", articleCode.toString());
                    }
                            if (status != null) {
                        super.addApiParameter("status", status.toString());
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
    public Class<TaobaoVasSubscSearchResponse> getResponseClass() {
        return TaobaoVasSubscSearchResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}