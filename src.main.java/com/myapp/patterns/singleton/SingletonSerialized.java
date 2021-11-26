package com.myapp.patterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonSerialized implements Serializable {
	private static final long serialVersionUID = 1L;
	private static SingletonSerialized instance;

	private SingletonSerialized() {

	}

	public static SingletonSerialized getInstance() {
		if (instance == null) {
			instance = new SingletonSerialized();
		}
		return instance;
	}

	public Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
