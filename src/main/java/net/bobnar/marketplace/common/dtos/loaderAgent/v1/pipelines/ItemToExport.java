package net.bobnar.marketplace.common.dtos.loaderAgent.v1.pipelines;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.Dictionary;

@Schema(name = "ItemToExport (DRAFT)")
public record ItemToExport(
        String source,
        String originalUri,
        String photoUri,
        String title,
        String description,
        String price,
        String location,
        String seller,
        Dictionary<String, String> info
) {}
