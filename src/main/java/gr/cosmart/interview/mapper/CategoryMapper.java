package gr.cosmart.interview.mapper;

import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;

import gr.cosmart.interview.domain.Category;
import gr.cosmart.interview.dto.CategoryDTO;

@Mapper(componentModel = "spring")
public abstract class CategoryMapper {

		
//		@Inject
//	    private UserRepository userRepository;

//	    @Mapping(source = "userId", target = "user")
	    public abstract CategoryDTO categoryToCategoryDTO(Category category);

//	    @Mapping(source = "userId", target = "user")
	    public abstract Category categoryDTOToCategory(CategoryDTO categoryDTO);

//	    public User userFromId(Long id) {
//	        if (id == null) {
//	            return null;
//	        }
//	        return userRepository.findOne(id);
//	    }

	}

	
