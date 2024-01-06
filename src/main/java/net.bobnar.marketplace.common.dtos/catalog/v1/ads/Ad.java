package net.bobnar.marketplace.common.dtos.catalog.v1.ads;

import net.bobnar.marketplace.common.dtos.ItemBase;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

@Schema(description = "Item containing the information about the ad.", example = """
        {
            "id": 1234,
            "title": "Ad 1",
            "source": "internal"
        }
        """)
public final class Ad implements Serializable, ItemBase {
    private Integer id;
    private String title;
    private String source;
    private Integer sellerId;
    private Integer modelId;

    public Ad(Integer id, String title, String source, Integer sellerId, Integer modelId) {
        this.id = id;
        this.title = title;
        this.source = source;
        this.sellerId = sellerId;
        this.modelId = modelId;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }
}
