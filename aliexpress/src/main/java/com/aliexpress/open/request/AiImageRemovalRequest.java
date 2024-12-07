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
*  /ai/image/removal
*/
public class AiImageRemovalRequest extends BaseGopRequest<AiImageRemovalResponse> {

    /** 图片Base64值 */
    private String imageBase64;
    /** 图片地址 */
    private String imageUrl;
    /** 指定要删除的Element列表 */
    private List<String> removeElements;

    public String getImageBase64(){
        return this.imageBase64;
    }
    public void setImageBase64(String imageBase64){
        this.imageBase64 = imageBase64;
        }
    public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
        }
    public List<String> getRemoveElements(){
        return this.removeElements;
    }
    public void setRemoveElements(List<String> removeElements){
        this.removeElements = removeElements;
        }

    @Override
    public String getApiName() {
        return "/ai/image/removal";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (imageBase64 != null) {
                        super.addApiParameter("imageBase64", imageBase64.toString());
                    }
                            if (imageUrl != null) {
                        super.addApiParameter("imageUrl", imageUrl.toString());
                    }
                            if (removeElements != null) {
                        super.addApiParameter("removeElements", new JSONWriter(true, false).write(removeElements));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AiImageRemovalResponse> getResponseClass() {
        return AiImageRemovalResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}