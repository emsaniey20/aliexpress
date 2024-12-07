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
*  global.hscode.keywords.query
*/
public class GlobalHscodeKeywordsQueryResponse extends IopResponse {

    /** 成功、失败 */
        @ApiField("success")
        private Boolean success;
    /** hscode list */
        @ApiListField("hs_code_response_list")
        private List<GlobalHscodeKeywordsQueryHsCodeResponseDTO> hsCodeResponseList;

public Boolean getSuccess(){
return this.success;
}
public void setSuccess(Boolean success){
    this.success = success;
}
public List<GlobalHscodeKeywordsQueryHsCodeResponseDTO> getHsCodeResponseList(){
return this.hsCodeResponseList;
}
public void setHsCodeResponseList(List<GlobalHscodeKeywordsQueryHsCodeResponseDTO> hsCodeResponseList){
    this.hsCodeResponseList = hsCodeResponseList;
}

}