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
*  aliexpress.freight.redefining.calculatefreight
*/
public class AliexpressFreightRedefiningCalculatefreightRequest extends BaseGopRequest<AliexpressFreightRedefiningCalculatefreightResponse> {

    /** package height */
    private Long height;
    /** package weight */
    private String weight;
    /** 打包计重超过部分续重,当isCustomPackWeight=Y时必选 */
    private String packAddWeight;
    /** count */
    private Long count;
    /** 运费模板ID */
    private Long freightTemplateId;
    /** 打包计重超过部分每增加件数,当isCustomPackWeight=Y时必选 */
    private Long packAddUnit;
    /** 是否为自定义打包计重,Y/N */
    private Boolean isCustomPackWeight;
    /** package width */
    private Long width;
    /** package length */
    private Long length;
    /** 产品价格 */
    private AliexpressFreightRedefiningCalculatefreightMoney productPrice;
    /** 打包计重几件以内按单个产品计重,当isCustomPackWeight=Y时必选 */
    private Long packBaseUnit;
    /** country */
    private String country;

    public Long getHeight(){
        return this.height;
    }
    public void setHeight(Long height){
        this.height = height;
        }
    public String getWeight(){
        return this.weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
        }
    public String getPackAddWeight(){
        return this.packAddWeight;
    }
    public void setPackAddWeight(String packAddWeight){
        this.packAddWeight = packAddWeight;
        }
    public Long getCount(){
        return this.count;
    }
    public void setCount(Long count){
        this.count = count;
        }
    public Long getFreightTemplateId(){
        return this.freightTemplateId;
    }
    public void setFreightTemplateId(Long freightTemplateId){
        this.freightTemplateId = freightTemplateId;
        }
    public Long getPackAddUnit(){
        return this.packAddUnit;
    }
    public void setPackAddUnit(Long packAddUnit){
        this.packAddUnit = packAddUnit;
        }
    public Boolean getIsCustomPackWeight(){
        return this.isCustomPackWeight;
    }
    public void setIsCustomPackWeight(Boolean isCustomPackWeight){
        this.isCustomPackWeight = isCustomPackWeight;
        }
    public Long getWidth(){
        return this.width;
    }
    public void setWidth(Long width){
        this.width = width;
        }
    public Long getLength(){
        return this.length;
    }
    public void setLength(Long length){
        this.length = length;
        }
    public AliexpressFreightRedefiningCalculatefreightMoney getProductPrice(){
        return this.productPrice;
    }
    public void setProductPrice(AliexpressFreightRedefiningCalculatefreightMoney productPrice){
        this.productPrice = productPrice;
        }
    public Long getPackBaseUnit(){
        return this.packBaseUnit;
    }
    public void setPackBaseUnit(Long packBaseUnit){
        this.packBaseUnit = packBaseUnit;
        }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }

    @Override
    public String getApiName() {
        return "aliexpress.freight.redefining.calculatefreight";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (height != null) {
                        super.addApiParameter("height", height.toString());
                    }
                            if (weight != null) {
                        super.addApiParameter("weight", weight.toString());
                    }
                            if (packAddWeight != null) {
                        super.addApiParameter("pack_add_weight", packAddWeight.toString());
                    }
                            if (count != null) {
                        super.addApiParameter("count", count.toString());
                    }
                            if (freightTemplateId != null) {
                        super.addApiParameter("freight_template_id", freightTemplateId.toString());
                    }
                            if (packAddUnit != null) {
                        super.addApiParameter("pack_add_unit", packAddUnit.toString());
                    }
                            if (isCustomPackWeight != null) {
                        super.addApiParameter("is_custom_pack_weight", isCustomPackWeight.toString());
                    }
                            if (width != null) {
                        super.addApiParameter("width", width.toString());
                    }
                            if (length != null) {
                        super.addApiParameter("length", length.toString());
                    }
                            if (productPrice != null) {
                        super.addApiParameter("product_price", new JSONWriter(true, false).write(productPrice));
                    }
                            if (packBaseUnit != null) {
                        super.addApiParameter("pack_base_unit", packBaseUnit.toString());
                    }
                            if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                                                                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressFreightRedefiningCalculatefreightResponse> getResponseClass() {
        return AliexpressFreightRedefiningCalculatefreightResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}