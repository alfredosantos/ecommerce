package br.com.ecommerce;

import br.com.ecommerce.exception.ResourceNotFoundException;
import br.com.ecommerce.model.User;
import br.com.ecommerce.service.UserService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends User {

  @Autowired
  private UserService service;

  @GetMapping("/{id}")
  public User findById(@PathVariable String id) throws ResourceNotFoundException {
    Optional<User> optionalResponse = service.findById(id);
    return optionalResponse.orElseThrow(ResourceNotFoundException::new);
  }

  @GetMapping("/")
  public List<User> findAll() {
    return service.findAll();
  }

  @PostMapping("/save")
  public User save(@Valid @RequestBody User user) {
    return service.save(user);
  }
}