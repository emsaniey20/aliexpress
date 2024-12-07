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
*  aliexpress.social.product.fulldetail.query
*/
public class AliexpressSocialProductFulldetailQueryRequest extends BaseGopRequest<AliexpressSocialProductFulldetailQueryResponse> {

    /** Chanel */
    private String channel;
    /** Contry of product */
    private String country;
    /** product to get full details */
    private Long productId;
    /** terminal */
    private String terminal;

    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
        }
    public Long getProductId(){
        return this.productId;
    }
    public void setProductId(Long productId){
        this.productId = productId;
        }
    public String getTerminal(){
        return this.terminal;
    }
    public void setTerminal(String terminal){
        this.terminal = terminal;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.product.fulldetail.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (country != null) {
                        super.addApiParameter("country", country.toString());
                    }
                            if (productId != null) {
                        super.addApiParameter("product_id", productId.toString());
                    }
                            if (terminal != null) {
                        super.addApiParameter("terminal", terminal.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialProductFulldetailQueryResponse> getResponseClass() {
        return AliexpressSocialProductFulldetailQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}