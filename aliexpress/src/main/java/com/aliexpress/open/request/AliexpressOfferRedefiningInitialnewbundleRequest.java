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
*  aliexpress.offer.redefining.initialnewbundle
*/
public class AliexpressOfferRedefiningInitialnewbundleRequest extends BaseGopRequest<AliexpressOfferRedefiningInitialnewbundleResponse> {

    /** 主商品ID */
    private Long mainItemId;
    /** 搭配商品ID列表 */
    private List<Long> subItemList;

    public Long getMainItemId(){
        return this.mainItemId;
    }
    public void setMainItemId(Long mainItemId){
        this.mainItemId = mainItemId;
        }
    public List<Long> getSubItemList(){
        return this.subItemList;
    }
    public void setSubItemList(List<Long> subItemList){
        this.subItemList = subItemList;
        }

    @Override
    public String getApiName() {
        return "aliexpress.offer.redefining.initialnewbundle";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (mainItemId != null) {
                        super.addApiParameter("main_item_id", mainItemId.toString());
                    }
                            if (subItemList != null) {
                        super.addApiParameter("sub_item_list", new JSONWriter(true, false).write(subItemList));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressOfferRedefiningInitialnewbundleResponse> getResponseClass() {
        return AliexpressOfferRedefiningInitialnewbundleResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}