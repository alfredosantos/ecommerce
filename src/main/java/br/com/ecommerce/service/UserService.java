package br.com.ecommerce.service;

import br.com.ecommerce.model.User;
import br.com.ecommerce.repository.UserRepository;
import br.com.ecommerce.service.interfaces.ServiceInterface;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements ServiceInterface<User> {

  private UserRepository userRepository;

  @Override
  public Optional<User> findById(String userId) {
    return userRepository.findById(userId);
  }

  @Override
  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User save(User user) {
    return userRepository.save(user);
  }

  public User findByUserName(String userName) {
    return userRepository.findByEmail(userName);
  }
}