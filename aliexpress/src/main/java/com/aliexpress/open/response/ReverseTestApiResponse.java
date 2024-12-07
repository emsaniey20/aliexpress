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
*  /reverse/test/api
*/
public class ReverseTestApiResponse extends IopResponse {

    /** 2 */
        @ApiField("result2")
        private ReverseTestApi result2;
    /** 1 */
        @ApiField("obj_result")
        private String objResult;

public ReverseTestApi getResult2(){
return this.result2;
}
public void setResult2(ReverseTestApi result2){
    this.result2 = result2;
}
public String getObjResult(){
return this.objResult;
}
public void setObjResult(String objResult){
    this.objResult = objResult;
}

}