package com.aliexpress.open.domain;

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
import com.global.iop.infra.mapping.ApiField;
import com.global.iop.infra.mapping.ApiListField;

public class AliexpressCarmodelGetArticleArticleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 产品组id */
                @ApiField("generic_article_id")
            private Integer genericArticleId;
        /** 零件状态id */
                @ApiField("article_status_id")
            private Integer articleStatusId;
        /** 零件状态描述 */
                @ApiField("article_status_description")
            private String articleStatusDescription;
        /** GTIN/EAN 编号 */
                @ApiField("gtin")
            private String gtin;
        /** 关联车型的零件id */
                @ApiField("legacy_article_id")
            private Integer legacyArticleId;
        /** 制造商名称 */
                @ApiField("mfr_name")
            private String mfrName;
        /** 制造商id */
                @ApiField("mfr_id")
            private Integer mfrId;
        /** 零件编号 */
                @ApiField("article_number")
            private String articleNumber;
        /** 产品组名称 */
                @ApiField("generic_article_description")
            private String genericArticleDescription;
        /** 标准信息 */
                @ApiListField("article_criteria")
            private List<AliexpressCarmodelGetArticleCriteriaDTO> articleCriteria;
        /** OE号，逗号隔开 */
                @ApiField("oem_number")
            private String oemNumber;
        /** 图片链接 */
                @ApiField("image_url")
            private String imageUrl;
    
        public Integer getGenericArticleId() {
    return this.genericArticleId;
    }
    public void setGenericArticleId(Integer genericArticleId) {
    this.genericArticleId = genericArticleId;
    }
        public Integer getArticleStatusId() {
    return this.articleStatusId;
    }
    public void setArticleStatusId(Integer articleStatusId) {
    this.articleStatusId = articleStatusId;
    }
        public String getArticleStatusDescription() {
    return this.articleStatusDescription;
    }
    public void setArticleStatusDescription(String articleStatusDescription) {
    this.articleStatusDescription = articleStatusDescription;
    }
        public String getGtin() {
    return this.gtin;
    }
    public void setGtin(String gtin) {
    this.gtin = gtin;
    }
        public Integer getLegacyArticleId() {
    return this.legacyArticleId;
    }
    public void setLegacyArticleId(Integer legacyArticleId) {
    this.legacyArticleId = legacyArticleId;
    }
        public String getMfrName() {
    return this.mfrName;
    }
    public void setMfrName(String mfrName) {
    this.mfrName = mfrName;
    }
        public Integer getMfrId() {
    return this.mfrId;
    }
    public void setMfrId(Integer mfrId) {
    this.mfrId = mfrId;
    }
        public String getArticleNumber() {
    return this.articleNumber;
    }
    public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    }
        public String getGenericArticleDescription() {
    return this.genericArticleDescription;
    }
    public void setGenericArticleDescription(String genericArticleDescription) {
    this.genericArticleDescription = genericArticleDescription;
    }
        public List<AliexpressCarmodelGetArticleCriteriaDTO> getArticleCriteria() {
    return this.articleCriteria;
    }
    public void setArticleCriteria(List<AliexpressCarmodelGetArticleCriteriaDTO> articleCriteria) {
    this.articleCriteria = articleCriteria;
    }
        public String getOemNumber() {
    return this.oemNumber;
    }
    public void setOemNumber(String oemNumber) {
    this.oemNumber = oemNumber;
    }
        public String getImageUrl() {
    return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    }
    }