package cn.fan;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("example.service")
public class ExampleServiceProperties {

    private String prefix;
    private String suffix;
    private String enabled;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}
