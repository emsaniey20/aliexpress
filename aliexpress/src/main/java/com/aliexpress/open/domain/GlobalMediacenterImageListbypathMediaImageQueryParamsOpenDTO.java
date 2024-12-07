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

public class GlobalMediacenterImageListbypathMediaImageQueryParamsOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片path信息，数组长度不能超过50。如已查询媒体中心中某图片URL为https://ae01.alicdn.com/kf/S89bbccac0eb54d68a641fa93e984e4fr.jpeg，其path为S89bbccac0eb54d68a641fa93e984e4fr.jpeg */
                @ApiListField("path_name_list")
            private List<String> pathNameList;
    
        public List<String> getPathNameList() {
    return this.pathNameList;
    }
    public void setPathNameList(List<String> pathNameList) {
    this.pathNameList = pathNameList;
    }
    }