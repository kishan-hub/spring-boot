package in.kishan.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kishan.core.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
