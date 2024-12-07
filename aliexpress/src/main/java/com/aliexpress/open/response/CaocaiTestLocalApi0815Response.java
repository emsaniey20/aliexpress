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
*  caocai.test.local.api.0815
*/
public class CaocaiTestLocalApi0815Response extends IopResponse {

    /** 测试 */
        @ApiField("result")
        private CaocaiTestLocalApi0815tes result;

public CaocaiTestLocalApi0815tes getResult(){
return this.result;
}
public void setResult(CaocaiTestLocalApi0815tes result){
    this.result = result;
}

}