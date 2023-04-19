package com.hope.pass.repository.pass;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface PassRepository extends JpaRepository<PassEntity, Integer> {

	@Query(value = "select p from PassEntity p " +
			"	join fetch p.packageEntity " +
			"		 where p.userId = :userId " +
			"	  order by p.endedAt desc nulls first"
	)
	List<PassEntity> findByUserId(String userId);

}
