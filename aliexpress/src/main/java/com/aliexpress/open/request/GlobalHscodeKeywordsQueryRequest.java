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
*  global.hscode.keywords.query
*/
public class GlobalHscodeKeywordsQueryRequest extends BaseGopRequest<GlobalHscodeKeywordsQueryResponse> {

    /** 关键字，目前只支持英文 */
    private String keyWords;
    /** 渠道，目前支持 全球商品：AE_GLOBAL 。 渠道商品 ： ARISE_ES */
    private String channel;

    public String getKeyWords(){
        return this.keyWords;
    }
    public void setKeyWords(String keyWords){
        this.keyWords = keyWords;
        }
    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }

    @Override
    public String getApiName() {
        return "global.hscode.keywords.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (keyWords != null) {
                        super.addApiParameter("key_words", keyWords.toString());
                    }
                            if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<GlobalHscodeKeywordsQueryResponse> getResponseClass() {
        return GlobalHscodeKeywordsQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}