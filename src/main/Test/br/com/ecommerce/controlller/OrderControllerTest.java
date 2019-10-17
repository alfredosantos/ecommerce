package br.com.ecommerce.controlller;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.ecommerce.OrderController;
import br.com.ecommerce.model.Order;
import br.com.ecommerce.service.OrderService;
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
public class OrderControllerTest {

  @InjectMocks
  private OrderController orderController;

  @Mock
  private OrderService service;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void dependencyInjectionTest() {
    assertThat(this.orderController).isNotNull();
  }

  @Test
  public void findAllSuccess() {
    Order entity = new Order();
    Mockito.when(service.getAllOrders()).thenReturn(Collections.singletonList(entity));
    final List<Order> founds = (List<Order>) this.orderController.list();
    Assert.assertEquals(entity, founds.get(0));
    Mockito.verify(service, Mockito.times(1)).getAllOrders();
  }
}