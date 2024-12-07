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

public class CainiaoGlobalSolutionInquiryOpenSolutionInquiryResponse implements Serializable {
    private static final long serialVersionUID = 1L;
        /** 可用的解决方案列表 */
                @ApiListField("usable_solution_list")
            private List<CainiaoGlobalSolutionInquiryOpenSolutionDTO> usableSolutionList;
    
        public List<CainiaoGlobalSolutionInquiryOpenSolutionDTO> getUsableSolutionList() {
    return this.usableSolutionList;
    }
    public void setUsableSolutionList(List<CainiaoGlobalSolutionInquiryOpenSolutionDTO> usableSolutionList) {
    this.usableSolutionList = usableSolutionList;
    }
    }