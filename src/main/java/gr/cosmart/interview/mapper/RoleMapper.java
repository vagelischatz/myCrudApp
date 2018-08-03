package gr.cosmart.interview.mapper;

import org.mapstruct.Mapper;

import gr.cosmart.interview.domain.Role;
import gr.cosmart.interview.dto.RoleDTO;

@Mapper(componentModel = "spring")
public abstract class  RoleMapper {

	
	public abstract RoleDTO roleToRoleDTO(Role role);

//    @Mapping(source = "userId", target = "user")
	public abstract Role    roleDTOToRole(RoleDTO roleDTO);
    
}
