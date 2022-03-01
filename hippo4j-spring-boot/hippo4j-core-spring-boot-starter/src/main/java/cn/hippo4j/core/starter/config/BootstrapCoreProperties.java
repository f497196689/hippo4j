package cn.hippo4j.core.starter.config;

import cn.hippo4j.core.config.BootstrapPropertiesInterface;
import cn.hippo4j.core.starter.parser.ConfigFileTypeEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * Bootstrap properties.
 *
 * @author chen.ma
 * @date 2022/2/25 00:35
 */
@Getter
@Setter
@ConfigurationProperties(prefix = BootstrapCoreProperties.PREFIX)
public class BootstrapCoreProperties implements BootstrapPropertiesInterface {

    public static final String PREFIX = "spring.dynamic.thread-pool";

    /**
     * Enabled banner.
     */
    private Boolean banner;

    /***
     * Enabled collect.
     */
    private Boolean collect;

    /**
     * Check state interval.
     */
    private String checkStateInterval;

    /**
     * Config file type.
     */
    private ConfigFileTypeEnum configFileType;

    /**
     * Nacos config.
     */
    private Map<String, String> nacos;

    /**
     * Apollo config.
     */
    private Map<String, String> apollo;

    /**
     * Notify platforms.
     */
    private List<NotifyPlatformProperties> notifyPlatforms;

    /**
     * Executors.
     */
    private List<ExecutorProperties> executors;

}