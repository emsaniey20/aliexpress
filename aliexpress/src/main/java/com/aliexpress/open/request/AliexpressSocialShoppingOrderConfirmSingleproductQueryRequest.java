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
*  aliexpress.social.shopping.order.confirm.singleproduct.query
*/
public class AliexpressSocialShoppingOrderConfirmSingleproductQueryRequest extends BaseGopRequest<AliexpressSocialShoppingOrderConfirmSingleproductQueryResponse> {

    /** Product Id */
    private Long productId;
    /** Quantity */
    private Integer quantity;
    /** Address to deliver */
    private Long selectedAddressId;
    /** Country code to deliver */
    private String shipToCountryCode;
    /** SKU info */
    private String skuAttr;
    /** Hashed promocode */
    private String promocodeHash;

    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
        }
    public Long getSelectedAddressId(){
        return this.selectedAddressId;
    }
    public void setSelectedAddressId(Long selectedAddressId){
        this.selectedAddressId = selectedAddressId;
        }
    public String getShipToCountryCode(){
        return this.shipToCountryCode;
    }
    public void setShipToCountryCode(String shipToCountryCode){
        this.shipToCountryCode = shipToCountryCode;
        }
    public String getSkuAttr(){
        return this.skuAttr;
    }
    public void setSkuAttr(String skuAttr){
        this.skuAttr = skuAttr;
        }
    public String getPromocodeHash(){
        return this.promocodeHash;
    }
    public void setPromocodeHash(String promocodeHash){
        this.promocodeHash = promocodeHash;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.shopping.order.confirm.singleproduct.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (quantity != null) {
                        super.addApiParameter("quantity", quantity.toString());
                    }
                            if (selectedAddressId != null) {
                        super.addApiParameter("selected_address_id", selectedAddressId.toString());
                    }
                            if (shipToCountryCode != null) {
                        super.addApiParameter("ship_to_country_code", shipToCountryCode.toString());
                    }
                            if (skuAttr != null) {
                        super.addApiParameter("sku_attr", skuAttr.toString());
                    }
                            if (promocodeHash != null) {
                        super.addApiParameter("promocode_hash", promocodeHash.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialShoppingOrderConfirmSingleproductQueryResponse> getResponseClass() {
        return AliexpressSocialShoppingOrderConfirmSingleproductQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}