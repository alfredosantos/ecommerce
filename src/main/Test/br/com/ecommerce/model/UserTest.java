package br.com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class UserTest {

  private User user = new User();

  @Test
  public void testUser() {
    user.setId("1");
    user.setFullName("fullName");
    user.setEmail("email");
    user.setPassword("password");
    final LocalDateTime now = LocalDateTime.now();
    user.setCreatedAt(now);

    Assert.assertEquals("1", user.getId());
    Assert.assertEquals("fullName", user.getFullName());
    Assert.assertEquals("email", user.getEmail());
    Assert.assertEquals("password", user.getPassword());
    Assert.assertEquals(user.getCreatedAt(), now);
    final ArrayList<SimpleGrantedAuthority> arrayList = new ArrayList<>();
    arrayList.add(new SimpleGrantedAuthority("ADMIN"));
    Assert.assertEquals(arrayList, user.getAuthorities());
    Assert.assertEquals("email", user.getUsername());
    Assert.assertTrue(user.isAccountNonExpired());
    Assert.assertTrue(user.isAccountNonLocked());
    Assert.assertTrue(user.isCredentialsNonExpired());
    Assert.assertTrue(user.isEnabled());
  }

}
