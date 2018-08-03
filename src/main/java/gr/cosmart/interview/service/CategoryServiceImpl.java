package gr.cosmart.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.cosmart.interview.dao.CategoryRepository;
import gr.cosmart.interview.domain.Category;

//@ComponentScan("gr.cosmart.interview.dao")
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository catRepos;
	
	@Override
	public void addCategory(Category category) {
		catRepos.save(category);
		
	}

	@Override
	public List<Category> getAllCategories() {
		return catRepos.findAll();
	}

	@Override
	public void deleteCategory(Category category) {
		catRepos.delete(category);
		
	}

	@Override
	public Category getCategoryById(Integer id) {
		return catRepos.findCategoryByID(id);
	}
	
	@Override
	public void updateCategory(Integer id) {
//		return catRepos.updateCategory(id);
	}

}
