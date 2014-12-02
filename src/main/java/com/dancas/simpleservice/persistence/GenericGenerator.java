package com.dancas.simpleservice.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GenericGenerator {
	public Class strategy();

}
