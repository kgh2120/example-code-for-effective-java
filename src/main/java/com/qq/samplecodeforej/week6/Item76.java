package com.qq.samplecodeforej.week6;

import java.util.Collections;
import java.util.Objects;
import java.util.Stack;

public class Item76 {

	public static void swap(String [] arr, int l, int r) {
		int length = arr.length;
		Objects.checkFromToIndex(0,l,length);
		Objects.checkFromToIndex(0,r,length);

		String temp = arr[l];
		arr[l] = null;
		arr[l] = arr[r];
		arr[r] = temp;

		Stack<Object> objects = new Stack<>();
		objects.pop();

	}
}
