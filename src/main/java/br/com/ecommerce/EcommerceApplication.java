package br.com.ecommerce;

import br.com.ecommerce.model.Product;
import br.com.ecommerce.repository.UserRepository;
import br.com.ecommerce.service.ProductService;
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
      productService.save(new Product("1", "TV Set", 300.00, "http://placehold.it/200x100"));
      productService.save(new Product("2", "Game Console", 200.00, "http://placehold.it/200x100"));
      productService.save(new Product("3", "Sofa", 100.00, "http://placehold.it/200x100"));
      productService.save(new Product("4", "Icecream", 5.00, "http://placehold.it/200x100"));
      productService.save(new Product("5", "Beer", 3.00, "http://placehold.it/200x100"));
      productService.save(new Product("6", "Phone", 500.00, "http://placehold.it/200x100"));
      productService.save(new Product("7", "Watch", 30.00, "http://placehold.it/200x100"));
    };
  }
}