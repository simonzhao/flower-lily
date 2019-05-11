package cn.messycode.flower.lily.api.dto;

import lombok.Data;

/**
 * @author simon
 */
@Data
public final class ResponseDTO<T> {
    private Integer code;

    private T data;

    private Integer cost;
}
