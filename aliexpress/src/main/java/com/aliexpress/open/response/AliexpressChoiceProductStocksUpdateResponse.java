package com.aliexpress.open.response;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;
import com.aliexpress.open.domain.*;


/**
*  aliexpress.choice.product.stocks.update
*/
public class AliexpressChoiceProductStocksUpdateResponse extends IopResponse {

    /** sku列表 */
        @ApiListField("product_sku_stock_list")
        private List<AliexpressChoiceProductStocksUpdateOneStopServiceProductSingleSkuUpdateResponseDTO> productSkuStockList;
    /** 商品id */
        @ApiField("product_id")
        private Long productId;
    /** 当所有仓库库存均更新成功时为true,其他情况表示部分失败，开发者需解析sku_warehouse_stock_list获取具体成功和失败的仓库列表及原因 */
        @ApiField("success")
        private String success;
    /** 错误信息 */
        @ApiField("error_message")
        private String errorMessage;
    /** 错误码 */
        @ApiField("error_code")
        private String errorCode;

public List<AliexpressChoiceProductStocksUpdateOneStopServiceProductSingleSkuUpdateResponseDTO> getProductSkuStockList(){
return this.productSkuStockList;
}
public void setProductSkuStockList(List<AliexpressChoiceProductStocksUpdateOneStopServiceProductSingleSkuUpdateResponseDTO> productSkuStockList){
    this.productSkuStockList = productSkuStockList;
}
public Long getProductId(){
return this.productId;
}
public void setProductId(Long productId){
    this.productId = productId;
}
public String getSuccess(){
return this.success;
}
public void setSuccess(String success){
    this.success = success;
}
public String getErrorMessage(){
return this.errorMessage;
}
public void setErrorMessage(String errorMessage){
    this.errorMessage = errorMessage;
}
public String getErrorCode(){
return this.errorCode;
}
public void setErrorCode(String errorCode){
    this.errorCode = errorCode;
}

}