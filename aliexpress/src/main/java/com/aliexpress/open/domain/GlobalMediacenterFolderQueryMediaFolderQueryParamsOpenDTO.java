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

public class GlobalMediacenterFolderQueryMediaFolderQueryParamsOpenDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 文件夹id，必须大于等于0。0表示根文件夹 */
                @ApiField("folder_id")
            private Long folderId;
    
        public Long getFolderId() {
    return this.folderId;
    }
    public void setFolderId(Long folderId) {
    this.folderId = folderId;
    }
    }