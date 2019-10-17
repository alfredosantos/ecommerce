package br.com.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class OrderProduct {

  private Product product;

  private Integer quantity;

  public Double getTotalPrice() {
    return getProduct().getPrice() * getQuantity();
  }

}