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
*  /globalopen/auth/get
*/
public class GlobalopenAuthGetResponse extends IopResponse {

    /** platform_id */
        @ApiField("platform_id")
        private Integer platformId;
    /** id */
        @ApiField("id")
        private Integer id;
    /** gmt_create */
        @ApiField("gmt_create")
        private String gmtCreate;
    /** ex_property */
        @ApiField("ex_property")
        private String exProperty;
    /** real_object_id */
        @ApiField("real_object_id")
        private String realObjectId;
    /** ex_empty */
        @ApiField("ex_empty")
        private Boolean exEmpty;
    /** gmt_modified */
        @ApiField("gmt_modified")
        private String gmtModified;
    /** feature */
        @ApiField("feature")
        private String feature;

public Integer getPlatformId(){
return this.platformId;
}
public void setPlatformId(Integer platformId){
    this.platformId = platformId;
}
public Integer getId(){
return this.id;
}
public void setId(Integer id){
    this.id = id;
}
public String getGmtCreate(){
return this.gmtCreate;
}
public void setGmtCreate(String gmtCreate){
    this.gmtCreate = gmtCreate;
}
public String getExProperty(){
return this.exProperty;
}
public void setExProperty(String exProperty){
    this.exProperty = exProperty;
}
public String getRealObjectId(){
return this.realObjectId;
}
public void setRealObjectId(String realObjectId){
    this.realObjectId = realObjectId;
}
public Boolean getExEmpty(){
return this.exEmpty;
}
public void setExEmpty(Boolean exEmpty){
    this.exEmpty = exEmpty;
}
public String getGmtModified(){
return this.gmtModified;
}
public void setGmtModified(String gmtModified){
    this.gmtModified = gmtModified;
}
public String getFeature(){
return this.feature;
}
public void setFeature(String feature){
    this.feature = feature;
}

}