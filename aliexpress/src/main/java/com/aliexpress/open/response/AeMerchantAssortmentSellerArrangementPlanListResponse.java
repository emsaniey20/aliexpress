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
*  ae.merchant.assortment.seller.arrangement.plan.list
*/
public class AeMerchantAssortmentSellerArrangementPlanListResponse extends IopResponse {

    /** - */
        @ApiField("data")
        private HashMap<String, Object> data;
    /** - */
        @ApiField("success")
        private Boolean success;
    /** - */
        @ApiField("error_code")
        private String errorCode;
    /** - */
        @ApiField("type")
        private String type;
    /** - */
        @ApiField("error")
        private String error;

public HashMap<String, Object> getData(){
return this.data;
}
public void setData(HashMap<String, Object> data){
    this.data = data;
}
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getErrorCode(){
return this.errorCode;
}
public void setErrorCode(String errorCode){
    this.errorCode = errorCode;
}
public String getType(){
return this.type;
}
public void setType(String type){
    this.type = type;
}
public String getError(){
return this.error;
}
public void setError(String error){
    this.error = error;
}

}