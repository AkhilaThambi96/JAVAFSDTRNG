package com.ust.examples;
import java.util.*;


public class WrapperExample5 {

	public static void main(String[] args) {
		//creating empty priority queue
		PriorityQueue<Integer>pQueue = new PriorityQueue<Integer>();
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		pQueue.add(30);
		pQueue.add(5);
		System.out.println(pQueue.peek());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.peek());
	}

}
