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
*  aliexpress.logistics.local.getlogisticsselleraddress
*/
public class AliexpressLogisticsLocalGetlogisticsselleraddressRequest extends BaseGopRequest<AliexpressLogisticsLocalGetlogisticsselleraddressResponse> {

    /** sender,pickup,refund 地址类型 */
    private List<String> sellerAddressQuery;

    public List<String> getSellerAddressQuery(){
        return this.sellerAddressQuery;
    }
    public void setSellerAddressQuery(List<String> sellerAddressQuery){
        this.sellerAddressQuery = sellerAddressQuery;
        }

    @Override
    public String getApiName() {
        return "aliexpress.logistics.local.getlogisticsselleraddress";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerAddressQuery != null) {
                        super.addApiParameter("seller_address_query", new JSONWriter(true, false).write(sellerAddressQuery));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressLogisticsLocalGetlogisticsselleraddressResponse> getResponseClass() {
        return AliexpressLogisticsLocalGetlogisticsselleraddressResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}