package gr.cosmart.interview.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.cosmart.interview.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	 Category findCategoryByID(Integer categoryId);
}
