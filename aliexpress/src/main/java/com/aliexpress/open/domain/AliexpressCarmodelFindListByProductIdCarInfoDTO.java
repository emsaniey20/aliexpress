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

public class AliexpressCarmodelFindListByProductIdCarInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 国家 */
                @ApiField("country")
            private String country;
        /** 车辆类型 */
                @ApiField("car_type")
            private String carType;
        /** 配置 */
                @ApiField("trim")
            private String trim;
        /** 年份 */
                @ApiField("year")
            private String year;
        /** 引擎 */
                @ApiField("engine")
            private String engine;
        /** 型号 */
                @ApiField("model")
            private String model;
        /** 制造商 */
                @ApiField("make")
            private String make;
        /** 车型id */
                @ApiField("afid")
            private String afid;
    
        public String getCountry() {
    return this.country;
    }
    public void setCountry(String country) {
    this.country = country;
    }
        public String getCarType() {
    return this.carType;
    }
    public void setCarType(String carType) {
    this.carType = carType;
    }
        public String getTrim() {
    return this.trim;
    }
    public void setTrim(String trim) {
    this.trim = trim;
    }
        public String getYear() {
    return this.year;
    }
    public void setYear(String year) {
    this.year = year;
    }
        public String getEngine() {
    return this.engine;
    }
    public void setEngine(String engine) {
    this.engine = engine;
    }
        public String getModel() {
    return this.model;
    }
    public void setModel(String model) {
    this.model = model;
    }
        public String getMake() {
    return this.make;
    }
    public void setMake(String make) {
    this.make = make;
    }
        public String getAfid() {
    return this.afid;
    }
    public void setAfid(String afid) {
    this.afid = afid;
    }
    }