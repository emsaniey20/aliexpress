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
*  aliexpress.image.redefining.uploadtempimage
*/
public class AliexpressImageRedefiningUploadtempimageRequest extends BaseGopRequest<AliexpressImageRedefiningUploadtempimageResponse> {

    /** 图片文件二进制数据流 */
    private FileItem fileData;
    /** 图片原名 */
    private String srcFileName;

    public FileItem getFileData(){
        return this.fileData;
    }
    public void setFileData(FileItem fileData){
        this.fileData = fileData;
        }
    public String getSrcFileName(){
        return this.srcFileName;
    }
    public void setSrcFileName(String srcFileName){
        this.srcFileName = srcFileName;
        }

    @Override
    public String getApiName() {
        return "aliexpress.image.redefining.uploadtempimage";
    }
    @Override
    public IopHashMap getApiParams() {
                                if (srcFileName != null) {
                        super.addApiParameter("src_file_name", srcFileName.toString());
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
    public Class<AliexpressImageRedefiningUploadtempimageResponse> getResponseClass() {
        return AliexpressImageRedefiningUploadtempimageResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}