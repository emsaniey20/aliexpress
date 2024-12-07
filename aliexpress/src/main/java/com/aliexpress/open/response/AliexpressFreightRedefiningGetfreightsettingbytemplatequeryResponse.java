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
*  aliexpress.freight.redefining.getfreightsettingbytemplatequery
*/
public class AliexpressFreightRedefiningGetfreightsettingbytemplatequeryResponse extends IopResponse {

    /** 运费模板Id */
        @ApiField("template_id")
        private Integer templateId;
    /** errorDesc */
        @ApiField("error_desc")
        private String errorDesc;
    /** isDefault */
        @ApiField("is_default")
        private Boolean isDefault;
    /** isSuccess */
        @ApiField("is_success")
        private Boolean isSuccess;
    /** freightSettingList */
        @ApiListField("freight_setting_list")
        private List<AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSetting> freightSettingList;
    /** templateName */
        @ApiField("template_name")
        private String templateName;

public Integer getTemplateId(){
return this.templateId;
}
public void setTemplateId(Integer templateId){
    this.templateId = templateId;
}
public String getErrorDesc(){
return this.errorDesc;
}
public void setErrorDesc(String errorDesc){
    this.errorDesc = errorDesc;
}
public Boolean getIsDefault(){
return this.isDefault;
}
public void setIsDefault(Boolean isDefault){
    this.isDefault = isDefault;
}
public Boolean getIsSuccess(){
return this.isSuccess;
}
public void setIsSuccess(Boolean isSuccess){
    this.isSuccess = isSuccess;
}
public List<AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSetting> getFreightSettingList(){
return this.freightSettingList;
}
public void setFreightSettingList(List<AliexpressFreightRedefiningGetfreightsettingbytemplatequeryAeopFreightSetting> freightSettingList){
    this.freightSettingList = freightSettingList;
}
public String getTemplateName(){
return this.templateName;
}
public void setTemplateName(String templateName){
    this.templateName = templateName;
}

}