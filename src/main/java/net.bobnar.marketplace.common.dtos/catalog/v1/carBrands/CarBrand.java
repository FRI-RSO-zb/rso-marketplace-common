package net.bobnar.marketplace.common.dtos.catalog.v1.carBrands;

import net.bobnar.marketplace.common.dtos.ItemBase;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;
import java.util.Objects;

@Schema(description = "Item containing the information about the car brand.", example = """
        {
            "id": 12,
            "name": "Seat",
            "primaryIdentifier": "seat"
            "identifiers": "seat"
        }
        """)
public final class CarBrand implements Serializable, ItemBase {
    private Integer id;
    private String name;
    private String primaryIdentifier;
    private String identifiers;
    private Long modelsCount;

    private CarBrand() {}

    public CarBrand(
            Integer id,
            String name,
            String primaryIdentifier,
            String identifiers,
            Long modelsCount) {
        this.id = id;
        this.name = name;
        this.primaryIdentifier = primaryIdentifier;
        this.identifiers = identifiers;
        this.modelsCount = modelsCount;
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

    public String getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    public void setPrimaryIdentifier(String primaryIdentifier) {
        this.primaryIdentifier = primaryIdentifier.toLowerCase();
    }

    public String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(String identifiers) {
        this.identifiers = identifiers.toLowerCase();
    }

    public Long getModelsCount() {
        return modelsCount;
    }

    public void setModelsCount(Long modelsCount) {
        this.modelsCount = modelsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBrand carBrand = (CarBrand) o;
        return Objects.equals(id, carBrand.id) && Objects.equals(name, carBrand.name) && Objects.equals(primaryIdentifier, carBrand.primaryIdentifier) && Objects.equals(identifiers, carBrand.identifiers) && Objects.equals(modelsCount, carBrand.modelsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, primaryIdentifier, identifiers, modelsCount);
    }

    @Override
    public String toString() {
        return "CarBrand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", primaryIdentifier='" + primaryIdentifier + '\'' +
                ", identifiers='" + identifiers + '\'' +
                ", modelsCount=" + modelsCount +
                '}';
    }
}
