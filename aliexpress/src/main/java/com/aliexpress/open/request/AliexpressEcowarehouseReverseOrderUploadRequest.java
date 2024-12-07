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
*  aliexpress.ecowarehouse.reverse.order.upload
*/
public class AliexpressEcowarehouseReverseOrderUploadRequest extends BaseGopRequest<AliexpressEcowarehouseReverseOrderUploadResponse> {

    /** 文件流 */
    private FileItem fileStream;
    /** 字符串 */
    private String warehouseCustomerId;

    public FileItem getFileStream(){
        return this.fileStream;
    }
    public void setFileStream(FileItem fileStream){
        this.fileStream = fileStream;
        }
    public String getWarehouseCustomerId(){
        return this.warehouseCustomerId;
    }
    public void setWarehouseCustomerId(String warehouseCustomerId){
        this.warehouseCustomerId = warehouseCustomerId;
        }

    @Override
    public String getApiName() {
        return "aliexpress.ecowarehouse.reverse.order.upload";
    }
    @Override
    public IopHashMap getApiParams() {
                                if (warehouseCustomerId != null) {
                        super.addApiParameter("warehouse_customer_id", warehouseCustomerId.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                    if (fileStream != null) {
            super.addFileParameter("file_stream", fileStream);
        }
                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressEcowarehouseReverseOrderUploadResponse> getResponseClass() {
        return AliexpressEcowarehouseReverseOrderUploadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}