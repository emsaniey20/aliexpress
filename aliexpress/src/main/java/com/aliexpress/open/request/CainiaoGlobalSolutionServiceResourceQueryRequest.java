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
*  cainiao.global.solution.service.resource.query
*/
public class CainiaoGlobalSolutionServiceResourceQueryRequest extends BaseGopRequest<CainiaoGlobalSolutionServiceResourceQueryResponse> {

    /** 发件信息 */
    private CainiaoGlobalSolutionServiceResourceQueryOpenSenderParam senderParam;
    /** 多语言信息 */
    private String locale;
    /** 商家信息 */
    private String sellerParam;
    /** 查询参数 */
    private CainiaoGlobalSolutionServiceResourceQueryQuerySolutionServiceResParam solutionServiceResParam;

    public CainiaoGlobalSolutionServiceResourceQueryOpenSenderParam getSenderParam(){
        return this.senderParam;
    }
    public void setSenderParam(CainiaoGlobalSolutionServiceResourceQueryOpenSenderParam senderParam){
        this.senderParam = senderParam;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public String getSellerParam(){
        return this.sellerParam;
    }
    public void setSellerParam(String sellerParam){
        this.sellerParam = sellerParam;
        }
    public CainiaoGlobalSolutionServiceResourceQueryQuerySolutionServiceResParam getSolutionServiceResParam(){
        return this.solutionServiceResParam;
    }
    public void setSolutionServiceResParam(CainiaoGlobalSolutionServiceResourceQueryQuerySolutionServiceResParam solutionServiceResParam){
        this.solutionServiceResParam = solutionServiceResParam;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.solution.service.resource.query";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (senderParam != null) {
                        super.addApiParameter("sender_param", new JSONWriter(true, false).write(senderParam));
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (sellerParam != null) {
                        super.addApiParameter("seller_param", sellerParam.toString());
                    }
                            if (solutionServiceResParam != null) {
                        super.addApiParameter("solution_service_res_param", new JSONWriter(true, false).write(solutionServiceResParam));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalSolutionServiceResourceQueryResponse> getResponseClass() {
        return CainiaoGlobalSolutionServiceResourceQueryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}