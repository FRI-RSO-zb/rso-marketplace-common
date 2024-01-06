package net.bobnar.marketplace.common.controllers;

import com.kumuluz.ee.configuration.utils.ConfigurationUtil;
import net.bobnar.marketplace.common.dtos.v1.info.Info;
import net.bobnar.marketplace.common.dtos.v1.info.VersionInfo;

import java.util.Properties;

public abstract class InfoControllerBase extends ControllerBase {
    private static VersionInfo versionInfo;

    protected Info getServiceInfo() {
        ConfigurationUtil config = ConfigurationUtil.getInstance();

        return new Info(
                config.get("kumuluzee.name").isPresent() ? config.get("kumuluzee.name").get() : "<unknown name>",
                config.get("kumuluzee.env.name").isPresent() ? config.get("kumuluzee.env.name").get() : "<unknown environment>",
                config.get("kumuluzee.version").isPresent() ? config.get("kumuluzee.version").get() : "<unknown version>");
    }

    protected VersionInfo getVersionInfo() {
        if (versionInfo == null) {
            initializeVersionInfo();
        }

        return versionInfo;
    }

    private void initializeVersionInfo() {
        Properties prop = this.getProperties();
        String version = prop.getProperty("service.version");

        versionInfo = new VersionInfo(
                version,
                version.split("\\.")[0],
                version.split("\\.")[1],
                version.split("\\.")[2].split("-")[0],
                prop.getProperty("git.branch"),
                prop.getProperty("git.commit.id"),
                prop.getProperty("git.commit.id.abbrev"),
                "true".equals(prop.getProperty("git.dirty")),
                prop.getProperty("git.build.time"));
    }

    protected Properties loadResourceProperties(Class<? extends InfoControllerBase> packageClass, String resourcePath) {
        Properties prop = new Properties();
        try {
            prop.load(packageClass.getResourceAsStream("/META-INF/service.properties"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return prop;
    }

    protected abstract Properties getProperties();
}
