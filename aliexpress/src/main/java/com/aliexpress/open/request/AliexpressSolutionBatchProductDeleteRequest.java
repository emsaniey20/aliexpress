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
*  aliexpress.solution.batch.product.delete
*/
public class AliexpressSolutionBatchProductDeleteRequest extends BaseGopRequest<AliexpressSolutionBatchProductDeleteResponse> {

    /** maximum 100 */
    private List<Long> productIds;

    public List<Long> getProductIds(){
        return this.productIds;
    }
    public void setProductIds(List<Long> productIds){
        this.productIds = productIds;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.batch.product.delete";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productIds != null) {
                        super.addApiParameter("product_ids", new JSONWriter(true, false).write(productIds));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionBatchProductDeleteResponse> getResponseClass() {
        return AliexpressSolutionBatchProductDeleteResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}