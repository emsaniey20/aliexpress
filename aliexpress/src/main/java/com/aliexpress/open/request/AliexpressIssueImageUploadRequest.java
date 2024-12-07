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
*  aliexpress.issue.image.upload
*/
public class AliexpressIssueImageUploadRequest extends BaseGopRequest<AliexpressIssueImageUploadResponse> {

    /** 买家登录帐号 */
    private String buyerLoginId;
    /** 文件后缀名 */
    private String extension;
    /** 图片内容 字节流 */
    private FileItem imageBytes;
    /** 纠纷id */
    private Long issueId;

    public String getBuyerLoginId(){
        return this.buyerLoginId;
    }
    public void setBuyerLoginId(String buyerLoginId){
        this.buyerLoginId = buyerLoginId;
        }
    public String getExtension(){
        return this.extension;
    }
    public void setExtension(String extension){
        this.extension = extension;
        }
    public FileItem getImageBytes(){
        return this.imageBytes;
    }
    public void setImageBytes(FileItem imageBytes){
        this.imageBytes = imageBytes;
        }
    public Long getIssueId(){
        return this.issueId;
    }
    public void setIssueId(Long issueId){
        this.issueId = issueId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.issue.image.upload";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (buyerLoginId != null) {
                        super.addApiParameter("buyer_login_id", buyerLoginId.toString());
                    }
                            if (extension != null) {
                        super.addApiParameter("extension", extension.toString());
                    }
                                        if (issueId != null) {
                        super.addApiParameter("issue_id", issueId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                            if (imageBytes != null) {
            super.addFileParameter("image_bytes", imageBytes);
        }
                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressIssueImageUploadResponse> getResponseClass() {
        return AliexpressIssueImageUploadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}