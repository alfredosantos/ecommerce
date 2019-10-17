package br.com.ecommerce.service.interfaces;

import br.com.ecommerce.model.User;
import java.util.List;
import java.util.Optional;

public interface ServiceInterface<T> {

  Optional<User> findById(String userId);

  List<User> findAll();

  User findByUserName(String userName);
}