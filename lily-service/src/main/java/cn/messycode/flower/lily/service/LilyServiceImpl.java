package cn.messycode.flower.lily.service;

import cn.messycode.flower.lily.api.LilyService;
import cn.messycode.flower.lily.api.dto.ResponseDTO;
import cn.messycode.flower.lily.api.param.LilyServiceCheckInParam;
import cn.messycode.flower.lily.api.param.LilyServiceCheckOutParam;
import cn.messycode.tree.locust.annotation.LocustProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Lilyservice 功能实现
 * @author simon
 */
@LocustProvider(serviceInterface = LilyService.class)
@Slf4j
public class LilyServiceImpl implements LilyService {
    @Override
    public ResponseDTO checkIn(LilyServiceCheckInParam param) {
        return null;
    }

    @Override
    public ResponseDTO checkOut(LilyServiceCheckOutParam param) {
        return null;
    }

    @Override
    public ResponseDTO getServiceList(LilyServiceCheckOutParam param) {
        ResponseDTO dto = new ResponseDTO();
        dto.setCode(0);
        return dto;
    }
}
