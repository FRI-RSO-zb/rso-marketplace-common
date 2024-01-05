package net.bobnar.marketplace.common.controllers;

import net.bobnar.marketplace.common.dtos.v1.info.Info;
import net.bobnar.marketplace.common.dtos.v1.info.VersionInfo;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Properties;


public abstract class InfoControllerBase {

//    @Inject
//    private ServiceConfig serviceConfig;

    private static VersionInfo versionInfo;
//
//    @GET
////    @PermitAll
//    @Operation(
//            summary = "Get information about this service",
//            description = "Returns the general information about the running instance"
//    )
//    @APIResponses({
//            @APIResponse(
//                    responseCode = "200",
//                    content = @Content(schema = @Schema(implementation = Info.class))
//            ),
//            @APIResponse(
//                    responseCode = "503",
//                    description = "Server error. Possibly malformed service version information."
//            )
//    })
//    public Response getInfo() {
////        ConfigurationUtil config = ConfigurationUtil.getInstance();
//
////        Info info = new Info(
////                config.get("kumuluzee.name").get(),
////                config.get("kumuluzee.env.name").get(),
////                config.get("kumuluzee.version").get());
////        InfoDto info = new InfoDto();
////        info.name = config.get("kumuluzee.name").get();
////        info.environment = config.get("kumuluzee.env.name").get();
////        info.version = config.get("kumuluzee.version").get();
//
//        return Response.ok(/*info*/)
//                .build();
//    }
//
//    @GET
//    @Path("version")
////    @PermitAll
//    @Operation(
//            summary = "Get the version of this instance",
//            description = "Returns the detailed version information of the running instance."
//    )
//    @APIResponses({
//            @APIResponse(
//                    responseCode = "200",
//                    content = @Content(schema = @Schema(implementation = VersionInfo.class))
//            ),
//            @APIResponse(
//                    responseCode = "503",
//                    description = "Server error. Possibly malformed service version information."
//            )
//    })
//    public Response getVersion() {
//        if (versionInfo == null) {
//            initializeVersionInfo();
//        }
//
//        return Response.ok(versionInfo)
//                .build();
//    }
//
//    @POST
//    @Path("debug/break")
//    @Operation(
//            summary = "Set the state of this service instance as broken",
//            description = "Set the state of this service instance as broken. Used to debug if the cluster will heal itself.",
//            hidden = true
//    )
//    public Response debugBreakInstance() {
////        serviceConfig.disable();
//
//        return Response.ok()
//                .build();
//    }

    protected abstract Properties getProperties();

    protected Properties loadResourceProperties(Class<? extends InfoControllerBase> packageClass, String resourcePath) {
        Properties prop = new Properties();
        try {
            prop.load(packageClass.getResourceAsStream("/META-INF/service.properties"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return prop;
    }

    private void initializeVersionInfo() {
        Properties prop = this.getProperties();
        String version = prop.getProperty("service.version");

        InfoControllerBase.versionInfo = new VersionInfo(
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
}
