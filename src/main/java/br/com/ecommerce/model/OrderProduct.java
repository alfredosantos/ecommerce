package br.com.ecommerce.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderProduct {

  private Order order;

  private Product product;

  private Integer quantity;

  public OrderProduct() {
    super();
  }

  public OrderProduct(Order order, Product product, Integer quantity) {
  }

  public Double getTotalPrice() {
    return getProduct().getPrice() * getQuantity();
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
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