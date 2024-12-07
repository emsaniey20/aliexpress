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
*  global.mediacenter.image.upload
*/
public class GlobalMediacenterImageUploadRequest extends BaseGopRequest<GlobalMediacenterImageUploadResponse> {

    /** 图片文件名称 */
    private String originFileName;
    /** 图片文件内容的字节流数组，图片大小不能超过3MB */
    private FileItem content;
    /** 文件夹id，必须大于等于0。0表示根文件夹 */
    private Long folderId;

    public String getOriginFileName(){
        return this.originFileName;
    }
    public void setOriginFileName(String originFileName){
        this.originFileName = originFileName;
        }
    public FileItem getContent(){
        return this.content;
    }
    public void setContent(FileItem content){
        this.content = content;
        }
    public Long getFolderId(){
        return this.folderId;
    }
    public void setFolderId(Long folderId){
        this.folderId = folderId;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.image.upload";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (originFileName != null) {
                        super.addApiParameter("origin_file_name", originFileName.toString());
                    }
                                        if (folderId != null) {
                        super.addApiParameter("folder_id", folderId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                if (content != null) {
            super.addFileParameter("content", content);
        }
                                return super.getFileParams();
    }

    @Override
    public Class<GlobalMediacenterImageUploadResponse> getResponseClass() {
        return GlobalMediacenterImageUploadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}