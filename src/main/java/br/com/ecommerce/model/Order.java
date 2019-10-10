package br.com.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@JsonDeserialize
public class Order {

  @Id
  private String id;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dateCreated;

  private String status;

  @Valid
  private List<OrderProduct> orderProducts = new ArrayList<>();

  public Double getTotalOrderPrice() {
    double sum = 0D;
    List<OrderProduct> orderProducts = getOrderProducts();
    for (OrderProduct op : orderProducts) {
      sum += op.getTotalPrice();
    }

    return sum;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDate getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<OrderProduct> getOrderProducts() {
    return orderProducts;
  }

  public void setOrderProducts(List<OrderProduct> orderProducts) {
    this.orderProducts = orderProducts;
  }

  public int getNumberOfProducts() {
    return this.orderProducts.size();
  }
}