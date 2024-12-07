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
*  aliexpress.solution.batch.product.price.update
*/
public class AliexpressSolutionBatchProductPriceUpdateRequest extends BaseGopRequest<AliexpressSolutionBatchProductPriceUpdateResponse> {

    /** The product list, in which the price needs to be updated. Maximum length:20 */
    private List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductRequestDTO> mutipleProductUpdateList;

    public List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductRequestDTO> getMutipleProductUpdateList(){
        return this.mutipleProductUpdateList;
    }
    public void setMutipleProductUpdateList(List<AliexpressSolutionBatchProductPriceUpdateSynchronizeProductRequestDTO> mutipleProductUpdateList){
        this.mutipleProductUpdateList = mutipleProductUpdateList;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.batch.product.price.update";
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
    public Class<AliexpressSolutionBatchProductPriceUpdateResponse> getResponseClass() {
        return AliexpressSolutionBatchProductPriceUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}