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
*  aliexpress.solution.feed.submit
*/
public class AliexpressSolutionFeedSubmitRequest extends BaseGopRequest<AliexpressSolutionFeedSubmitResponse> {

    /** Currently support 4 types of feeds:PRODUCT_CREATE,PRODUCT_FULL_UPDATE,PRODUCT_STOCKS_UPDATE,PRODUCT_PRICES_UPDATE */
    private String operationType;
    /** item list, maximum size: 2000. */
    private List<AliexpressSolutionFeedSubmitSingleItemRequestDTO> itemList;
    /** More information of the request. */
    private String developerFeatures;

    public String getOperationType(){
        return this.operationType;
    }
    public void setOperationType(String operationType){
        this.operationType = operationType;
        }
    public List<AliexpressSolutionFeedSubmitSingleItemRequestDTO> getItemList(){
        return this.itemList;
    }
    public void setItemList(List<AliexpressSolutionFeedSubmitSingleItemRequestDTO> itemList){
        this.itemList = itemList;
        }
    public String getDeveloperFeatures(){
        return this.developerFeatures;
    }
    public void setDeveloperFeatures(String developerFeatures){
        this.developerFeatures = developerFeatures;
        }

    @Override
    public String getApiName() {
        return "aliexpress.solution.feed.submit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (operationType != null) {
                        super.addApiParameter("operation_type", operationType.toString());
                    }
                            if (itemList != null) {
                        super.addApiParameter("item_list", new JSONWriter(true, false).write(itemList));
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
    public Class<AliexpressSolutionFeedSubmitResponse> getResponseClass() {
        return AliexpressSolutionFeedSubmitResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}