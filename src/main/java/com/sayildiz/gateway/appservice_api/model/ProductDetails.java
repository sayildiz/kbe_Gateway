package com.sayildiz.gateway.appservice_api.model;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class ProductDetails {
    @NotNull
    private UUID uuid;

    @NotNull
    private BigDecimal price;

    @NotNull
    private BigDecimal vat;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private String location;
    @NotNull
    private int amount;
    @NotNull
    private int deliveryTime;

    public ProductDetails() {
    }

    public ProductDetails(UUID uuid, BigDecimal price, BigDecimal vat, String name, String description, String location, int amount, int deliveryTime) {
        this.uuid = uuid;
        this.price = price;
        this.vat = vat;
        this.name = name;
        this.description = description;
        this.location = location;
        this.amount = amount;
        this.deliveryTime = deliveryTime;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDetails that = (ProductDetails) o;
        return amount == that.amount && deliveryTime == that.deliveryTime && Objects.equals(uuid, that.uuid) && Objects.equals(price, that.price) && Objects.equals(vat, that.vat) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, price, vat, name, description, location, amount, deliveryTime);
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "uuid=" + uuid +
                ", price=" + price +
                ", vat=" + vat +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", amount=" + amount +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
