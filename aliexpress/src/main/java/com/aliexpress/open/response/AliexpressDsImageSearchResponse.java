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
*  aliexpress.ds.image.search
*/
public class AliexpressDsImageSearchResponse extends IopResponse {

    /** result code */
        @ApiField("rsp_code")
        private String rspCode;
    /** result object */
        @ApiField("data")
        private AliexpressDsImageSearchTrafficImageSearchResultDTO data;
    /** result msg */
        @ApiField("rsp_msg")
        private String rspMsg;
    /** total record count */
        @ApiField("total_record_count")
        private Integer totalRecordCount;

public String getRspCode(){
return this.rspCode;
}
public void setRspCode(String rspCode){
    this.rspCode = rspCode;
}
public AliexpressDsImageSearchTrafficImageSearchResultDTO getData(){
return this.data;
}
public void setData(AliexpressDsImageSearchTrafficImageSearchResultDTO data){
    this.data = data;
}
public String getRspMsg(){
return this.rspMsg;
}
public void setRspMsg(String rspMsg){
    this.rspMsg = rspMsg;
}
public Integer getTotalRecordCount(){
return this.totalRecordCount;
}
public void setTotalRecordCount(Integer totalRecordCount){
    this.totalRecordCount = totalRecordCount;
}

}