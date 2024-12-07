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
*  arise.logistics.shipment.confirm
*/
public class AriseLogisticsShipmentConfirmRequest extends BaseGopRequest<AriseLogisticsShipmentConfirmResponse> {

    /** arise物流确认妥投状态请求 */
    private AriseLogisticsShipmentConfirmPackageConfirmApiRequestDTO packageConfirmRequest;

    public AriseLogisticsShipmentConfirmPackageConfirmApiRequestDTO getPackageConfirmRequest(){
        return this.packageConfirmRequest;
    }
    public void setPackageConfirmRequest(AriseLogisticsShipmentConfirmPackageConfirmApiRequestDTO packageConfirmRequest){
        this.packageConfirmRequest = packageConfirmRequest;
        }

    @Override
    public String getApiName() {
        return "arise.logistics.shipment.confirm";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (packageConfirmRequest != null) {
                        super.addApiParameter("package_confirm_request", new JSONWriter(true, false).write(packageConfirmRequest));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AriseLogisticsShipmentConfirmResponse> getResponseClass() {
        return AriseLogisticsShipmentConfirmResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}