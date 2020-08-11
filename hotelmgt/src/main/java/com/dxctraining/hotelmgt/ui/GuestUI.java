package com.dxctraining.librarymgt.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GuestUI {
	 public static void main(String[] args)
	    {
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	        context.register(Configure.class);
	        context.refresh();
	    }
	}


