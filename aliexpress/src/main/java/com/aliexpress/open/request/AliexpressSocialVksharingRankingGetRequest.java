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
*  aliexpress.social.vksharing.ranking.get
*/
public class AliexpressSocialVksharingRankingGetRequest extends BaseGopRequest<AliexpressSocialVksharingRankingGetResponse> {

    /** vk adid, If there are more than one, use , split */
    private String adid;
    /** user id */
    private String snsId;
    /** 1 for female, 2 for male */
    private String sex;
    /** number of result page */
    private Integer page;
    /** items per page */
    private Integer recLimit;

    public String getAdid(){
        return this.adid;
    }
    public void setAdid(String adid){
        this.adid = adid;
        }
    public String getSnsId(){
        return this.snsId;
    }
    public void setSnsId(String snsId){
        this.snsId = snsId;
        }
    public String getSex(){
        return this.sex;
    }
    public void setSex(String sex){
        this.sex = sex;
        }
    public Integer getPage(){
        return this.page;
    }
    public void setPage(Integer page){
        this.page = page;
        }
    public Integer getRecLimit(){
        return this.recLimit;
    }
    public void setRecLimit(Integer recLimit){
        this.recLimit = recLimit;
        }

    @Override
    public String getApiName() {
        return "aliexpress.social.vksharing.ranking.get";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (adid != null) {
                        super.addApiParameter("adid", adid.toString());
                    }
                            if (snsId != null) {
                        super.addApiParameter("sns_id", snsId.toString());
                    }
                            if (sex != null) {
                        super.addApiParameter("sex", sex.toString());
                    }
                            if (page != null) {
                        super.addApiParameter("page", page.toString());
                    }
                            if (recLimit != null) {
                        super.addApiParameter("rec_limit", recLimit.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                                        return super.getFileParams();
    }

    @Override
    public Class<AliexpressSocialVksharingRankingGetResponse> getResponseClass() {
        return AliexpressSocialVksharingRankingGetResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}