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
*  /brazil/local/invoice/upload
*/
public class BrazilLocalInvoiceUploadRequest extends BaseGopRequest<BrazilLocalInvoiceUploadResponse> {

    /** file name */
    private String fileName;
    /** trade order id */
    private String tradeOrderId;
    /** file byte */
    private FileItem fileContent;

    public String getFileName(){
        return this.fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
        }
    public String getTradeOrderId(){
        return this.tradeOrderId;
    }
    public void setTradeOrderId(String tradeOrderId){
        this.tradeOrderId = tradeOrderId;
        }
    public FileItem getFileContent(){
        return this.fileContent;
    }
    public void setFileContent(FileItem fileContent){
        this.fileContent = fileContent;
        }

    @Override
    public String getApiName() {
        return "/brazil/local/invoice/upload";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (fileName != null) {
                        super.addApiParameter("file_name", fileName.toString());
                    }
                            if (tradeOrderId != null) {
                        super.addApiParameter("trade_order_id", tradeOrderId.toString());
                    }
                                return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                            if (fileContent != null) {
            super.addFileParameter("file_content", fileContent);
        }
                    return super.getFileParams();
    }

    @Override
    public Class<BrazilLocalInvoiceUploadResponse> getResponseClass() {
        return BrazilLocalInvoiceUploadResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}