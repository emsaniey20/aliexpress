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
*  /globalopen/api/get
*/
public class GlobalopenApiGetResponse extends IopResponse {

    /** modifiedtime */
        @ApiField("gmt_modified")
        private String gmtModified;
    /** authPrompt */
        @ApiField("auth_prompt")
        private String authPrompt;
    /** apiKind */
        @ApiField("api_kind")
        private String apiKind;
    /** admin */
        @ApiField("admin")
        private String admin;
    /** createdtime */
        @ApiField("gmt_create")
        private String gmtCreate;
    /** title */
        @ApiField("title")
        private String title;
    /** path */
        @ApiField("path")
        private String path;
    /** catId */
        @ApiField("api_category_id")
        private Integer apiCategoryId;
    /** id */
        @ApiField("id")
        private Integer id;
    /** authType */
        @ApiField("auth_type")
        private Integer authType;
    /** maxQps */
        @ApiField("max_qps")
        private Integer maxQps;
    /** platformSource */
        @ApiField("platform_source")
        private Integer platformSource;
    /** status */
        @ApiField("status")
        private Integer status;

public String getGmtModified(){
return this.gmtModified;
}
public void setGmtModified(String gmtModified){
    this.gmtModified = gmtModified;
}
public String getAuthPrompt(){
return this.authPrompt;
}
public void setAuthPrompt(String authPrompt){
    this.authPrompt = authPrompt;
}
public String getApiKind(){
return this.apiKind;
}
public void setApiKind(String apiKind){
    this.apiKind = apiKind;
}
public String getAdmin(){
return this.admin;
}
public void setAdmin(String admin){
    this.admin = admin;
}
public String getGmtCreate(){
return this.gmtCreate;
}
public void setGmtCreate(String gmtCreate){
    this.gmtCreate = gmtCreate;
}
public String getTitle(){
return this.title;
}
public void setTitle(String title){
    this.title = title;
}
public String getPath(){
return this.path;
}
public void setPath(String path){
    this.path = path;
}
public Integer getApiCategoryId(){
return this.apiCategoryId;
}
public void setApiCategoryId(Integer apiCategoryId){
    this.apiCategoryId = apiCategoryId;
}
public Integer getId(){
return this.id;
}
public void setId(Integer id){
    this.id = id;
}
public Integer getAuthType(){
return this.authType;
}
public void setAuthType(Integer authType){
    this.authType = authType;
}
public Integer getMaxQps(){
return this.maxQps;
}
public void setMaxQps(Integer maxQps){
    this.maxQps = maxQps;
}
public Integer getPlatformSource(){
return this.platformSource;
}
public void setPlatformSource(Integer platformSource){
    this.platformSource = platformSource;
}
public Integer getStatus(){
return this.status;
}
public void setStatus(Integer status){
    this.status = status;
}

}