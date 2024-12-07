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
*  aliexpress.solution.batch.product.inventory.update
*/
public class AliexpressSolutionBatchProductInventoryUpdateRequest extends BaseGopRequest<AliexpressSolutionBatchProductInventoryUpdateResponse> {

    /** The product list, in which the inventory needs to be updated. Maximum 20 products. */
    private List<AliexpressSolutionBatchProductInventoryUpdateSynchronizeProductRequestDTO> mutipleProductUpdateList;

    public List<AliexpressSolutionBatchProductInventoryUpdateSynchronizeProductRequestDTO> getMutipleProductUpdateList(){
        return this.mutipleProductUpdateList;
    }
    public void setMutipleProductUpdateList(List<AliexpressSolutionBatchProductInventoryUpdateSynchronizeProductRequestDTO> mutipleProductUpdateList){
        this.mutipleProductUpdateList = mutipleProductUpdateList;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.batch.product.inventory.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (mutipleProductUpdateList != null) {
                        super.addApiParameter("mutiple_product_update_list", new JSONWriter(true, false).write(mutipleProductUpdateList));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionBatchProductInventoryUpdateResponse> getResponseClass() {
        return AliexpressSolutionBatchProductInventoryUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}