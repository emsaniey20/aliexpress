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
*  aliexpress.postproduct.redefining.setgroups
*/
public class AliexpressPostproductRedefiningSetgroupsRequest extends BaseGopRequest<AliexpressPostproductRedefiningSetgroupsResponse> {

    /** 产品ID */
    private Long productId;
    /** 商品分组ID。如果需要将一个商品设置成多个分组，需要将分组id用逗号分隔，如：'123,456,789' 至多3个。 设置商品分组前请做好前置校验，只有叶子节点的group_id或者 child_group_list 为空的一级group_id下可以挂载商品。 查询商家商品分组接口：aliexpress.product.productgroups.get */
    private String groupIds;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getGroupIds(){
        return this.groupIds;
    }
    public void setGroupIds(String groupIds){
        this.groupIds = groupIds;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.setgroups";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (groupIds != null) {
                        super.addApiParameter("group_ids", groupIds.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningSetgroupsResponse> getResponseClass() {
        return AliexpressPostproductRedefiningSetgroupsResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}