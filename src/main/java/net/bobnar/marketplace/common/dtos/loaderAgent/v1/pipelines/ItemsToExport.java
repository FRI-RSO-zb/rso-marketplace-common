package net.bobnar.marketplace.common.dtos.loaderAgent.v1.pipelines;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.List;

@Schema
public record ItemsToExport(
        List<ItemToExport> items
) {
}
