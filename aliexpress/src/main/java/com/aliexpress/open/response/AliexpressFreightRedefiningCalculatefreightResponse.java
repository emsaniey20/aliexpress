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
*  aliexpress.freight.redefining.calculatefreight
*/
public class AliexpressFreightRedefiningCalculatefreightResponse extends IopResponse {

    /** errorDesc */
        @ApiField("result_error_desc")
        private String resultErrorDesc;
    /** success */
        @ApiField("result_success")
        private Boolean resultSuccess;
    /** aeopFreightCalculateResultDTOList */
        @ApiListField("aeop_freight_calculate_result_d_t_o_list")
        private List<AliexpressFreightRedefiningCalculatefreightAeopFreightCalculateResultDTO> aeopFreightCalculateResultDTOList;

public String getResultErrorDesc(){
return this.resultErrorDesc;
}
public void setResultErrorDesc(String resultErrorDesc){
    this.resultErrorDesc = resultErrorDesc;
}
public Boolean getResultSuccess(){
return this.resultSuccess;
}
public void setResultSuccess(Boolean resultSuccess){
    this.resultSuccess = resultSuccess;
}
public List<AliexpressFreightRedefiningCalculatefreightAeopFreightCalculateResultDTO> getAeopFreightCalculateResultDTOList(){
return this.aeopFreightCalculateResultDTOList;
}
public void setAeopFreightCalculateResultDTOList(List<AliexpressFreightRedefiningCalculatefreightAeopFreightCalculateResultDTO> aeopFreightCalculateResultDTOList){
    this.aeopFreightCalculateResultDTOList = aeopFreightCalculateResultDTOList;
}

}