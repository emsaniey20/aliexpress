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

public class AliexpressSolutionFeedInvalidateInvalidFeedListResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** successful list */
                @ApiListField("invalid_successful_list")
            private List<Long> invalidSuccessfulList;
        /** Whether the invalidation operation was successful or not */
                @ApiField("success")
            private Boolean success;
        /** no need to be invalidated jobs. Usually caused by that the job is being or has already been executed. */
                @ApiListField("no_need_invalid_list")
            private List<Long> noNeedInvalidList;
        /** failed list	 */
                @ApiListField("invalid_failed_list")
            private List<Long> invalidFailedList;
        /** error code */
                @ApiField("error_code")
            private String errorCode;
        /** error message */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<Long> getInvalidSuccessfulList() {
    return this.invalidSuccessfulList;
    }
    public void setInvalidSuccessfulList(List<Long> invalidSuccessfulList) {
    this.invalidSuccessfulList = invalidSuccessfulList;
    }
        public Boolean getSuccess() {
    return this.success;
    }
    public void setSuccess(Boolean success) {
    this.success = success;
    }
        public List<Long> getNoNeedInvalidList() {
    return this.noNeedInvalidList;
    }
    public void setNoNeedInvalidList(List<Long> noNeedInvalidList) {
    this.noNeedInvalidList = noNeedInvalidList;
    }
        public List<Long> getInvalidFailedList() {
    return this.invalidFailedList;
    }
    public void setInvalidFailedList(List<Long> invalidFailedList) {
    this.invalidFailedList = invalidFailedList;
    }
        public String getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }