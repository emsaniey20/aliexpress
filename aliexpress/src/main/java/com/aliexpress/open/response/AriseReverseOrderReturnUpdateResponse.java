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
*  arise.reverse.order.return.update
*/
public class AriseReverseOrderReturnUpdateResponse extends IopResponse {

    /** 结果 */
        @ApiField("result")
        private AriseReverseOrderReturnUpdateresultResponse result;

public AriseReverseOrderReturnUpdateresultResponse getResult(){
return this.result;
}
public void setResult(AriseReverseOrderReturnUpdateresultResponse result){
    this.result = result;
}

}