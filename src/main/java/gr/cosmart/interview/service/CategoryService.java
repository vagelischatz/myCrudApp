package gr.cosmart.interview.service;

import java.util.List;

import gr.cosmart.interview.domain.Category;

public interface CategoryService {

	List<Category> getAllCategories();

	void addCategory(Category category);

	void deleteCategory(Category category);

	Category getCategoryById(Integer categoryID);

	void updateCategory(Integer categoryID);

}
