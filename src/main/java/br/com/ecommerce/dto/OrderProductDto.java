package br.com.ecommerce.dto;

import br.com.ecommerce.model.Product;

public class OrderProductDto {

  public Product product;
  public Integer quantity;

  public OrderProductDto(Product product, Integer quantity) {
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