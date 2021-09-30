package pl.piomin.samples.quarkus.serverless.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private Long id;
    private String name;
    private int availableItems;
    private int reservedItems;

    public Product() {
    }

    public Product(Long id, String name, int availableItems, int reservedItems) {
        this.id = id;
        this.name = name;
        this.availableItems = availableItems;
        this.reservedItems = reservedItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(int availableItems) {
        this.availableItems = availableItems;
    }

    public int getReservedItems() {
        return reservedItems;
    }

    public void setReservedItems(int reservedItems) {
        this.reservedItems = reservedItems;
    }
}
