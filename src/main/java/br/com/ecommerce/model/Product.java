package br.com.ecommerce.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@JsonDeserialize
public class Product {

  @Id
  private Long id;

  private String name;

  private Double price;

  private String pictureUrl;

  public Product(Long id, @NotNull(message = "Product name is required.") String name,
      Double price,
      String pictureUrl) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.pictureUrl = pictureUrl;
  }

  public Product() {
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

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getPictureUrl() {
    return pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }
}
