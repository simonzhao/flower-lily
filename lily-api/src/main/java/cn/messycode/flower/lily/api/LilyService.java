package cn.messycode.flower.lily.api;

import cn.messycode.flower.lily.api.dto.ResponseDTO;
import cn.messycode.flower.lily.api.param.LilyServiceCheckInParam;
import cn.messycode.flower.lily.api.param.LilyServiceCheckOutParam;

/**
 * Lily 系统对外提供的服务定义
 *
 * @author simon
 */
public interface LilyService {
    /**
     * 注册应用
     * @param param
     * @return
     */
    ResponseDTO checkIn(LilyServiceCheckInParam param);

    /**
     * 取消注册
     * @return
     */
    ResponseDTO checkOut(LilyServiceCheckOutParam param);

    /**
     * 请求获取服务列表
     *
     * @param param
     * @return
     */
    ResponseDTO getServiceList(LilyServiceCheckOutParam param);

    ResponseDTO getId();
}
