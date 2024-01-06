package net.bobnar.marketplace.common.dtos.catalog.v1.sellers;

import net.bobnar.marketplace.common.dtos.ItemBase;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "Item containing seller information", example = """
        {
            "id": 1234,
            "name": "RECAR d.o.o.",
            "location": "Tovarniška ulica 7, Celje",
            "contact": "http://www.recar.si",
            "source": "avtonet",
            "sourceId": "12621"
        }
        """)
public final class Seller implements ItemBase {
    private Integer id;
    private String name;
    private String location;
    private String contact;
    private String source;
    private String sourceId;

    private Seller() {}

    public Seller(Integer id, String name, String location, String contact, String source, String sourceId) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.contact = contact;
        this.source = source;
        this.sourceId = sourceId;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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
}
