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
*  /ae/res/cover/default/api
*/
public class AeResCoverDefaultApiRequest extends BaseGopRequest<AeResCoverDefaultApiResponse> {

    /** 1 */
    private AeResCoverDefaultApiAEDefaultFirstObject firstObj;
    /** 1 */
    private FileItem firstFile;

    public AeResCoverDefaultApiAEDefaultFirstObject getFirstObj(){
        return this.firstObj;
    }
    public void setFirstObj(AeResCoverDefaultApiAEDefaultFirstObject firstObj){
        this.firstObj = firstObj;
        }
    public FileItem getFirstFile(){
        return this.firstFile;
    }
    public void setFirstFile(FileItem firstFile){
        this.firstFile = firstFile;
        }

    @Override
    public String getApiName() {
        return "/ae/res/cover/default/api";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (firstObj != null) {
                        super.addApiParameter("first_obj", new JSONWriter(true, false).write(firstObj));
                    }
                                return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                if (firstFile != null) {
            super.addFileParameter("first_file", firstFile);
        }
                    return super.getFileParams();
    }

    @Override
    public Class<AeResCoverDefaultApiResponse> getResponseClass() {
        return AeResCoverDefaultApiResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}