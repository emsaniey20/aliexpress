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

public class AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 违禁词名称 */
                @ApiField("primary_word")
            private String primaryWord;
        /** 违禁原因 */
                @ApiListField("types")
            private List<String> types;
    
        public String getPrimaryWord() {
    return this.primaryWord;
    }
    public void setPrimaryWord(String primaryWord) {
    this.primaryWord = primaryWord;
    }
        public List<String> getTypes() {
    return this.types;
    }
    public void setTypes(List<String> types) {
    this.types = types;
    }
    }