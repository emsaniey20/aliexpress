package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  aliexpress.member.ds.orderdata.save
*/
public class AliexpressMemberDsOrderdataSaveResponse extends IopResponse {

    /** 业务错误信息 */
        @ApiField("biz_error_message")
        private String bizErrorMessage;
    /** 成功保存数据的行数 */
        @ApiField("update_rows")
        private Integer updateRows;
    /** 业务错误Code */
        @ApiField("biz_error_code")
        private String bizErrorCode;
    /** 数据保存是否成功 */
        @ApiField("is_success")
        private Boolean isSuccess;

public String getBizErrorMessage(){
return this.bizErrorMessage;
}
public void setBizErrorMessage(String bizErrorMessage){
    this.bizErrorMessage = bizErrorMessage;
}
public Integer getUpdateRows(){
return this.updateRows;
}
public void setUpdateRows(Integer updateRows){
    this.updateRows = updateRows;
}
public String getBizErrorCode(){
return this.bizErrorCode;
}
public void setBizErrorCode(String bizErrorCode){
    this.bizErrorCode = bizErrorCode;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}

}