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

public class GlobalMediacenterFolderQueryBaseResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 文件夹信息 */
                @ApiListField("folder_list")
            private List<GlobalMediacenterFolderQueryMediaFolderOpenDTO> folderList;
        /** 调用是否成功 */
                @ApiField("success")
            private Boolean success;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
        /** 错误码 */
                @ApiField("error_code")
            private String errorCode;
    
        public List<GlobalMediacenterFolderQueryMediaFolderOpenDTO> getFolderList() {
    return this.folderList;
    }
    public void setFolderList(List<GlobalMediacenterFolderQueryMediaFolderOpenDTO> folderList) {
    this.folderList = folderList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
    }