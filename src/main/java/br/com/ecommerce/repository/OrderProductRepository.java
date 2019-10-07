package br.com.ecommerce.repository;

import br.com.ecommerce.model.OrderProduct;
import br.com.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {

}
