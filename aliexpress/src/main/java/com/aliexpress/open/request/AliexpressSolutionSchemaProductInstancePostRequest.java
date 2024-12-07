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
*  aliexpress.solution.schema.product.instance.post
*/
public class AliexpressSolutionSchemaProductInstancePostRequest extends BaseGopRequest<AliexpressSolutionSchemaProductInstancePostResponse> {

    /** Product instance data. The relative parameters description in schema json String are same as "aliexpress.solution.product.post" .Please note: the shipping_template_id should be replaced with your own shipping template id, which could be obtained through  https://developers.aliexpress.com/en/doc.htm?docId=43456&docType=2 */
    private String productInstanceRequest;
    /** More information of the request. */
    private String developerFeatures;

    public String getProductInstanceRequest(){
        return this.productInstanceRequest;
    }
    public void setProductInstanceRequest(String productInstanceRequest){
        this.productInstanceRequest = productInstanceRequest;
        }
    public String getDeveloperFeatures(){
        return this.developerFeatures;
    }
    public void setDeveloperFeatures(String developerFeatures){
        this.developerFeatures = developerFeatures;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.schema.product.instance.post";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productInstanceRequest != null) {
                        super.addApiParameter("product_instance_request", productInstanceRequest.toString());
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
    public Class<AliexpressSolutionSchemaProductInstancePostResponse> getResponseClass() {
        return AliexpressSolutionSchemaProductInstancePostResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}