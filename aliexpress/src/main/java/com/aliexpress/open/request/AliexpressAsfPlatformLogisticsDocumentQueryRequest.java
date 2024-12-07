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
*  aliexpress.asf.platform.logistics.document.query
*/
public class AliexpressAsfPlatformLogisticsDocumentQueryRequest extends BaseGopRequest<AliexpressAsfPlatformLogisticsDocumentQueryResponse> {

    /** This field represents the type of file you need to print, including waybills, picking lists, etc. Please note that currently only waybills (WAY_BILL) are supported for printing. */
    private String documentType;
    /** This field represents the type of data returned for the file you need to print, currently only supporting PDF format. Therefore, please do not fill in this field for now as it is a reserved field. */
    private String fileType;
    /** queryDocumentRequestList */
    private List<AliexpressAsfPlatformLogisticsDocumentQueryQueryDocumentRequest> queryDocumentRequestList;
    /** locale */
    private String locale;

    public String getDocumentType(){
        return this.documentType;
    }
    public void setDocumentType(String documentType){
        this.documentType = documentType;
        }
    public String getFileType(){
        return this.fileType;
    }
    public void setFileType(String fileType){
        this.fileType = fileType;
        }
    public List<AliexpressAsfPlatformLogisticsDocumentQueryQueryDocumentRequest> getQueryDocumentRequestList(){
        return this.queryDocumentRequestList;
    }
    public void setQueryDocumentRequestList(List<AliexpressAsfPlatformLogisticsDocumentQueryQueryDocumentRequest> queryDocumentRequestList){
        this.queryDocumentRequestList = queryDocumentRequestList;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }

    @Override
    public String getApiName() {
        return "aliexpress.asf.platform.logistics.document.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (documentType != null) {
                        super.addApiParameter("documentType", documentType.toString());
                    }
                            if (fileType != null) {
                        super.addApiParameter("fileType", fileType.toString());
                    }
                            if (queryDocumentRequestList != null) {
                        super.addApiParameter("queryDocumentRequestList", new JSONWriter(true, false).write(queryDocumentRequestList));
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<AliexpressAsfPlatformLogisticsDocumentQueryResponse> getResponseClass() {
        return AliexpressAsfPlatformLogisticsDocumentQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}