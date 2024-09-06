package in.kishan.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kishan.core.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
