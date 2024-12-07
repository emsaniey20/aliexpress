package com.aliexpress.open.domain;

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
import com.aliexpress.open.domain.*;
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class CainiaoGlobalSolutionServiceResourceQueryOpenSolutionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 扩展字段 */
                @ApiField("features")
            private HashMap<String, Object> features;
        /** 优先级 */
                @ApiField("priority")
            private String priority;
        /** 联系人名称 */
                @ApiField("contact_name")
            private String contactName;
        /** 联系人电话 */
                @ApiField("contact_telephone")
            private String contactTelephone;
        /** 工作时间 */
                @ApiField("work_time_tips")
            private String workTimeTips;
        /** 地址对应的divisionId */
                @ApiField("division")
            private String division;
        /** 地址 */
                @ApiField("address")
            private String address;
        /** 资源名称 */
                @ApiField("name")
            private String name;
        /** 资源编码 */
                @ApiField("code")
            private String code;
        /** 解决方案编码 */
                @ApiField("solution_code")
            private String solutionCode;
    
        public HashMap<String, Object> getFeatures() {
    return this.features;
    }
    public void setFeatures(HashMap<String, Object> features) {
    this.features = features;
    }
        public String getPriority() {
    return this.priority;
    }
    public void setPriority(String priority) {
    this.priority = priority;
    }
        public String getContactName() {
    return this.contactName;
    }
    public void setContactName(String contactName) {
    this.contactName = contactName;
    }
        public String getContactTelephone() {
    return this.contactTelephone;
    }
    public void setContactTelephone(String contactTelephone) {
    this.contactTelephone = contactTelephone;
    }
        public String getWorkTimeTips() {
    return this.workTimeTips;
    }
    public void setWorkTimeTips(String workTimeTips) {
    this.workTimeTips = workTimeTips;
    }
        public String getDivision() {
    return this.division;
    }
    public void setDivision(String division) {
    this.division = division;
    }
        public String getAddress() {
    return this.address;
    }
    public void setAddress(String address) {
    this.address = address;
    }
        public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
        public String getCode() {
    return this.code;
    }
    public void setCode(String code) {
    this.code = code;
    }
        public String getSolutionCode() {
    return this.solutionCode;
    }
    public void setSolutionCode(String solutionCode) {
    this.solutionCode = solutionCode;
    }
    }