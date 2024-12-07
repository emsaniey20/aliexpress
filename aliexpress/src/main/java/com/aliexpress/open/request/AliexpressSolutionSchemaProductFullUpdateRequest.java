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
*  aliexpress.solution.schema.product.full.update
*/
public class AliexpressSolutionSchemaProductFullUpdateRequest extends BaseGopRequest<AliexpressSolutionSchemaProductFullUpdateResponse> {

    /** Product full update request. To learn how to generate the content, please refer to https://developers.aliexpress.com/en/doc.htm?docId=109760&docType=1.  Be aware that the aliexpress_product_id field should be replaced by the product ID belonged to the seller. */
    private String schemaFullUpdateRequest;
    /** More information of the request. */
    private String developerFeatures;

    public String getSchemaFullUpdateRequest(){
        return this.schemaFullUpdateRequest;
    }
    public void setSchemaFullUpdateRequest(String schemaFullUpdateRequest){
        this.schemaFullUpdateRequest = schemaFullUpdateRequest;
        }
    public String getDeveloperFeatures(){
        return this.developerFeatures;
    }
    public void setDeveloperFeatures(String developerFeatures){
        this.developerFeatures = developerFeatures;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.schema.product.full.update";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (schemaFullUpdateRequest != null) {
                        super.addApiParameter("schema_full_update_request", schemaFullUpdateRequest.toString());
                    }
                            if (developerFeatures != null) {
                        super.addApiParameter("developer_features", developerFeatures.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSolutionSchemaProductFullUpdateResponse> getResponseClass() {
        return AliexpressSolutionSchemaProductFullUpdateResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}