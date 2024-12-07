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

public class AliexpressPhotobankRedefiningDelunusephotoAeopDeleteImageRequest implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 图片ID(通过“图片银行列表分页查询”接口进行获取，出参中“ iid:图片”为图片ID。 */
                @ApiField("image_repository_id")
            private Long imageRepositoryId;
    
        public Long getImageRepositoryId() {
    return this.imageRepositoryId;
    }
    public void setImageRepositoryId(Long imageRepositoryId) {
    this.imageRepositoryId = imageRepositoryId;
    }
    }