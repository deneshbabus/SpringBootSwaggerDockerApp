package com.concord.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.concord.dto.InputRequest;
import com.concord.dto.ResultResponse;
import com.concord.service.UserService;
import com.concord.util.HelperClass;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	
	
	@RequestMapping(value = "/vowels", method = RequestMethod.POST)
	public ResponseEntity<ResultResponse> findVowelsByPost(@RequestBody(required= false) InputRequest RequestInput) throws Exception {
		
		ResultResponse resultResponse = new ResultResponse();
		long totalNoOfVowels = userService.totalNoOfVowels(RequestInput.getNos());
		
		resultResponse.setAns(totalNoOfVowels);
		return new ResponseEntity<ResultResponse>(resultResponse, HttpStatus.OK);
	}
	
	
	

}
