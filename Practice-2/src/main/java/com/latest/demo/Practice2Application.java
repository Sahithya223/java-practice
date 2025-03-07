package com.latest.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice2Application {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		SpringApplication.run(Practice2Application.class, args);
		
		System.out.println("Hello world");
		FutureTask<String> future= new FutureTask<String>(new Practice());
		Thread t=new Thread(future);
		t.start();
		String s= future.get();
		System.out.println(s);
	}

}
