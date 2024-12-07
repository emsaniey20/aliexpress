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
*  /aliexpress/spi/im/plugins/list
*/
public class AliexpressSpiImPluginsListResponse extends IopResponse {

    /** 返回值 */
        @ApiField("resp")
        private AliexpressSpiImPluginsList resp;

public AliexpressSpiImPluginsList getResp(){
return this.resp;
}
public void setResp(AliexpressSpiImPluginsList resp){
    this.resp = resp;
}

}