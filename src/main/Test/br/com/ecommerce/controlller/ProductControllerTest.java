package br.com.ecommerce.controlller;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.ecommerce.ProductController;
import br.com.ecommerce.model.Product;
import br.com.ecommerce.service.ProductService;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

  @InjectMocks
  private ProductController productController;

  @Mock
  private ProductService service;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void dependencyInjectionTest() {
    assertThat(this.productController).isNotNull();
  }

  @Test
  public void findAllSuccess() {
    Product entity = new Product();
    Mockito.when(service.getAllProducts()).thenReturn(Collections.singletonList(entity));
    final List<Product> founds = (List<Product>) this.productController.getProducts();
    Assert.assertEquals(entity, founds.get(0));
    Mockito.verify(service, Mockito.times(1)).getAllProducts();
  }

}