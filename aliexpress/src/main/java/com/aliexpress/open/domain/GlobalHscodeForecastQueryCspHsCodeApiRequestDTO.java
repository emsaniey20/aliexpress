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

public class GlobalHscodeForecastQueryCspHsCodeApiRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 主图链接："https://ae01.alicdn.com/kf/S74f777cfd20b4e22a936e68667fa7ab4r.jpg"    */
                @ApiField("image_url")
            private String imageUrl;
        /** 渠道必填，目前支持的渠道有全球商品：AE_GLOBAL 。 arise商品：ARISE_ES   。 */
                @ApiField("channel")
            private String channel;
        /** 商品英文标题 */
                @ApiField("title")
            private String title;
        /** 商品普通属性列表。可以参照商品发布接口填写 */
                @ApiListField("product_property_list")
            private List<GlobalHscodeForecastQueryProductProperty> productPropertyList;
        /** 叶子类目id。 可以传统一的叶子类目，也可以传arise的叶子类目。 category_id 和 channel必须对应上，当channel = AE_GLOBAL 时只能传 统一的叶子类目 ；    当channel = ARISE_ES 时只能传 arise的叶子类目。   */
                @ApiField("category_id")
            private Long categoryId;
    
        public String getImageUrl() {
    return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    }
        public String getChannel() {
    return this.channel;
    }
    public void setChannel(String channel) {
    this.channel = channel;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public List<GlobalHscodeForecastQueryProductProperty> getProductPropertyList() {
    return this.productPropertyList;
    }
    public void setProductPropertyList(List<GlobalHscodeForecastQueryProductProperty> productPropertyList) {
    this.productPropertyList = productPropertyList;
    }
        public Long getCategoryId() {
    return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
    }
    }