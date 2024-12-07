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
*  aliexpress.social.item.promotion
*/
public class AliexpressSocialItemPromotionResponse extends IopResponse {

    /** 推广链接 */
        @ApiField("promotion_url")
        private String promotionUrl;
    /** 是否成功 */
        @ApiField("is_success")
        private Boolean isSuccess;
    /** 错误码 */
        @ApiField("result_code")
        private String resultCode;
    /** 错误信息 */
        @ApiField("result_msg")
        private String resultMsg;

public String getPromotionUrl(){
return this.promotionUrl;
}
public void setPromotionUrl(String promotionUrl){
    this.promotionUrl = promotionUrl;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}
public String getResultCode(){
return this.resultCode;
}
public void setResultCode(String resultCode){
    this.resultCode = resultCode;
}
public String getResultMsg(){
return this.resultMsg;
}
public void setResultMsg(String resultMsg){
    this.resultMsg = resultMsg;
}

}