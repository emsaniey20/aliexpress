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
*  arise.logistics.shipment.update
*/
public class AriseLogisticsShipmentUpdateRequest extends BaseGopRequest<AriseLogisticsShipmentUpdateResponse> {

    /** 修改声明发货请求 */
    private AriseLogisticsShipmentUpdatePackageUpdateApiRequestDTO packageUpdateRequest;

    public AriseLogisticsShipmentUpdatePackageUpdateApiRequestDTO getPackageUpdateRequest(){
        return this.packageUpdateRequest;
    }
    public void setPackageUpdateRequest(AriseLogisticsShipmentUpdatePackageUpdateApiRequestDTO packageUpdateRequest){
        this.packageUpdateRequest = packageUpdateRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.shipment.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (packageUpdateRequest != null) {
                        super.addApiParameter("package_update_request", new JSONWriter(true, false).write(packageUpdateRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AriseLogisticsShipmentUpdateResponse> getResponseClass() {
        return AriseLogisticsShipmentUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}