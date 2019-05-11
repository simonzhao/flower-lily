package cn.messycode.flower.lily.api.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询服务列表
 * @author simon
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public final class LilyServiceGetServiceListParam {
    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 版本号
     */
    private String serviceVersion;
}
