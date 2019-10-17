package br.com.ecommerce.service;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.ecommerce.exception.ResourceNotFoundException;
import br.com.ecommerce.model.User;
import br.com.ecommerce.repository.UserRepository;
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
public class UserServiceTest {

  @InjectMocks
  private UserService userService;

  @Mock
  private UserRepository repository;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void dependencyInjectionTest() {
    assertThat(this.userService).isNotNull();
  }

  @Test
  public void shouldThrowExceptionWithRightMessage() {
    try {
      this.userService.findById("");
    } catch (ResourceNotFoundException e) {
      Assert.assertEquals("resource.not.found.for.identifier", e.getMessage());
    }
  }

  @Test
  public void findAllSuccess() {
    User entity = new User();
    Mockito.when(repository.findAll()).thenReturn(Collections.singletonList(entity));
    final List<User> founds = this.userService.findAll();
    Assert.assertEquals(entity, founds.get(0));
    Mockito.verify(repository, Mockito.times(1)).findAll();
  }

  @Test
  public void saveWithSuccess() {
    User entity = new User();
    Mockito.when(repository.save(Mockito.any(User.class))).thenReturn(entity);
    final User saved = this.userService.save(entity);
    Assert.assertEquals(entity, saved);
    Mockito.verify(repository, Mockito.times(1)).save(entity);
  }
}
