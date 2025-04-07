package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table
public class Product {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private double price;
    private String category;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-YYYY")
    private Date releaseDate;
    private boolean available;
    private int quantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] image;

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", releaseDate=" + releaseDate +
                ", available=" + available +
                ", quantity=" + quantity +
                '}';
    }


}
