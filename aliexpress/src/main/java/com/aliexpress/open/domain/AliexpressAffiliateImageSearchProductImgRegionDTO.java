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

public class AliexpressAffiliateImageSearchProductImgRegionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
        /** Top Left X */
                @ApiField("pos_top_left_x")
            private String posTopLeftX;
        /** Top Left Y */
                @ApiField("pos_top_left_y")
            private String posTopLeftY;
        /** Bottom Right X */
                @ApiField("pos_bottom_right_x")
            private String posBottomRightX;
        /** Bottom Right Y */
                @ApiField("pos_bottom_right_y")
            private String posBottomRightY;
    
        public String getPosTopLeftX() {
    return this.posTopLeftX;
    }
    public void setPosTopLeftX(String posTopLeftX) {
    this.posTopLeftX = posTopLeftX;
    }
        public String getPosTopLeftY() {
    return this.posTopLeftY;
    }
    public void setPosTopLeftY(String posTopLeftY) {
    this.posTopLeftY = posTopLeftY;
    }
        public String getPosBottomRightX() {
    return this.posBottomRightX;
    }
    public void setPosBottomRightX(String posBottomRightX) {
    this.posBottomRightX = posBottomRightX;
    }
        public String getPosBottomRightY() {
    return this.posBottomRightY;
    }
    public void setPosBottomRightY(String posBottomRightY) {
    this.posBottomRightY = posBottomRightY;
    }
    }