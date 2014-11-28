package com.dancas.simpleservice.persistence;

public @interface SequenceGenerator {

	String name();
	String sequenceName();
	String schema();
	int initialValue() default 1;
	int allocationSize() default 50;
	
}
