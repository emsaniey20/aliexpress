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

public class CainiaoGlobalHandoverCloudprintGetCloudPrintDataGetResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 面单云打印数据 */
                @ApiField("print_data")
            private String printData;
        /** 面单云打印数据MD5加密串 */
                @ApiField("print_data_md5")
            private String printDataMd5;
    
        public String getPrintData() {
    return this.printData;
    }
    public void setPrintData(String printData) {
    this.printData = printData;
    }
        public String getPrintDataMd5() {
    return this.printDataMd5;
    }
    public void setPrintDataMd5(String printDataMd5) {
    this.printDataMd5 = printDataMd5;
    }
    }