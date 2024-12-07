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

public class CainiaoGlobalCommithandovercontentUpdateOpenHandoverContentUpdateCommitRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 用户信息 */
                @ApiField("user_info")
            private CainiaoGlobalCommithandovercontentUpdateUserInfoDTO userInfo;
        /** 大包号;LP开头的单号(必填) */
                @ApiField("handover_content_code")
            private String handoverContentCode;
        /** 新增和修改大包小包号;新增和修改的时候必填 */
                @ApiListField("parcel_order_list")
            private List<CainiaoGlobalCommithandovercontentUpdateHandoverContentUpdateParcelDTO> parcelOrderList;
        /** 业务类型(选填) */
                @ApiField("biz_source")
            private String bizSource;
        /** 完成更新(必填)例如传入true则代表大包已经完成修改,不能再做修改的操作 */
                @ApiField("complete_update")
            private Boolean completeUpdate;
        /** 客户端标示(选填) */
                @ApiField("client")
            private String client;
        /** 语言(选填) */
                @ApiField("locale")
            private String locale;
        /** 更新类型:add、remove、commit;add新增parcel_order_list中小包,remove删除parcel_order_list中小包;commit,忽略parcel_order_list小包,将大包设置为完成组包状态,将大包信息下发给司机上门揽收 */
                @ApiField("update_type")
            private String updateType;
    
        public CainiaoGlobalCommithandovercontentUpdateUserInfoDTO getUserInfo() {
    return this.userInfo;
    }
    public void setUserInfo(CainiaoGlobalCommithandovercontentUpdateUserInfoDTO userInfo) {
    this.userInfo = userInfo;
    }
        public String getHandoverContentCode() {
    return this.handoverContentCode;
    }
    public void setHandoverContentCode(String handoverContentCode) {
    this.handoverContentCode = handoverContentCode;
    }
        public List<CainiaoGlobalCommithandovercontentUpdateHandoverContentUpdateParcelDTO> getParcelOrderList() {
    return this.parcelOrderList;
    }
    public void setParcelOrderList(List<CainiaoGlobalCommithandovercontentUpdateHandoverContentUpdateParcelDTO> parcelOrderList) {
    this.parcelOrderList = parcelOrderList;
    }
        public String getBizSource() {
    return this.bizSource;
    }
    public void setBizSource(String bizSource) {
    this.bizSource = bizSource;
    }
        public Boolean getCompleteUpdate() {
    return this.completeUpdate;
    }
    public void setCompleteUpdate(Boolean completeUpdate) {
    this.completeUpdate = completeUpdate;
    }
        public String getClient() {
    return this.client;
    }
    public void setClient(String client) {
    this.client = client;
    }
        public String getLocale() {
    return this.locale;
    }
    public void setLocale(String locale) {
    this.locale = locale;
    }
        public String getUpdateType() {
    return this.updateType;
    }
    public void setUpdateType(String updateType) {
    this.updateType = updateType;
    }
    }