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
*  global.mediacenter.video.channel.transfer
*/
public class GlobalMediacenterVideoChannelTransferRequest extends BaseGopRequest<GlobalMediacenterVideoChannelTransferResponse> {

    /** 目标渠道。可选项：AE_GLOBAL,ARISE_ES */
    private String channel;
    /** 媒体中心视频id。用于管理媒体中心的视频文件 */
    private Long id;

    public String getChannel(){
        return this.channel;
    }
    public void setChannel(String channel){
        this.channel = channel;
        }
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
        }

    @Override
    public String getApiName() {
        return "global.mediacenter.video.channel.transfer";
    }
    @Override
    public IopHashMap getApiParams() {
                    if (channel != null) {
                        super.addApiParameter("channel", channel.toString());
                    }
                            if (id != null) {
                        super.addApiParameter("id", id.toString());
                    }
                    return super.getApiParams();
    }
    @Override
    public Map<String, FileItem> getFileParams() {
                                    return super.getFileParams();
    }

    @Override
    public Class<GlobalMediacenterVideoChannelTransferResponse> getResponseClass() {
        return GlobalMediacenterVideoChannelTransferResponse.class;
    }

    @Override
    public String getHttpMethod() {
        return "POST";
    }
}