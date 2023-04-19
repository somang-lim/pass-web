package com.hope.pass.service.pass;

import java.time.LocalDateTime;

import com.hope.pass.repository.pass.PassStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pass {

	private Integer passSeq;
	private Integer packageSeq;
	private String packageName;
	private String userId;

	private PassStatus status;
	private Integer remainingCount;

	private LocalDateTime startedAt;
	private LocalDateTime endedAt;
	private LocalDateTime expiredAt;

}
