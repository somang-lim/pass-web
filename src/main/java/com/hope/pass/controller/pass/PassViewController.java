package com.hope.pass.controller.pass;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hope.pass.service.pass.Pass;
import com.hope.pass.service.pass.PassService;
import com.hope.pass.service.user.User;
import com.hope.pass.service.user.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(value = "/passes")
@Controller
public class PassViewController {

	private final UserService userService;
	private final PassService passService;


	@GetMapping
	public String getPasses(String userId, ModelMap map) {
		final List<Pass> passes = passService.getPasses(userId);
		final User user = userService.getUser(userId);

		map.addAttribute("passes", passes);
		map.addAttribute("user", user);

		return "pass/index";
	}

}
