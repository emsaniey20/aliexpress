package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  arise.logistics.awb.print
*/
public class AriseLogisticsAwbPrintRequest extends BaseGopRequest<AriseLogisticsAwbPrintResponse> {

    /** 物流打印面单请求 */
    private AriseLogisticsAwbPrintPrintAWBApiRequestDTO printAwbRequest;

    public AriseLogisticsAwbPrintPrintAWBApiRequestDTO getPrintAwbRequest(){
        return this.printAwbRequest;
    }
    public void setPrintAwbRequest(AriseLogisticsAwbPrintPrintAWBApiRequestDTO printAwbRequest){
        this.printAwbRequest = printAwbRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.awb.print";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (printAwbRequest != null) {
                        super.addApiParameter("print_awb_request", new JSONWriter(true, false).write(printAwbRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AriseLogisticsAwbPrintResponse> getResponseClass() {
        return AriseLogisticsAwbPrintResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}