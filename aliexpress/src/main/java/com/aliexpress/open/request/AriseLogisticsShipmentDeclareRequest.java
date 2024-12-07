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
*  arise.logistics.shipment.declare
*/
public class AriseLogisticsShipmentDeclareRequest extends BaseGopRequest<AriseLogisticsShipmentDeclareResponse> {

    /** 声明发货请求 */
    private AriseLogisticsShipmentDeclareDeclareShipmentApiRequestDTO declareShipmentRequest;

    public AriseLogisticsShipmentDeclareDeclareShipmentApiRequestDTO getDeclareShipmentRequest(){
        return this.declareShipmentRequest;
    }
    public void setDeclareShipmentRequest(AriseLogisticsShipmentDeclareDeclareShipmentApiRequestDTO declareShipmentRequest){
        this.declareShipmentRequest = declareShipmentRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.shipment.declare";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (declareShipmentRequest != null) {
                        super.addApiParameter("declare_shipment_request", new JSONWriter(true, false).write(declareShipmentRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AriseLogisticsShipmentDeclareResponse> getResponseClass() {
        return AriseLogisticsShipmentDeclareResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}