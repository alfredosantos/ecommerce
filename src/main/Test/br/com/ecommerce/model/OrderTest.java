package br.com.ecommerce.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class OrderTest {

  private Order order = new Order();

  @Test
  public void testOrder() {
    List myList = new ArrayList();
    order.setId("1");
    order.setStatus("status");
    order.setOrderProducts(myList);
    order.setUserId("userId");
    final Date dateCreated = new Date();
    order.setDateCreated(dateCreated);

    Assert.assertEquals("1", order.getId());
    Assert.assertEquals("status", order.getStatus());
    Assert.assertEquals(myList, order.getOrderProducts());
    Assert.assertEquals("userId", order.getUserId());
    Assert.assertEquals(dateCreated, order.getDateCreated());
    Assert.assertNotNull(order.getNumberOfProducts());
    Assert.assertNotNull(order.getTotalOrderPrice());
  }
}
