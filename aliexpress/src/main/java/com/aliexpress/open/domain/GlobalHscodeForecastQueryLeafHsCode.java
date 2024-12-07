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

public class GlobalHscodeForecastQueryLeafHsCode implements Serializable {
    private static final long serialVersionUID = 1L;
        /** hscode的英文描述 */
                @ApiField("hs_code_desc")
            private String hsCodeDesc;
        /** hscode主键，叶子结点的hs_code才能用来发品 */
                @ApiField("hs_code")
            private String hsCode;
        /** hscode的长度  */
                @ApiField("hs_code_length")
            private Integer hsCodeLength;
        /** 叶子hscode的排列顺序，2 -> 2-1 -> 2-2 -> 2-3 */
                @ApiField("rank")
            private String rank;
    
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
        public String getRank() {
    return this.rank;
    }
    public void setRank(String rank) {
    this.rank = rank;
    }
    }