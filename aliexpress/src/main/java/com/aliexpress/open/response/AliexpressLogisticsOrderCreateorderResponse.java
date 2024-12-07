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
*  aliexpress.logistics.order.createorder
*/
public class AliexpressLogisticsOrderCreateorderResponse extends IopResponse {

    /** 接口透出额外提示错误或者文案json格式 */
        @ApiField("ext_info")
        private String extInfo;
    /** result */
        @ApiField("result")
        private AliexpressLogisticsOrderCreateorderAeopWlCreateWarehouseOrderResultDTO result;
    /** 调用是否成功 */
        @ApiField("result_success")
        private Boolean resultSuccess;

public String getExtInfo(){
return this.extInfo;
}
public void setExtInfo(String extInfo){
    this.extInfo = extInfo;
}
public AliexpressLogisticsOrderCreateorderAeopWlCreateWarehouseOrderResultDTO getResult(){
return this.result;
}
public void setResult(AliexpressLogisticsOrderCreateorderAeopWlCreateWarehouseOrderResultDTO result){
    this.result = result;
}
public Boolean getResultSuccess(){
return this.resultSuccess;
}
public void setResultSuccess(Boolean resultSuccess){
    this.resultSuccess = resultSuccess;
}

}