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
*  /qimen/aliexpress/warehouse/baseinfo/get
*/
public class QimenAliexpressWarehouseBaseinfoGetRequest extends BaseGopRequest<QimenAliexpressWarehouseBaseinfoGetResponse> {

    /** 123 */
    private String country;
    /** 123 */
    private String warehouseCustomerId;
    /** 仓系统参数 */
    private String systemType;

    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }
    public String getWarehouseCustomerId(){
        return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId){
        this.warehouseCustomerId = warehouseCustomerId;
        }
    public String getSystemType(){
        return this.systemType;
    }
    public void setSystemType(String systemType){
        this.systemType = systemType;
        }

    @Override
    public String getApiName() {
        return "/qimen/aliexpress/warehouse/baseinfo/get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                            if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouseCustomerId", warehouseCustomerId.toString());
                    }
                            if (systemType != null) {
                        super.addApiParameter("systemType", systemType.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<QimenAliexpressWarehouseBaseinfoGetResponse> getResponseClass() {
        return QimenAliexpressWarehouseBaseinfoGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "HSF";
    }
}