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
*  aliexpress.logistics.getannouncement
*/
public class AliexpressLogisticsGetannouncementResponse extends IopResponse {

    /** 明细条目执行结果对象 */
        @ApiField("resultdata")
        private AliexpressLogisticsGetannouncementResultdata resultdata;

public AliexpressLogisticsGetannouncementResultdata getResultdata(){
return this.resultdata;
}
public void setResultdata(AliexpressLogisticsGetannouncementResultdata resultdata){
    this.resultdata = resultdata;
}

}