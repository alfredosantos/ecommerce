package br.com.ecommerce.model;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

  private Product product = new Product();

  @Test
  public void testProduct() {
    product.setId("1");
    product.setName("name");
    product.setPrice(1D);
    product.setPictureUrl("pictureUrl");

    Assert.assertEquals("1", product.getId());
    Assert.assertEquals("name", product.getName());
    Assert.assertEquals(java.util.Optional.of(1D), java.util.Optional.of(product.getPrice()));
    Assert.assertEquals("pictureUrl", product.getPictureUrl());

  }
}
