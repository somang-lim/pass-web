package com.hope.pass.service.pass;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hope.pass.repository.pass.PassEntity;
import com.hope.pass.repository.pass.PassRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class PassService {

	private final PassRepository passRepository;


	public List<Pass> getPasses(final String userId) {
		List<PassEntity> passEntities = passRepository.findByUserId(userId);

		return PassModelMapper.INSTANCE.map(passEntities);
	}

}
