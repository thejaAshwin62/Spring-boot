package com.ecommerce.odin.model;

import com.ecommerce.odin.model.Product;
import lombok.Data;

import java.util.Date;

@Data
public class ProductDTO {
    private int id;
    private String name;
    private String description;
    private String brand;
    private int price;
    private String category;
    private Date releaseDate;
    private Boolean productAvailable;
    private int stockQuantity;


    public ProductDTO(int id, String name, String description, String brand, int price, String category, Date releaseDate, Boolean productAvailable, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.productAvailable = productAvailable;
        this.stockQuantity = stockQuantity;

    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getBrand() { return brand; }
    public int getPrice() { return price; }
    public String getCategory() { return category; }
    public Date getReleaseDate() { return releaseDate; }
    public Boolean getProductAvailable() { return productAvailable; }
    public int getStockQuantity() { return stockQuantity; }

}