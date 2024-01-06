package net.bobnar.marketplace.common.dtos.loaderAgent.v1.loaders;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "LoadingResult (DRAFT)", description = "(DRAFT) Result of loading operation.", deprecated = true)
public record LoadingResult(
        Boolean isSuccessful,
        String content
) {}
