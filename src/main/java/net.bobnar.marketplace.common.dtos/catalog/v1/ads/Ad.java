package net.bobnar.marketplace.common.dtos.catalog.v1.ads;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;
import java.util.Objects;

@Schema(description = "Item containing the information about the ad.", example = """
        {
            "id": 1234,
            "title": "Ad 1",
            "source": "internal"
        }
        """)
public final class Ad implements Serializable {
    private final Integer id;
    private final String title;
    private final String source;
    private final Integer sellerId;

    public Ad(
            Integer id,
            String title,
            String source,
            Integer sellerId) {
        this.id = id;
        this.title = title;
        this.source = source;
        this.sellerId = sellerId;
    }

    public Integer id() {
        return id;
    }

    public String title() {
        return title;
    }

    public String source() {
        return source;
    }

    public Integer sellerId() {
        return sellerId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSource() {
        return source;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Ad) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.title, that.title) &&
                Objects.equals(this.source, that.source) &&
                Objects.equals(this.sellerId, that.sellerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, source, sellerId);
    }

    @Override
    public String toString() {
        return "Ad[" +
                "id=" + id + ", " +
                "title=" + title + ", " +
                "source=" + source + ", " +
                "sellerId=" + sellerId + ']';
    }
}
