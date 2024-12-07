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
*  arise.logistics.pkg.shipment.declare
*/
public class AriseLogisticsPkgShipmentDeclareRequest extends BaseGopRequest<AriseLogisticsPkgShipmentDeclareResponse> {

    /** 包裹声明发货请求 */
    private AriseLogisticsPkgShipmentDeclarePackageDeclareShipmentApiRequestDTO packageDeclareShipmentRequest;

    public AriseLogisticsPkgShipmentDeclarePackageDeclareShipmentApiRequestDTO getPackageDeclareShipmentRequest(){
        return this.packageDeclareShipmentRequest;
    }
    public void setPackageDeclareShipmentRequest(AriseLogisticsPkgShipmentDeclarePackageDeclareShipmentApiRequestDTO packageDeclareShipmentRequest){
        this.packageDeclareShipmentRequest = packageDeclareShipmentRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.pkg.shipment.declare";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (packageDeclareShipmentRequest != null) {
                        super.addApiParameter("package_declare_shipment_request", new JSONWriter(true, false).write(packageDeclareShipmentRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AriseLogisticsPkgShipmentDeclareResponse> getResponseClass() {
        return AriseLogisticsPkgShipmentDeclareResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}