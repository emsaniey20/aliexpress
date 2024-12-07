package com.aliexpress.open.request;

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
import com.aliexpress.open.response.*;


/**
*  aliexpress.category.redefining.getallchildattributesresult
*/
public class AliexpressCategoryRedefiningGetallchildattributesresultRequest extends BaseGopRequest<AliexpressCategoryRedefiningGetallchildattributesresultResponse> {

    /** 叶子类目ID。通过产品获取类目ID，如果只传cid，则返回一级属性。 */
    private String cateId;
    /** 获取属性值文本对应的多语言信息 */
    private String locale;
    /** 类目子属性路径,由该子属性上层的类目属性id和类目属性值id组成,格式参考示例，多个用逗号隔开，第二个属性及为第一个的属性值的子属性，第三个属性为第二个属性的子属性，以此类推。如需返回此类目对应的子属性，则需同cateid一起进行提交。 */
    private List<String> parentAttrvalueList;

    public String getCateId(){
        return this.cateId;
    }
    public void setCateId(String cateId){
        this.cateId = cateId;
        }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
        }
    public List<String> getParentAttrvalueList(){
        return this.parentAttrvalueList;
    }
    public void setParentAttrvalueList(List<String> parentAttrvalueList){
        this.parentAttrvalueList = parentAttrvalueList;
        }

    @Override
    public String getApiName() {
        return "aliexpress.category.redefining.getallchildattributesresult";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (cateId != null) {
                        super.addApiParameter("cate_id", cateId.toString());
                    }
                            if (locale != null) {
                        super.addApiParameter("locale", locale.toString());
                    }
                            if (parentAttrvalueList != null) {
                        super.addApiParameter("parent_attrvalue_list", new JSONWriter(true, false).write(parentAttrvalueList));
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                                return super.getFileParams();
    }

    @Override
    public Class<AliexpressCategoryRedefiningGetallchildattributesresultResponse> getResponseClass() {
        return AliexpressCategoryRedefiningGetallchildattributesresultResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}