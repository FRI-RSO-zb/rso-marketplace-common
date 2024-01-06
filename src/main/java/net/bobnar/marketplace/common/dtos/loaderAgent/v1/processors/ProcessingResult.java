package net.bobnar.marketplace.common.dtos.loaderAgent.v1.processors;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "ProcessingResult (DRAFT)", description = "(DRAFT) Result of processing operation.", deprecated = true)
public record ProcessingResult(
        Boolean isSuccessful,
        String errors,
        Object result
) {}
