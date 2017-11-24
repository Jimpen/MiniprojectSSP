package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.*;


@SpringBootApplication
@Controller
public class GameController {
	@Autowired
	private ScoreRepository scoreRepository;

	//private ScoreRepository scoreRepository = new ScoreRepository();

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(GameController.class, args);

	}

	//TODO ta bort denhär???
	@GetMapping("/ssp")
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
		String answer = scoreRepository.addMember(username,password);
		if(answer.equals("")){
			return new ModelAndView("/login");
		}
		else{
			System.out.println("Hans was here");
			return new ModelAndView("/newuser").addObject("registrationError",answer);
		}
	}

	@PostMapping("/login")
	public ModelAndView login(HttpSession session, @RequestParam String username, @RequestParam String password){
		System.out.println(username+" "+password);
		String answer = scoreRepository.validateLogin(username, password);
		if(answer.equals(username)){
			return new ModelAndView("/ssp").addObject("username",username);
		}
		else return new ModelAndView("/login").addObject("loginError",answer);

	}

	@GetMapping("/win")
	@ResponseBody
	public void addWin(){
		System.out.println("Hans was here");
		scoreRepository.addWin();
	}




}
