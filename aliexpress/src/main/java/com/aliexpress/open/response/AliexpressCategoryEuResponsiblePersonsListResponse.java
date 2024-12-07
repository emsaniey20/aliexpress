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
*  aliexpress.category.eu.responsible.persons.list
*/
public class AliexpressCategoryEuResponsiblePersonsListResponse extends IopResponse {

    /** 欧盟责任人列表 */
        @ApiListField("eu_contact_module_list")
        private List<AliexpressCategoryEuResponsiblePersonsListEuContactModule> euContactModuleList;
    /** 当前类目是否可以关联欧盟责任人 */
        @ApiField("support")
        private Boolean support;

public List<AliexpressCategoryEuResponsiblePersonsListEuContactModule> getEuContactModuleList(){
return this.euContactModuleList;
}
public void setEuContactModuleList(List<AliexpressCategoryEuResponsiblePersonsListEuContactModule> euContactModuleList){
    this.euContactModuleList = euContactModuleList;
}
public Boolean getSupport(){
return this.support;
}
public void setSupport(Boolean support){
    this.support = support;
}

}