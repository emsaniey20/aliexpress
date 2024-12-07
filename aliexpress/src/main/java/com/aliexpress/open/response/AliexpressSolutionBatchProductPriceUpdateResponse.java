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
*  aliexpress.solution.batch.product.price.update
*/
public class AliexpressSolutionBatchProductPriceUpdateResponse extends IopResponse {

    /** When success equals false, indicating the error code */
        @ApiField("update_error_code")
        private String updateErrorCode;
    /** When success equals false, indicating the error message */
        @ApiField("update_error_message")
        private String updateErrorMessage;
    /** update failed list */
        @ApiListField("update_failed_list")
        private List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductResponseDTO> updateFailedList;
    /** update successful list */
        @ApiListField("update_successful_list")
        private List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductResponseDTO> updateSuccessfulList;
    /** Indicates the update result is successful or not. Only all the products in mutiple_product_update_list have been updated successfully will make the success to be true, otherwise false. */
        @ApiField("update_success")
        private Boolean updateSuccess;

public String getUpdateErrorCode(){
return this.updateErrorCode;
}
public void setUpdateErrorCode(String updateErrorCode){
    this.updateErrorCode = updateErrorCode;
}
public String getUpdateErrorMessage(){
return this.updateErrorMessage;
}
public void setUpdateErrorMessage(String updateErrorMessage){
    this.updateErrorMessage = updateErrorMessage;
}
public List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductResponseDTO> getUpdateFailedList(){
return this.updateFailedList;
}
public void setUpdateFailedList(List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductResponseDTO> updateFailedList){
    this.updateFailedList = updateFailedList;
}
public List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductResponseDTO> getUpdateSuccessfulList(){
return this.updateSuccessfulList;
}
public void setUpdateSuccessfulList(List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductResponseDTO> updateSuccessfulList){
    this.updateSuccessfulList = updateSuccessfulList;
}
public Boolean getUpdateSuccess(){
return this.updateSuccess;
}
public void setUpdateSuccess(Boolean updateSuccess){
    this.updateSuccess = updateSuccess;
}

}