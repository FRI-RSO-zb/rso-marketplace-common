package net.bobnar.marketplace.common.dtos.catalog.v1.sellers;

import net.bobnar.marketplace.common.dtos.ItemBase;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.Objects;

@Schema(description = "Item containing seller information", example = """
        {
            "id": 1234,
            "name": "Seller 1",
            "location": "Ljubljana",
            "contact": "info@example.com"
        }
        """)
public final class Seller implements ItemBase {
    private Integer id;
    private String name;
    private String location;
    private String contact;

    public Seller(Integer id, String name, String location, String contact) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.contact = contact;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id) && Objects.equals(name, seller.name) && Objects.equals(location, seller.location) && Objects.equals(contact, seller.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, contact);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
