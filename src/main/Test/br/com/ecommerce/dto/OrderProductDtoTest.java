package br.com.ecommerce.dto;

import br.com.ecommerce.model.Product;
import org.junit.Assert;
import org.junit.Test;

public class OrderProductDtoTest {

  private OrderProductDto orderProductDto = new OrderProductDto();

  @Test
  public void testOrderProduct() {
    Product product = new Product();
    product.setPrice(1D);
    orderProductDto.setProduct(product);
    orderProductDto.setQuantity(1);

    Assert.assertEquals(product, orderProductDto.getProduct());
    Assert
        .assertEquals(java.util.Optional.of(1),
            java.util.Optional.of(orderProductDto.getQuantity()));
  }
}
