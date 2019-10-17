package br.com.ecommerce.model;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Order {

  @Id
  private String id;

  private Date dateCreated;

  private String status;

  private List<OrderProduct> orderProducts;

  private String userId;

  public Double getTotalOrderPrice() {
    double sum = 0D;
    List<OrderProduct> orderProducts = getOrderProducts();
    for (OrderProduct op : orderProducts) {
      sum += op.getTotalPrice();
    }

    return sum;
  }

  public int getNumberOfProducts() {
    return this.orderProducts.size();
  }

}