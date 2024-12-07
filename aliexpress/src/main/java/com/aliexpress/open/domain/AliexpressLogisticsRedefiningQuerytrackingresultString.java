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

public class AliexpressLogisticsRedefiningQuerytrackingresultString implements Serializable {
    private static final long serialVersionUID = 1L;
        /** eventDesc */
                @ApiField("event_desc")
            private String eventDesc;
        /** signedName */
                @ApiField("signed_name")
            private String signedName;
        /** 废弃;请勿再使用该字段.改成使用action_code */
                @ApiField("status")
            private String status;
        /** address */
                @ApiField("address")
            private String address;
        /** 如果想与菜鸟全球物流跟踪官网的时间保持一致，java可以使用以下代码处理 LocalDateTime.ofInstant(Instant.ofEpochMilli(eventDate.getTime()), ZoneId.of("America/Los_Angeles")).format("yyyy-MM-dd HH:mm:ss");其他语言可以自行转换 */
                @ApiField("event_date")
            private String eventDate;
        /** CONSIGN("声明发货"),OM_CONSIGN("商家发货"),GTMS_ASN("接收到电子预报"),PU_PICKUP_SUCCESS("揽收成功"),PU_PICKUP_FAILURE("揽收异常"),PU_SIGN_IN_SUCCESS("揽收点签收成功"),PU_SIGN_IN_FAILURE("揽收点签收异常"),SC_SIGN_IN_SUCCESS("签收成功"),SC_SIGN_IN_FAILURE("签收异常"),SC_INBOUND_SUCCESS("入库成功"),SC_INBOUND_FAILURE("入库异常"),SC_OUTBOUND_SUCCESS("出库成功"),SC_OUTBOUND_FAILURE("出库异常"),SC_HO_OUT_SUCCESS("仓转交干线成功"),SC_HO_OUT_FAILURE("仓转交干线异常"),TD_TRANS_ARRIVE("到达中转"),TD_TRANS_DEPART("离开中转"),CC_TRANS＿START("中转国清关开始"),CC_TRANS＿SUCCESS("中转国清关成功"),CC_TRANS_FAILURE("中转国清关失败"),LH_HO_IN_SUCCESS("交接成功"),LH_HO_IN_FAILURE("交接异常"),LH_POST_COLLECTION("交接异常"),LH_HO_AIRLINE("交航安检成功"),LH_HO_AIRLINE_FAILURE("交航安检失败"),LH_DEPART("航班起飞 (干线离开）"),LH_ARRIVE("航班到达（干线抵达目的国）"),LH_ARRIVE_FAILURE("干线到达异常"),LH_HO_OUT_SUCCESS("干线转交成功"),LH_HO_OUT_FAILURE("干线转交异常"),LH_OTHER("其他"),CC_EX_START("出口清关开始"),CC_EX_SUCCESS("出口清关完成"),CC_EX_FAILURE("出口清关异常"),CC_HO_IN_SUCCESS("清关交接成功"),CC_HO_IN_FAILURE("清关交接异常"),CC_IM_START("清关开始(目的地）"),CC_IM_PROCESS("清关中(目的地）"),CC_IM_SUCCESS("清关完成(目的地）"),CC_IM_FAILURE("清关异常(目的地）"),CC_HO_OUT_SUCCESS("清关转交成功"),CC_HO_OUT_FAILURE("清关转交失败"),CUS_SUCCESS("海关审单通过"),CUS_FAILURE("海关审单异常"),CUS_TAX("海关出税"),CIQ_SUCCESS("商检审单通过"),CIQ_FAILURE("商检审单异常"),CUS_DECLARE("海关申报"),GTMS_ACCEPT("到达目的国/配送揽收成功"),GTMS_SC_ARRIVE("到达目的国SC"),GTMS_SC_ARRIVE_FAILURE("到达目的国SC失败"),GTMS_DO_ARRIVE("到达最后投递站"),GTMS_DO_DEPART("离开最后投递站"),GTMS_DELIVERING("开始投递"),GTMS_DEL_FAILURE("投递失败"),GTMS_RE_DELIVERING("再次投递"),GTMS_RELABEL("转单"),GTMS_SIGNED("用户签收"),GTMS_SIGN_FAILURE("用户签收异常"),GTMS_WAIT_SELF_PICK("等待用户自提"),GTMS_STA_SIGNED("自提点签收"),GTMS_STA_SIGN_FAILURE("自提点签收异常"),GTMS_STATION_IN("配送中各节点（国外）"),GTMS_STATION_OUT("配送中各节点（国外）"),GTMS_FAILURE("配送异常"),RT_INBOUND("退回给卖家（回到海外cp仓库）"),RETURNED("退回卖家签收"),GOT("配送揽收成功（国内）"),REJECT("配送揽收异常（国内）"),DEPARTURE("配送中各节点（国内）"),ARRIVAL("配送中各节点（国内）"),SENT_SCAN("包裹开始派送（国内）"),SIGNED("包裹妥投成功（国内）"),FAILED("包裹妥投异常（国内）"),GTMS_OTHER("其他"),GSTA_SIGN("自提点用户签收"),GSTA_SIGN_FAIL("自提点用户签收异常"),STA_SIGN("自提点用户签收(国内段）"),STA_SIGN_FAIL("自提点用户签收异常（国内段）"),GSTA_OTHER("其他"),RT_OUTBOUND("海外CP出库"),RT_DESTROY("海外CP销毁"),RT_HO_OUT("CP交出"),RT_WH_HO_IN("退货仓接收"),RT_WH_HO_IN_FAIL("退货仓接收失败"),RT_WH_INBOUND("退货仓入库"),RT_WH_INBOUND_FAILURE("退货仓入库失败"),RT_WH_DESTROY("销毁"),RT_WH_OUTBOUND("退货仓出库"),RT_WH_HO_OUT("退货仓交出"),RT_TRANSWH_HO_IN("中转仓接收"),RT_TRANSWH_INBOUND("中转仓入库"),RT_TRANSWH_OUTBOUND("中转仓出库"),RT_TMS_ACCEPT("国内配接收"),GWMS_ACCEPT("接单成功"),GWMS_REJECT("接单异常"),GWMS_PACKAGE("打包完成"),GWMS_EXCEPTION("仓内异常"),GWMS_OUTBOUND("出库成功"),GWMS_CANCEL("取消成功"),GWMS_PICK("拣选完成"),GWMS_HANDOVER("交接成功"),GSTAHUB_INBOUND("自提分拨中心入库成功"),GSTAHUB_INBOUND_FAIL("自提分拨中心入库失败"),GSTA_INBOUND("自提点入库成功"),GSTA_INBOUND_FAIL("自提点入库失败"),GSTA_BUYER_SIGN("自提点用户签收"),GSTA_BUYER_SIGN_FAIL("自提点用户签收失败"),GTMS_STA_WAIT_CUST_CHANGE_ADDRESS("二次路由待消费者更新收件地址"),GTMS_STA_CUST_TO_DOOR("二次路由消费者已更新收件地址"),GTMS_STA_CHANGE("二次路由消费者已更新自提点地址"),GTMS_STA_CN_TO_DOOR("二次路由已更新收件地址"),GTMS_STA_CN_CHANGE("二次路由已更新自提点地址"),GTMS_STA_CNCP_TO_DOOR("二次路由物流商已更新收件地址"),GTMS_STA_CNCP_CHANGE("二次路由物流商已更新自提点地址")等 */
                @ApiField("action_code")
            private String actionCode;
    
        public String getEventDesc() {
    return this.eventDesc;
    }
    public void setEventDesc(String eventDesc) {
    this.eventDesc = eventDesc;
    }
        public String getSignedName() {
    return this.signedName;
    }
    public void setSignedName(String signedName) {
    this.signedName = signedName;
    }
        public String getStatus() {
    return this.status;
    }
    public void setStatus(String status) {
    this.status = status;
    }
        public String getAddress() {
    return this.address;
    }
    public void setAddress(String address) {
    this.address = address;
    }
        public String getEventDate() {
    return this.eventDate;
    }
    public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
    }
        public String getActionCode() {
    return this.actionCode;
    }
    public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
    }
    }