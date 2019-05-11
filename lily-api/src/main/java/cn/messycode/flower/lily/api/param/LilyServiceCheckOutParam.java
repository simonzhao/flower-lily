package cn.messycode.flower.lily.api.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 向Lily下线服务时的提交参数
 *
 * @author simon
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public final class LilyServiceCheckOutParam {
    /**
     * IP 地址
     */
    private String ipAddr;

    /**
     * 端口号
     */
    private Integer port;

    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 版本号
     */
    private String serviceVersion;
}
