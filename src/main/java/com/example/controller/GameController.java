package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.Calendar;

@Controller
@SpringBootApplication
public class GameController {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(GameController.class, args);

	}

	@GetMapping("/ssp/")
	public ModelAndView showGame() {
		System.out.println("HÄNDER DET NÅGOT");
		return new ModelAndView("/ssp");
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/newuser")
	public String newUser() {
		return "newuser";
	}

	@PostMapping("/newuser")
	public ModelAndView submit(HttpSession session, @RequestParam String username, @RequestParam String password) {
		System.out.println(username+" "+password);
			return new ModelAndView("/login");
	}

}
