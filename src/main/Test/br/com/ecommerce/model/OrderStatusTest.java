package br.com.ecommerce.model;

import org.junit.Assert;
import org.junit.Test;

public class OrderStatusTest {

  @Test
  public void testOrderStatus() {
    String orderStatus = OrderStatus.PAID.name();
    Assert.assertEquals("PAID", orderStatus);
  }
}
