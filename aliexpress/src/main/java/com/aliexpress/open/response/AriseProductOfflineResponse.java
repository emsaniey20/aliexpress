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
*  arise.product.offline
*/
public class AriseProductOfflineResponse extends IopResponse {

    /** 错误信息 */
        @ApiListField("error_detail_list")
        private List<AriseProductOfflineErrorDetail> errorDetailList;
    /** 成功商品id */
        @ApiListField("success_product_id_list")
        private List<Long> successProductIdList;

public List<AriseProductOfflineErrorDetail> getErrorDetailList(){
return this.errorDetailList;
}
public void setErrorDetailList(List<AriseProductOfflineErrorDetail> errorDetailList){
    this.errorDetailList = errorDetailList;
}
public List<Long> getSuccessProductIdList(){
return this.successProductIdList;
}
public void setSuccessProductIdList(List<Long> successProductIdList){
    this.successProductIdList = successProductIdList;
}

}