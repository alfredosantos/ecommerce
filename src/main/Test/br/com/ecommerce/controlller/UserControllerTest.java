package br.com.ecommerce.controlller;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.ecommerce.UserController;
import br.com.ecommerce.exception.ResourceNotFoundException;
import br.com.ecommerce.model.User;
import br.com.ecommerce.service.UserService;
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
public class UserControllerTest {

  @InjectMocks
  private UserController userController;

  @Mock
  private UserService service;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void dependencyInjectionTest() {
    assertThat(this.userController).isNotNull();
  }

  @Test(expected = ResourceNotFoundException.class)
  public void throwResourceNotFoundException() throws Exception {
    this.userController.findById("");
  }

  @Test
  public void findAllSuccess() {
    User entity = new User();
    Mockito.when(service.findAll()).thenReturn(Collections.singletonList(entity));
    final List<User> founds = this.userController.findAll();
    Assert.assertEquals(entity, founds.get(0));
    Mockito.verify(service, Mockito.times(1)).findAll();
  }

  @Test
  public void saveWithSuccess() {
    User entity = new User();
    Mockito.when(service.save(Mockito.any(User.class))).thenReturn(entity);
    final User saved = this.userController.save(entity);
    Assert.assertEquals(entity, saved);
    Mockito.verify(service, Mockito.times(1)).save(entity);
  }
}
