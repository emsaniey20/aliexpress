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

public class GlobalProductsListCspProductSearchApiRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 创建时间范围（指定时间之后） */
                @ApiField("create_after")
            private String createAfter;
        /** 商品状态（0或不填是全部，1 是上架 ，-1 是删除 ， -2 是下架 ，-5 是 审核中 ，-10 是 草稿 ， 101 是废弃 ） */
                @ApiField("product_status")
            private Integer productStatus;
        /** 每页商品数量 ，最多查询20个商品 */
                @ApiField("page_size")
            private Long pageSize;
        /** 更新时间范围（指定时间之前） */
                @ApiField("update_before")
            private String updateBefore;
        /** 商品拥有的渠道 */
                @ApiListField("channels")
            private List<String> channels;
        /** 创建时间范围（指定时间之前） */
                @ApiField("create_before")
            private String createBefore;
        /** 更新时间范围（指定时间之后） */
                @ApiField("update_after")
            private String updateAfter;
        /** 其他过滤选项  。 "productId": 商品ID     "leafCategoryId":商品所属类目     "lowerPrice": 商品价格范围（最低价）     "upperPrice": 商品价格范围（最高价）         case.  :{     "productId":121871222887,     "leafCategoryId":622451821,     "lowerPrice":"10",     "upperPrice":"30" } */
                @ApiField("options")
            private String options;
        /** 当前页码 */
                @ApiField("current_page")
            private Long currentPage;
    
        public String getCreateAfter() {
    return this.createAfter;
    }
    public void setCreateAfter(String createAfter) {
    this.createAfter = createAfter;
    }
        public Integer getProductStatus() {
    return this.productStatus;
    }
    public void setProductStatus(Integer productStatus) {
    this.productStatus = productStatus;
    }
        public Long getPageSize() {
    return this.pageSize;
    }
    public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    }
        public String getUpdateBefore() {
    return this.updateBefore;
    }
    public void setUpdateBefore(String updateBefore) {
    this.updateBefore = updateBefore;
    }
        public List<String> getChannels() {
    return this.channels;
    }
    public void setChannels(List<String> channels) {
    this.channels = channels;
    }
        public String getCreateBefore() {
    return this.createBefore;
    }
    public void setCreateBefore(String createBefore) {
    this.createBefore = createBefore;
    }
        public String getUpdateAfter() {
    return this.updateAfter;
    }
    public void setUpdateAfter(String updateAfter) {
    this.updateAfter = updateAfter;
    }
        public String getOptions() {
    return this.options;
    }
    public void setOptions(String options) {
    this.options = options;
    }
        public Long getCurrentPage() {
    return this.currentPage;
    }
    public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
    }
    }