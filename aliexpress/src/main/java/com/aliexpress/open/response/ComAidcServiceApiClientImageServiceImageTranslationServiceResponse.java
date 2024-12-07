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
*  com.aidc.service.api.client.image.service.ImageTranslationService
*/
public class ComAidcServiceApiClientImageServiceImageTranslationServiceResponse extends IopResponse {

    /** example */
        @ApiField("code")
        private Integer code;
    /** example */
        @ApiField("data")
        private String data;
    /** example */
        @ApiField("success")
        private Boolean success;
    /** example */
        @ApiField("resMessage")
        private String resMessage;

public Integer getCode(){
return this.code;
}
public void setCode(Integer code){
    this.code = code;
}
public String getData(){
return this.data;
}
public void setData(String data){
    this.data = data;
}
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getResMessage(){
return this.resMessage;
}
public void setResMessage(String resMessage){
    this.resMessage = resMessage;
}

}