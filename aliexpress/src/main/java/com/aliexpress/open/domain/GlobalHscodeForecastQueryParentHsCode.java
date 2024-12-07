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

public class GlobalHscodeForecastQueryParentHsCode implements Serializable {
    private static final long serialVersionUID = 1L;
        /** hscode的英文描述 */
                @ApiField("hs_code_desc")
            private String hsCodeDesc;
        /** hscode主键，非叶子结点 */
                @ApiField("hs_code")
            private String hsCode;
        /** hscode的长度，长度越短，代表越靠近根结点。   父节点的层级顺序是 4-> 6。或 4-> 5->6  */
                @ApiField("hs_code_length")
            private Integer hsCodeLength;
    
        public String getHsCodeDesc() {
    return this.hsCodeDesc;
    }
    public void setHsCodeDesc(String hsCodeDesc) {
    this.hsCodeDesc = hsCodeDesc;
    }
        public String getHsCode() {
    return this.hsCode;
    }
    public void setHsCode(String hsCode) {
    this.hsCode = hsCode;
    }
        public Integer getHsCodeLength() {
    return this.hsCodeLength;
    }
    public void setHsCodeLength(Integer hsCodeLength) {
    this.hsCodeLength = hsCodeLength;
    }
    }