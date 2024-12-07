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

public class TaobaoVasSubscSearchArticleSub implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 会员名 */
                @ApiField("nick")
            private String nick;
        /** 收费项目名称 */
                @ApiField("item_name")
            private String itemName;
        /** 是否到期提醒 */
                @ApiField("expire_notice")
            private Boolean expireNotice;
        /** 应用名称 */
                @ApiField("article_name")
            private String articleName;
        /** 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码 */
                @ApiField("item_code")
            private String itemCode;
        /** 是否自动续费 */
                @ApiField("autosub")
            private Boolean autosub;
        /** 订购关系到期时间 */
                @ApiField("deadline")
            private String deadline;
        /** 应用收费代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的收费代码 */
                @ApiField("article_code")
            private String articleCode;
        /** 状态，1=有效 2=过期 */
                @ApiField("status")
            private Integer status;
    
        public String getNick() {
    return this.nick;
    }
    public void setNick(String nick) {
    this.nick = nick;
    }
        public String getItemName() {
    return this.itemName;
    }
    public void setItemName(String itemName) {
    this.itemName = itemName;
    }
        public Boolean getExpireNotice() {
    return this.expireNotice;
    }
    public void setExpireNotice(Boolean expireNotice) {
    this.expireNotice = expireNotice;
    }
        public String getArticleName() {
    return this.articleName;
    }
    public void setArticleName(String articleName) {
    this.articleName = articleName;
    }
        public String getItemCode() {
    return this.itemCode;
    }
    public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
    }
        public Boolean getAutosub() {
    return this.autosub;
    }
    public void setAutosub(Boolean autosub) {
    this.autosub = autosub;
    }
        public String getDeadline() {
    return this.deadline;
    }
    public void setDeadline(String deadline) {
    this.deadline = deadline;
    }
        public String getArticleCode() {
    return this.articleCode;
    }
    public void setArticleCode(String articleCode) {
    this.articleCode = articleCode;
    }
        public Integer getStatus() {
    return this.status;
    }
    public void setStatus(Integer status) {
    this.status = status;
    }
    }