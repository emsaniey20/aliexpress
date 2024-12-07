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
*  aliexpress.category.qualifications.list
*/
public class AliexpressCategoryQualificationsListResponse extends IopResponse {

    /** 资质信息 */
        @ApiListField("qualification_module_list")
        private List<AliexpressCategoryQualificationsListQualificationModule> qualificationModuleList;
    /** 当前类目是否可以上传资质信息 */
        @ApiField("support")
        private Boolean support;

public List<AliexpressCategoryQualificationsListQualificationModule> getQualificationModuleList(){
return this.qualificationModuleList;
}
public void setQualificationModuleList(List<AliexpressCategoryQualificationsListQualificationModule> qualificationModuleList){
    this.qualificationModuleList = qualificationModuleList;
}
public Boolean getSupport(){
return this.support;
}
public void setSupport(Boolean support){
    this.support = support;
}

}