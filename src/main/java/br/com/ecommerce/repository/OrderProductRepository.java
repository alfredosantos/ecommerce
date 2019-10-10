package br.com.ecommerce.repository;

import br.com.ecommerce.model.Order;
import br.com.ecommerce.model.OrderProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderProductRepository extends MongoRepository<OrderProduct, Order> {

}
