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
*  aliexpress.choice.product.warehouse.list
*/
public class AliexpressChoiceProductWarehouseListResponse extends IopResponse {

    /** 仓库列表 */
        @ApiListField("warehouse_list")
        private List<AliexpressChoiceProductWarehouseListProductWarehouseDTO> warehouseList;
    /** 请求结果：成功，失败 */
        @ApiField("success")
        private Boolean success;
    /** 错误信息 */
        @ApiField("errorMessage")
        private String errorMessage;
    /** 错误码 */
        @ApiField("errorCode")
        private String errorCode;

public List<AliexpressChoiceProductWarehouseListProductWarehouseDTO> getWarehouseList(){
return this.warehouseList;
}
public void setWarehouseList(List<AliexpressChoiceProductWarehouseListProductWarehouseDTO> warehouseList){
    this.warehouseList = warehouseList;
}
public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public String getErrorCode(){
return this.errorCode;
}
public void setErrorCode(String errorCode){
    this.errorCode = errorCode;
}

}