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
*  aliexpress.warranty.order.uploadimage
*/
public class AliexpressWarrantyOrderUploadimageRequest extends BaseGopRequest<AliexpressWarrantyOrderUploadimageResponse> {

    /** img_data */
    private FileItem imgData;
    /** extension */
    private String extension;
    /** warrantyCode */
    private String warrantyCode;

    public FileItem getImgData(){
        return this.imgData;
    }
    public void setImgData(FileItem imgData){
        this.imgData = imgData;
        }
    public String getExtension(){
        return this.extension;
    }
    public void setExtension(String extension){
        this.extension = extension;
        }
    public String getWarrantyCode(){
        return this.warrantyCode;
    }
    public void setWarrantyCode(String warrantyCode){
        this.warrantyCode = warrantyCode;
        }

    @Override
    public String getApiName() {
        return "aliexpress.warranty.order.uploadimage";
    }
    @Override
    public IopHashMap getApiParams() {
                                if (extension != null) {
                        super.addApiParameter("extension", extension.toString());
                    }
                            if (warrantyCode != null) {
                        super.addApiParameter("warranty_code", warrantyCode.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                    if (imgData != null) {
            super.addFileParameter("img_data", imgData);
        }
                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressWarrantyOrderUploadimageResponse> getResponseClass() {
        return AliexpressWarrantyOrderUploadimageResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}