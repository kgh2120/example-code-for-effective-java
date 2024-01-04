package com.qq.samplecodeforej.week6;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Item73LinkedList<T> extends LinkedList<T> {

	@Override
	public T get(int index) {
		Objects.checkIndex(index,size());
		return listIterator(index).next();
	}

}
