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
*  /ae/res/cover/default/api
*/
public class AeResCoverDefaultApiResponse extends IopResponse {

    /** 1 */
        @ApiField("second_string")
        private String secondString;
    /** 1 */
        @ApiField("second_obj")
        private AeResCoverDefaultApiSecondObject secondObj;
    /** 1 */
        @ApiListField("second_number_list")
        private List<Integer> secondNumberList;
    /** 1 */
        @ApiField("second_enum")
        private String secondEnum;
    /** 1 */
        @ApiField("second_constant")
        private String secondConstant;
    /** 1 */
        @ApiField("second_sys_param")
        private String secondSysParam;
    /** 1 */
        @ApiField("second_sys_param2")
        private String secondSysParam2;
    /** 1 */
        @ApiListField("second_obj_list")
        private List<AeResCoverDefaultApiSecondObjectList> secondObjList;

public String getSecondString(){
return this.secondString;
}
public void setSecondString(String secondString){
    this.secondString = secondString;
}
public AeResCoverDefaultApiSecondObject getSecondObj(){
return this.secondObj;
}
public void setSecondObj(AeResCoverDefaultApiSecondObject secondObj){
    this.secondObj = secondObj;
}
public List<Integer> getSecondNumberList(){
return this.secondNumberList;
}
public void setSecondNumberList(List<Integer> secondNumberList){
    this.secondNumberList = secondNumberList;
}
public String getSecondEnum(){
return this.secondEnum;
}
public void setSecondEnum(String secondEnum){
    this.secondEnum = secondEnum;
}
public String getSecondConstant(){
return this.secondConstant;
}
public void setSecondConstant(String secondConstant){
    this.secondConstant = secondConstant;
}
public String getSecondSysParam(){
return this.secondSysParam;
}
public void setSecondSysParam(String secondSysParam){
    this.secondSysParam = secondSysParam;
}
public String getSecondSysParam2(){
return this.secondSysParam2;
}
public void setSecondSysParam2(String secondSysParam2){
    this.secondSysParam2 = secondSysParam2;
}
public List<AeResCoverDefaultApiSecondObjectList> getSecondObjList(){
return this.secondObjList;
}
public void setSecondObjList(List<AeResCoverDefaultApiSecondObjectList> secondObjList){
    this.secondObjList = secondObjList;
}

}