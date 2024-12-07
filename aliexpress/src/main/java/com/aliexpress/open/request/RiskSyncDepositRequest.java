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
*  /risk/syncDeposit
*/
public class RiskSyncDepositRequest extends BaseGopRequest<RiskSyncDepositResponse> {

    /** 商家登陆ID */
    private String sellerLoginId;
    /** 商家数字ID */
    private Long sellerAliId;
    /** 保证金额 */
    private Long fixedDepositAmt;
    /** 保证金币种 */
    private String fixedDepositCcy;

    public String getSellerLoginId(){
        return this.sellerLoginId;
    }
    public void setSellerLoginId(String sellerLoginId){
        this.sellerLoginId = sellerLoginId;
        }
    public Long getSellerAliId(){
        return this.sellerAliId;
    }
    public void setSellerAliId(Long sellerAliId){
        this.sellerAliId = sellerAliId;
        }
    public Long getFixedDepositAmt(){
        return this.fixedDepositAmt;
    }
    public void setFixedDepositAmt(Long fixedDepositAmt){
        this.fixedDepositAmt = fixedDepositAmt;
        }
    public String getFixedDepositCcy(){
        return this.fixedDepositCcy;
    }
    public void setFixedDepositCcy(String fixedDepositCcy){
        this.fixedDepositCcy = fixedDepositCcy;
        }

    @Override
    public String getApiName() {
        return "/risk/syncDeposit";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (sellerLoginId != null) {
                        super.addApiParameter("sellerLoginId", sellerLoginId.toString());
                    }
                            if (sellerAliId != null) {
                        super.addApiParameter("sellerAliId", sellerAliId.toString());
                    }
                            if (fixedDepositAmt != null) {
                        super.addApiParameter("fixedDepositAmt", fixedDepositAmt.toString());
                    }
                            if (fixedDepositCcy != null) {
                        super.addApiParameter("fixedDepositCcy", fixedDepositCcy.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                            return super.getFileParams();
    }

    @Override
    public Class<RiskSyncDepositResponse> getResponseClass() {
        return RiskSyncDepositResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}