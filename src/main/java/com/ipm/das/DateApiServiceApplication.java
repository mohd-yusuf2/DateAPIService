package com.ipm.das;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ipm.util.IpmUtil;

@SpringBootApplication
public class DateApiServiceApplication { 
  IpmUtil ipm=new IpmUtil();
	public static void main(String[] args) {
		SpringApplication.run(DateApiServiceApplication.class, args);
	}

}
