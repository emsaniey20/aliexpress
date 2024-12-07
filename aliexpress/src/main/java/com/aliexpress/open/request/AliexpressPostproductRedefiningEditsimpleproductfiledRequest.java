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
*  aliexpress.postproduct.redefining.editsimpleproductfiled
*/
public class AliexpressPostproductRedefiningEditsimpleproductfiledRequest extends BaseGopRequest<AliexpressPostproductRedefiningEditsimpleproductfiledResponse> {

    /** 指定编辑产品的id */
    private Long productId;
    /** 编辑的字段名称，为以下字段内容里的其中一项, 可以编辑的字段包括: subject: 商品的标题; detail: 商品的详细描述信息； deliveryTime: 备货期； groupId: 产品组； freightTemplateId: 运费模版； packageLength: 商品包装长度； packageWidth: 商品包装宽度； packageHeight：商品包装高度； grossWeight: 商品毛重； wsValidNum商品的有效天数；mobileDetail：无线详描（注意：该字段的提交修改，数据生效时间：商品（到期或手动）下架再上架生效。”）; reduceStrategy: 库存扣减策略(总共有2种：下单减库存(place_order_withhold)和支付减库存(payment_success_deduct)。);imageURLs:商品主图 多个图片时，用冒号分隔 ;promiseTemplateId:服务模板id */
    private String fiedName;
    /** 根据fiedName变化：fiedName=detail时，本字段是一段html字符串；fiedName=mobileDetail时，本字段的值是一段json字符串；fiedName=groupId时，本字段是一个产品分组唯一标识（数字类型），服务模版传参数是[1005003352630153,1005003352630154],fiedName= custom_image分国家主图变更传参{"BR":"https://ae04.alicdn.com/kf/HTB1uD3ZXUz1gK0jSZLeq6z9kVXat.jpg","RU":"http://g02.a.alicdn.com/kf/HTB1DkaWJXXXXXb6XFXXq6xXFXXXp.jpg"}。 */
    private String fiedvalue;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getFiedName(){
        return this.fiedName;
    }
    public void setFiedName(String fiedName){
        this.fiedName = fiedName;
        }
    public String getFiedvalue(){
        return this.fiedvalue;
    }
    public void setFiedvalue(String fiedvalue){
        this.fiedvalue = fiedvalue;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.editsimpleproductfiled";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (fiedName != null) {
                        super.addApiParameter("fied_name", fiedName.toString());
                    }
                            if (fiedvalue != null) {
                        super.addApiParameter("fiedvalue", fiedvalue.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningEditsimpleproductfiledResponse> getResponseClass() {
        return AliexpressPostproductRedefiningEditsimpleproductfiledResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}