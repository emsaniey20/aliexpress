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

public class AliexpressLogisticsGetpdfsbycloudprintCloudPrintData implements Serializable {
    private static final long serialVersionUID = 1L;
        /** printData */
                @ApiField("print_data")
            private String printData;
        /** templateUrlList */
                @ApiListField("template_url_list")
            private List<String> templateUrlList;
    
        public String getPrintData() {
    return this.printData;
    }
    public void setPrintData(String printData) {
    this.printData = printData;
    }
        public List<String> getTemplateUrlList() {
    return this.templateUrlList;
    }
    public void setTemplateUrlList(List<String> templateUrlList) {
    this.templateUrlList = templateUrlList;
    }
    }