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
*  aliexpress.taxation.platform.open.get
*/
public class AliexpressTaxationPlatformOpenGetResponse extends IopResponse {

    /** 返回结果 */
        @ApiField("result")
        private AliexpressTaxationPlatformOpenGetResponseDTO result;

public AliexpressTaxationPlatformOpenGetResponseDTO getResult(){
return this.result;
}
public void setResult(AliexpressTaxationPlatformOpenGetResponseDTO result){
    this.result = result;
}

}