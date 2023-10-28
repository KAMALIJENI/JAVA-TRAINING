package com.java.kamali;

import java.util.*;

public class QueueDemo1 {
	public static void main(String[] args) {
		Queue<String>queue = new LinkedList<>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element +"" +element +"");
		}
		{
			System.out.println("null");
		}

	}

}
