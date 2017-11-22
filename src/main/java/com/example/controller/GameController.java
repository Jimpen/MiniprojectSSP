package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.*;
import java.util.Calendar;

@SpringBootApplication
public class GameController {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(GameController.class, args);

	}

	@GetMapping("/ssp/")
	public ModelAndView listBlogs() {
		return new ModelAndView("ssp");

	}
}
