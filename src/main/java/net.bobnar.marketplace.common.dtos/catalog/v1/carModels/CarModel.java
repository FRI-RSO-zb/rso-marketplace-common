package net.bobnar.marketplace.common.dtos.catalog.v1.carModels;

import net.bobnar.marketplace.common.dtos.ItemBase;

import java.util.Objects;

public final class CarModel implements ItemBase {
    private Integer id;
    private String name;
    private Integer brandId;
    private String primaryIdentifier;
    private String identifiers;

    public CarModel(Integer id, String name, Integer brandId, String primaryIdentifier, String identifiers) {
        this.id = id;
        this.name = name;
        this.brandId = brandId;
        this.primaryIdentifier = primaryIdentifier;
        this.identifiers = identifiers;
    }

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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    public void setPrimaryIdentifier(String primaryIdentifier) {
        this.primaryIdentifier = primaryIdentifier;
    }

    public String getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return Objects.equals(id, carModel.id) && Objects.equals(name, carModel.name) && Objects.equals(brandId, carModel.brandId) && Objects.equals(primaryIdentifier, carModel.primaryIdentifier) && Objects.equals(identifiers, carModel.identifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brandId, primaryIdentifier, identifiers);
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brandId=" + brandId +
                ", primaryIdentifier='" + primaryIdentifier + '\'' +
                ", identifiers='" + identifiers + '\'' +
                '}';
    }
}
