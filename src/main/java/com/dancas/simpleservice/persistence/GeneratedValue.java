package com.dancas.simpleservice.persistence;

public @interface GeneratedValue {
	GenerationType strategy() default GenerationType.AUTO;
	String generator() default "";
}
