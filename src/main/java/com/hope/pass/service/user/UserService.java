package com.hope.pass.service.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hope.pass.repository.user.UserEntity;
import com.hope.pass.repository.user.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserService {

	private final UserRepository userRepository;


	public User getUser(final String userId) {
		UserEntity userEntity = userRepository.findByUserId(userId);

		return UserModelMapper.INSTANCE.toUser(userEntity);
	}


}
