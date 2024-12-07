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
*  aliexpress.trade.redefining.extendsbuyeracceptgoodstime
*/
public class AliexpressTradeRedefiningExtendsbuyeracceptgoodstimeResponse extends IopResponse {

    /** 错误详细说明 */
        @ApiField("memo")
        private String memo;
    /** 错误码(100:查询无此订单ID;200:业务数据错误，无对应的业务数据;201:延长时间超过了系统允许时间;210:业务数据错误 无法执行此操作;601:查询该帐号无权限进行数据修改) */
        @ApiField("sub_error_code")
        private Long subErrorCode;
    /** 是否成功true/false */
        @ApiField("is_success")
        private Boolean isSuccess;

public String getMemo(){
return this.memo;
}
public void setMemo(String memo){
    this.memo = memo;
}
public Long getSubErrorCode(){
return this.subErrorCode;
}
public void setSubErrorCode(Long subErrorCode){
    this.subErrorCode = subErrorCode;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}

}