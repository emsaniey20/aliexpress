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

public class AliexpressSellercenterVkontakteTrackcodeAddresultResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** if track code was added */
                @ApiField("value")
            private Boolean value;
    
        public Boolean getValue() {
    return this.value;
    }
    public void setValue(Boolean value) {
    this.value = value;
    }
    }