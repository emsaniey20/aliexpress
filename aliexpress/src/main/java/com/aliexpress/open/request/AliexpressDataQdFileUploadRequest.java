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
*  aliexpress.data.qd.file.upload
*/
public class AliexpressDataQdFileUploadRequest extends BaseGopRequest<AliexpressDataQdFileUploadResponse> {

    /** 上传数据配置信息 */
    private AliexpressDataQdFileUploadFileUploadMeta uploadMeta;
    /** 文件字节数组 */
    private FileItem fileData;

    public AliexpressDataQdFileUploadFileUploadMeta getUploadMeta(){
        return this.uploadMeta;
    }
    public void setUploadMeta(AliexpressDataQdFileUploadFileUploadMeta uploadMeta){
        this.uploadMeta = uploadMeta;
        }
    public FileItem getFileData(){
        return this.fileData;
    }
    public void setFileData(FileItem fileData){
        this.fileData = fileData;
        }

    @Override
    public String getApiName() {
        return "aliexpress.data.qd.file.upload";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (uploadMeta != null) {
                        super.addApiParameter("upload_meta", new JSONWriter(true, false).write(uploadMeta));
                    }
                                return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                if (fileData != null) {
            super.addFileParameter("file_data", fileData);
        }
                    return super.getFileParams();
    }

    @Override
    public Class<AliexpressDataQdFileUploadResponse> getResponseClass() {
        return AliexpressDataQdFileUploadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}