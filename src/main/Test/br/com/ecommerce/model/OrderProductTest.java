package br.com.ecommerce.model;

import org.junit.Assert;
import org.junit.Test;

public class OrderProductTest {

  private OrderProduct orderProduct = new OrderProduct();

  @Test
  public void testOrderProduct() {
    Product product = new Product();
    product.setPrice(1D);
    orderProduct.setProduct(product);
    orderProduct.setQuantity(1);

    Assert.assertEquals(product, orderProduct.getProduct());
    Assert
        .assertEquals(java.util.Optional.of(1), java.util.Optional.of(orderProduct.getQuantity()));
    Assert.assertEquals(java.util.Optional.of(1.0),
        java.util.Optional.of(orderProduct.getTotalPrice()));

  }
}
