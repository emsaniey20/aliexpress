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
*  aliexpress.category.redefining.getPropValueFeature
*/
public class AliexpressCategoryRedefiningGetPropValueFeatureRequest extends BaseGopRequest<AliexpressCategoryRedefiningGetPropValueFeatureResponse> {

    /** property id */
    private Long propertyId;
    /** value id */
    private Long valueId;
    /** key of the feature */
    private String featureKey;

    public Long getPropertyId(){
        return this.propertyId;
    }
    public void setPropertyId(Long propertyId){
        this.propertyId = propertyId;
        }
    public Long getValueId(){
        return this.valueId;
    }
    public void setValueId(Long valueId){
        this.valueId = valueId;
        }
    public String getFeatureKey(){
        return this.featureKey;
    }
    public void setFeatureKey(String featureKey){
        this.featureKey = featureKey;
        }

    @Override
    public String getApiName() {
        return "aliexpress.category.redefining.getPropValueFeature";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (propertyId != null) {
                        super.addApiParameter("propertyId", propertyId.toString());
                    }
                            if (valueId != null) {
                        super.addApiParameter("valueId", valueId.toString());
                    }
                            if (featureKey != null) {
                        super.addApiParameter("featureKey", featureKey.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressCategoryRedefiningGetPropValueFeatureResponse> getResponseClass() {
        return AliexpressCategoryRedefiningGetPropValueFeatureResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}