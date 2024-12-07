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

public class AliexpressMiniappOrderCreatePrecheckErrorCode implements Serializable {
    private static final long serialVersionUID = 1L;
        /** detailed log message */
                @ApiField("log_message")
            private String logMessage;
        /** error key */
                @ApiField("key")
            private String key;
        /** displayed error message */
                @ApiField("display_message")
            private String displayMessage;
    
        public String getLogMessage() {
    return this.logMessage;
    }
    public void setLogMessage(String logMessage) {
    this.logMessage = logMessage;
    }
        public String getKey() {
    return this.key;
    }
    public void setKey(String key) {
    this.key = key;
    }
        public String getDisplayMessage() {
    return this.displayMessage;
    }
    public void setDisplayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
    }
    }