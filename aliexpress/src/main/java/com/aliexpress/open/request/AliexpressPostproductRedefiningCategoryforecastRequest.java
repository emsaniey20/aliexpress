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
*  aliexpress.postproduct.redefining.categoryforecast
*/
public class AliexpressPostproductRedefiningCategoryforecastRequest extends BaseGopRequest<AliexpressPostproductRedefiningCategoryforecastResponse> {

    /** 必填。图片url，请isv上传商品图片，通过图片银行接口获取。当语种为俄语时不必填。 */
    private String imageUrl;
    /** 商品标题 */
    private String subject;
    /** 必填。商品标题语种:en，ru，pt，id，es，fr，it，de，nl，tr，he，ja，ar，th，vi，ko，pl */
    private String locale;
    /** 是否过滤类目准入权限 N=不过滤 | Y=过滤，不填写时，默认为N , 如果是发品类目预测需要填 Y，否则返回的类目可能会在发品时报错，影响用户体验 */
    private String isFilterByPermission;

    public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public String getIsFilterByPermission(){
        return this.isFilterByPermission;
    }
    public void setIsFilterByPermission(String isFilterByPermission){
        this.isFilterByPermission = isFilterByPermission;
        }

    @Override
    public String getApiName() {
        return "aliexpress.postproduct.redefining.categoryforecast";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imageUrl != null) {
                        super.addApiParameter("image_url", imageUrl.toString());
                    }
                            if (subject != null) {
                        super.addApiParameter("subject", subject.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (isFilterByPermission != null) {
                        super.addApiParameter("is_filter_by_permission", isFilterByPermission.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressPostproductRedefiningCategoryforecastResponse> getResponseClass() {
        return AliexpressPostproductRedefiningCategoryforecastResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}