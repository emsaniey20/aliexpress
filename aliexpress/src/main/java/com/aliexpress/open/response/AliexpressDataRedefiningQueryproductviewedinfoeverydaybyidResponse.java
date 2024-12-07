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
*  aliexpress.data.redefining.queryproductviewedinfoeverydaybyid
*/
public class AliexpressDataRedefiningQueryproductviewedinfoeverydaybyidResponse extends IopResponse {

    /** "result": "{"itemList":[{"count": 浏览量, "date": 日期},{"count": 浏览量, "date": 日期}],"success": 本次调用是否成功, "totalItem": 总记录数 }"。  没有结果时的返回： {\"itemList\":商品列表为空,\"success\":本次调用是否成功,\"totalItem\":商品数为0} */
        @ApiField("result")
        private String result;

public String getResult(){
return this.result;
}
public void setResult(String result){
    this.result = result;
}

}