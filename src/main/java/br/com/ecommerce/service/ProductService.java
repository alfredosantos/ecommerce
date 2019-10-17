package br.com.ecommerce.service;

import br.com.ecommerce.model.Product;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ProductService {

  @NotNull Iterable<Product> getAllProducts();

  Product getProduct(String id);

  Product save(Product product);
}