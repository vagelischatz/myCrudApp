package gr.cosmart.interview.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import gr.cosmart.interview.domain.User;
import gr.cosmart.interview.dto.UserDTO;



@Mapper(componentModel = "spring")
public abstract class UserMapper {

	public abstract UserDTO userToUserDTO(User user);
	
	@Mapping(source ="userid", target="User")
	public abstract <List>UserDTO userToListUserDTO(Integer userid);

	// @Mapping(source = "userId", target = "user")
	public abstract User userDTOToUser(UserDTO userDTO);

}
