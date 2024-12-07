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

public class AliexpressPostproductRedefiningCategoryforecastAeopCategoryForecastResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 类目预测结果。  字段含义 ：  "score"：预测可能性分数，分数越高结果越准确。"category_name_path"：预测类目路径，locale语种。"cn_name"：中文的叶子类目名。"category_id"：叶子类目id。"category_id_path"：类目id路径。"name"：叶子类目名称，locale语种。"suitability_rank"：类目适合度排序，值越小越适合。"cn_category_name_path"：中文类目路径 */
                @ApiListField("category_suitability_list")
            private List<String> categorySuitabilityList;
    
        public List<String> getCategorySuitabilityList() {
    return this.categorySuitabilityList;
    }
    public void setCategorySuitabilityList(List<String> categorySuitabilityList) {
    this.categorySuitabilityList = categorySuitabilityList;
    }
    }