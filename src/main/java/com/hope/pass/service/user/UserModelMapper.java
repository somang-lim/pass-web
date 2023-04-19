package com.hope.pass.service.user;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.hope.pass.repository.user.UserEntity;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserModelMapper {

	UserModelMapper INSTANCE = Mappers.getMapper(UserModelMapper.class);


	User toUser(UserEntity userEntity);

}
