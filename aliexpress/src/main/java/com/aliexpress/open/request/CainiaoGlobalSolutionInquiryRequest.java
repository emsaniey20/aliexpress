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
*  cainiao.global.solution.inquiry
*/
public class CainiaoGlobalSolutionInquiryRequest extends BaseGopRequest<CainiaoGlobalSolutionInquiryResponse> {

    /** 多语言，zh_CN中文、en_US:英文、ru_RU俄语 */
    private String locale;
    /** 交易单参数 */
    private CainiaoGlobalSolutionInquiryOpenTradeOrderParam tradeOrderParam;
    /** 商家信息 */
    private String sellerInfoParam;
    /** 包裹参数 */
    private List<CainiaoGlobalSolutionInquiryOpenPackageParam> packageParams;

    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public CainiaoGlobalSolutionInquiryOpenTradeOrderParam getTradeOrderParam(){
        return this.tradeOrderParam;
    }
    public void setTradeOrderParam(CainiaoGlobalSolutionInquiryOpenTradeOrderParam tradeOrderParam){
        this.tradeOrderParam = tradeOrderParam;
        }
    public String getSellerInfoParam(){
        return this.sellerInfoParam;
    }
    public void setSellerInfoParam(String sellerInfoParam){
        this.sellerInfoParam = sellerInfoParam;
        }
    public List<CainiaoGlobalSolutionInquiryOpenPackageParam> getPackageParams(){
        return this.packageParams;
    }
    public void setPackageParams(List<CainiaoGlobalSolutionInquiryOpenPackageParam> packageParams){
        this.packageParams = packageParams;
        }

    @Override
    public String getApiName() {
        return "cainiao.global.solution.inquiry";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (tradeOrderParam != null) {
                        super.addApiParameter("trade_order_param", new JSONWriter(true, false).write(tradeOrderParam));
                    }
                            if (sellerInfoParam != null) {
                        super.addApiParameter("seller_info_param", sellerInfoParam.toString());
                    }
                            if (packageParams != null) {
                        super.addApiParameter("package_params", new JSONWriter(true, false).write(packageParams));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<CainiaoGlobalSolutionInquiryResponse> getResponseClass() {
        return CainiaoGlobalSolutionInquiryResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}