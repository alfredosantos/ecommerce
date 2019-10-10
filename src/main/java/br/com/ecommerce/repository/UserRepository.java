package br.com.ecommerce.repository;

import br.com.ecommerce.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

  User findByEmail(String email);

  Optional<User> findById(Long id);

}