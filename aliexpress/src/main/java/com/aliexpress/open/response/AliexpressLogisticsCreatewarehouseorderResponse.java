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
*  aliexpress.logistics.createwarehouseorder
*/
public class AliexpressLogisticsCreatewarehouseorderResponse extends IopResponse {

    /** result */
        @ApiField("result")
        private AliexpressLogisticsCreatewarehouseorderAeopWlCreateWarehouseOrderResultDTO result;
    /** 调用是否成功 */
        @ApiField("result_success")
        private Boolean resultSuccess;

public AliexpressLogisticsCreatewarehouseorderAeopWlCreateWarehouseOrderResultDTO getResult(){
return this.result;
}
public void setResult(AliexpressLogisticsCreatewarehouseorderAeopWlCreateWarehouseOrderResultDTO result){
    this.result = result;
}
public Boolean getResultSuccess(){
return this.resultSuccess;
}
public void setResultSuccess(Boolean resultSuccess){
    this.resultSuccess = resultSuccess;
}

}