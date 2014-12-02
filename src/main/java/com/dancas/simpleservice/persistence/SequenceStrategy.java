package com.dancas.simpleservice.persistence;

public class SequenceStrategy implements BaseStrategy{

	@Override
	public Identificator getValue() {
		Identificator id = new Identificator(1l);
		return id;
	}

}
