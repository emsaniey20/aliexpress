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
*  aliexpress.social.vksharing.ranking.get
*/
public class AliexpressSocialVksharingRankingGetResponse extends IopResponse {

    /** feed ranked list */
        @ApiListField("list")
        private List<AliexpressSocialVksharingRankingGetVkUgcDTO> list;
    /** result id */
        @ApiField("pvid")
        private String pvid;
    /** recommendation service id */
        @ApiField("scm")
        private String scm;

public List<AliexpressSocialVksharingRankingGetVkUgcDTO> getList(){
return this.list;
}
public void setList(List<AliexpressSocialVksharingRankingGetVkUgcDTO> list){
    this.list = list;
}
public String getPvid(){
return this.pvid;
}
public void setPvid(String pvid){
    this.pvid = pvid;
}
public String getScm(){
return this.scm;
}
public void setScm(String scm){
    this.scm = scm;
}

}