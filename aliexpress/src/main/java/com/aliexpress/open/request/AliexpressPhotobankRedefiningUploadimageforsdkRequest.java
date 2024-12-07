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
*  aliexpress.photobank.redefining.uploadimageforsdk
*/
public class AliexpressPhotobankRedefiningUploadimageforsdkRequest extends BaseGopRequest<AliexpressPhotobankRedefiningUploadimageforsdkResponse> {

    /** 图片保存的图片组，groupId为空，则图片保存在Other组中。 */
    private String groupId;
    /** 图片文件的字节流图片大小限制：3MB。图片大小不能超过5000*5000。 */
    private FileItem imageBytes;
    /** 上传文件名称，长度不要超过256个字符。 */
    private String fileName;

    public String getGroupId(){
        return this.groupId;
    }
    public void setGroupId(String groupId){
        this.groupId = groupId;
        }
    public FileItem getImageBytes(){
        return this.imageBytes;
    }
    public void setImageBytes(FileItem imageBytes){
        this.imageBytes = imageBytes;
        }
    public String getFileName(){
        return this.fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
        }

    @Override
    public String getApiName() {
        return "aliexpress.photobank.redefining.uploadimageforsdk";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (groupId != null) {
                        super.addApiParameter("group_id", groupId.toString());
                    }
                                        if (fileName != null) {
                        super.addApiParameter("file_name", fileName.toString());
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
    public Class<AliexpressPhotobankRedefiningUploadimageforsdkResponse> getResponseClass() {
        return AliexpressPhotobankRedefiningUploadimageforsdkResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}