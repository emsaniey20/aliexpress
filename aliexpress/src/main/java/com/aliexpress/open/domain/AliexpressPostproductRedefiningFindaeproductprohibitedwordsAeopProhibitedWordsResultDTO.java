package com.aliexpress.open.domain;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressPostproductRedefiningFindaeproductprohibitedwordsAeopProhibitedWordsResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 商品详描中的违禁词列表, 如果商品详描中没有违禁词, 则返回一个"'[]"。否则将以示例值中的格式返回。其中每个违禁词都包含了2个属性: primaryWord和types。其中primaryWord表示违禁词，types表示违禁词的类型，总共有四种类型: FORBIDEN_TYPE(禁用), RESTRICT_TYPE(限定), BRAND_TYPE(品牌), TORT_TYPE(侵权)。 */
                @ApiListField("detail_prohibited_words")
            private List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> detailProhibitedWords;
        /** 关键字的违禁词列表, 如果关键字中没有违禁词, 则返回一个"'[]"。否则将以示例值中的格式返回。其中每个违禁词都包含了2个属性: primaryWord和types。其中primaryWord表示违禁词，types表示违禁词的类型，总共有四种类型: FORBIDEN_TYPE(禁用), RESTRICT_TYPE(限定), BRAND_TYPE(品牌), TORT_TYPE(侵权)。 */
                @ApiListField("keywords_prohibited_words")
            private List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> keywordsProhibitedWords;
        /** 类目属性的违禁词列表, 如果类目属性中没有违禁词, 则返回一个"'[]"。否则将以示例值中的格式返回。其中每个违禁词都包含了2个属性: primaryWord和types。其中primaryWord表示违禁词，types表示违禁词的类型，总共有四种类型: FORBIDEN_TYPE(禁用), RESTRICT_TYPE(限定), BRAND_TYPE(品牌), TORT_TYPE(侵权)。 */
                @ApiListField("product_properties_prohibited_words")
            private List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> productPropertiesProhibitedWords;
        /** 标题中的违禁词列表, 如果标题字中没有违禁词, 则返回一个"'[]"。否则将以示例值中的格式返回。其中每个违禁词都包含了2个属性: primaryWord和types。其中primaryWord表示违禁词，types表示违禁词的类型，总共有四种类型: FORBIDEN_TYPE(禁用), RESTRICT_TYPE(限定), BRAND_TYPE(品牌), TORT_TYPE(侵权)。 */
                @ApiListField("title_prohibited_words")
            private List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> titleProhibitedWords;
        /** 错误代码 */
                @ApiField("error_code")
            private Integer errorCode;
        /** 错误信息 */
                @ApiField("error_message")
            private String errorMessage;
    
        public List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> getDetailProhibitedWords() {
    return this.detailProhibitedWords;
    }
    public void setDetailProhibitedWords(List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> detailProhibitedWords) {
    this.detailProhibitedWords = detailProhibitedWords;
    }
        public List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> getKeywordsProhibitedWords() {
    return this.keywordsProhibitedWords;
    }
    public void setKeywordsProhibitedWords(List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> keywordsProhibitedWords) {
    this.keywordsProhibitedWords = keywordsProhibitedWords;
    }
        public List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> getProductPropertiesProhibitedWords() {
    return this.productPropertiesProhibitedWords;
    }
    public void setProductPropertiesProhibitedWords(List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> productPropertiesProhibitedWords) {
    this.productPropertiesProhibitedWords = productPropertiesProhibitedWords;
    }
        public List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> getTitleProhibitedWords() {
    return this.titleProhibitedWords;
    }
    public void setTitleProhibitedWords(List<AliexpressPostproductRedefiningFindaeproductprohibitedwordsProhibitedWord> titleProhibitedWords) {
    this.titleProhibitedWords = titleProhibitedWords;
    }
        public Integer getErrorCode() {
    return this.errorCode;
    }
    public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    }
        public String getErrorMessage() {
    return this.errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    }
    }