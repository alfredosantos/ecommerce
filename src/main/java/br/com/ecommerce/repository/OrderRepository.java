package br.com.ecommerce.repository;

import br.com.ecommerce.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Long> {

}