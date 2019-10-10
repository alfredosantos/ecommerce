package br.com.ecommerce;

import br.com.ecommerce.model.Product;
import br.com.ecommerce.model.User;
import br.com.ecommerce.repository.UserRepository;
import br.com.ecommerce.service.ProductService;
import br.com.ecommerce.service.UserService;
import java.time.LocalDateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

  public static void main(String[] args) {
    SpringApplication.run(EcommerceApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(ProductService productService, UserRepository userRepository) {
    return args -> {
      productService.save(new Product(1L, "TV Set", 300.00, "http://placehold.it/200x100"));
      productService.save(new Product(2L, "Game Console", 200.00, "http://placehold.it/200x100"));
      productService.save(new Product(3L, "Sofa", 100.00, "http://placehold.it/200x100"));
      productService.save(new Product(4L, "Icecream", 5.00, "http://placehold.it/200x100"));
      productService.save(new Product(5L, "Beer", 3.00, "http://placehold.it/200x100"));
      productService.save(new Product(6L, "Phone", 500.00, "http://placehold.it/200x100"));
      productService.save(new Product(7L, "Watch", 30.00, "http://placehold.it/200x100"));
    };
  }
}