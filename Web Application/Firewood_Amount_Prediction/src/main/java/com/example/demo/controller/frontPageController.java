package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@CrossOrigin("*")
public class frontPageController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/")
	public String Home(Model model, Principal principal) {
		boolean isLoggedIn = principal != null;

		model.addAttribute("isLoggedIn", isLoggedIn);

		if (isLoggedIn) {
			String email = principal.getName();
			User user = userRepo.findByEmail(email);
			model.addAttribute("user", user);
		}
		return "Home";
	}

	@GetMapping("/login")
	public String Login() {

		return "CustomerLogin";
	}

	@GetMapping("/productsView")
	public String ProductsView() {
		return "ProductsView";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user, HttpSession session) {
		User existingUser = userRepo.findByEmail(user.getEmail());

		if (existingUser != null) {
			session.setAttribute("msgError", "Email address already exists. Please use a different email.");
			session.removeAttribute("msg");
			return "redirect:/login";
		} else {
			User savedUser = userService.saveUser(user);

		}
		return "redirect:/login";
	}
}
