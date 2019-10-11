package br.com.ecommerce.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderProduct {

  private Product product;

  private Integer quantity;

  public OrderProduct() {
  }

  public OrderProduct(Product product, Integer quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  public Double getTotalPrice() {
    return getProduct().getPrice() * getQuantity();
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

}