package net.bobnar.marketplace.common.dtos.catalog.v1.ads;

import net.bobnar.marketplace.common.dtos.ItemBase;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

@Schema(description = "Item containing the information about the ad.", example = """
        {
            "id": 1234,
            "title": "Volkswagen Passat 2.0 TDI 159900 km-BIXEN-LED-NAVI-TEMP-ALU 16 COL",
            "source": "avtonet",
            "sourceId": "19130301",
            "originalUri": "https://www.avto.net/Ads/details.asp?id=19130301&display=Volkswagen%20Passat",
            "sellerId": 1234,
            "modelId": 2
        }
        """)
public final class Ad implements Serializable, ItemBase {
    private Integer id;
    private String title;
    private String source;
    private String sourceId;
    private String originalUri;
    private String photoUri;
    private Integer sellerId;
    private Integer modelId;
    private String otherData;


    private Ad() {}

    public Ad(Integer id, String title, String source, String sourceId, String originalUri, String photoUri, Integer sellerId, Integer modelId, String otherData) {
        this.id = id;
        this.title = title;
        this.source = source;
        this.sourceId = sourceId;
        this.originalUri = originalUri;
        this.photoUri = photoUri;
        this.sellerId = sellerId;
        this.modelId = modelId;
        this.otherData = otherData;
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

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getOriginalUri() {
        return originalUri;
    }

    public void setOriginalUri(String originalUri) {
        this.originalUri = originalUri;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public void setPhotoUri(String photoUri) {
        this.photoUri = photoUri;
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

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }
}
