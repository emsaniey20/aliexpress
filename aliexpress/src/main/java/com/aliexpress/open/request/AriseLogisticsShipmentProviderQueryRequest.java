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
*  arise.logistics.shipment.provider.query
*/
public class AriseLogisticsShipmentProviderQueryRequest extends BaseGopRequest<AriseLogisticsShipmentProviderQueryResponse> {

    /** 物流服务商查询请求信息 */
    private AriseLogisticsShipmentProviderQueryShipmentProviderApiRequestDTO shipmentProviderRequest;

    public AriseLogisticsShipmentProviderQueryShipmentProviderApiRequestDTO getShipmentProviderRequest(){
        return this.shipmentProviderRequest;
    }
    public void setShipmentProviderRequest(AriseLogisticsShipmentProviderQueryShipmentProviderApiRequestDTO shipmentProviderRequest){
        this.shipmentProviderRequest = shipmentProviderRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.shipment.provider.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (shipmentProviderRequest != null) {
                        super.addApiParameter("shipment_provider_request", new JSONWriter(true, false).write(shipmentProviderRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AriseLogisticsShipmentProviderQueryResponse> getResponseClass() {
        return AriseLogisticsShipmentProviderQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "GET";
    }
}