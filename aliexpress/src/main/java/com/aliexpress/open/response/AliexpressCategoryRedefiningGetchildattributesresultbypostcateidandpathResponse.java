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
*  aliexpress.category.redefining.getchildattributesresultbypostcateidandpath
*/
public class AliexpressCategoryRedefiningGetchildattributesresultbypostcateidandpathResponse extends IopResponse {

    /** 发布属性，每个类目下的普通属性都可以支持新增自定义属性名和属性值具体操作请看商品发布接口，sku下有部分销售属性可以自定义名称和图片。 */
        @ApiField("result")
        private AliexpressCategoryRedefiningGetchildattributesresultbypostcateidandpathAeopAttributeResponse result;

public AliexpressCategoryRedefiningGetchildattributesresultbypostcateidandpathAeopAttributeResponse getResult(){
return this.result;
}
public void setResult(AliexpressCategoryRedefiningGetchildattributesresultbypostcateidandpathAeopAttributeResponse result){
    this.result = result;
}

}