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
*  /wl/local/12
*/
public class WlLocal12Response extends IopResponse {

    /** 中文出参描述1回退前6 */
        @ApiField("result")
        private String result;
    /** result2中文出参描述1回退前6 */
        @ApiField("result2")
        private String result2;

public String getResult(){
return this.result;
}
public void setResult(String result){
    this.result = result;
}
public String getResult2(){
return this.result2;
}
public void setResult2(String result2){
    this.result2 = result2;
}

}