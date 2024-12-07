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

public class AliexpressPhotobankRedefiningListgroupAeopPhotoBankImageGroupResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片银行分组列表，如果没有任何的分组信息。这个属性为:[]。 */
                @ApiListField("photo_bank_image_group_list")
            private List<AliexpressPhotobankRedefiningListgroupAeopPhotoBankImageGroupDTO> photoBankImageGroupList;
        /** 本次调用是否成功。 */
                @ApiField("success")
            private Boolean success;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AliexpressPhotobankRedefiningListgroupAeopPhotoBankImageGroupDTO> getPhotoBankImageGroupList() {
    return this.photoBankImageGroupList;
    }
    public void setPhotoBankImageGroupList(List<AliexpressPhotobankRedefiningListgroupAeopPhotoBankImageGroupDTO> photoBankImageGroupList) {
    this.photoBankImageGroupList = photoBankImageGroupList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }