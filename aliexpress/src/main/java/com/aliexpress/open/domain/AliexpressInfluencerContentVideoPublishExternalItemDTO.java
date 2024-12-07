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

public class AliexpressInfluencerContentVideoPublishExternalItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 来源 */
                @ApiField("source")
            private String source;
        /** 名称 */
                @ApiField("title")
            private String title;
        /** 链接 */
                @ApiField("item_url")
            private String itemUrl;
        /** 主图 */
                @ApiField("item_main_pic")
            private String itemMainPic;
        /** 图片列表 */
                @ApiListField("item_pics")
            private List<String> itemPics;
        /** 价格 */
                @ApiField("item_price")
            private String itemPrice;
    
        public String getSource() {
    return this.source;
    }
    public void setSource(String source) {
    this.source = source;
    }
        public String getTitle() {
    return this.title;
    }
    public void setTitle(String title) {
    this.title = title;
    }
        public String getItemUrl() {
    return this.itemUrl;
    }
    public void setItemUrl(String itemUrl) {
    this.itemUrl = itemUrl;
    }
        public String getItemMainPic() {
    return this.itemMainPic;
    }
    public void setItemMainPic(String itemMainPic) {
    this.itemMainPic = itemMainPic;
    }
        public List<String> getItemPics() {
    return this.itemPics;
    }
    public void setItemPics(List<String> itemPics) {
    this.itemPics = itemPics;
    }
        public String getItemPrice() {
    return this.itemPrice;
    }
    public void setItemPrice(String itemPrice) {
    this.itemPrice = itemPrice;
    }
    }