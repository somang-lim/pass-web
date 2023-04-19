package com.hope.pass.service.pass;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.hope.pass.repository.pass.PassEntity;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PassModelMapper {

	PassModelMapper INSTANCE = Mappers.getMapper(PassModelMapper.class);

	@Mapping(target = "packageName", source = "packageEntity.packageName")
	Pass map(PassEntity passEntity);

	List<Pass> map(List<PassEntity> passEntities);

}
