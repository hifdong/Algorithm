//20150124
//Hanfang Dong

import java.util.*;

public class FindLastKNode {

	public void findLastNode(Node head, int k)
	{
		Node kPrev = null;
		int count = 0;
		Node pNode = head;

		while(pNode != null)
		{
			if(count == k)
			{
				kPrev = head;  //care of here,kPrev is head, not pNode
			}
			pNode = pNode.next;
			if(kPrev != null)
			{
				kPrev = kPrev.next;
			}

			count++;
		}
		
		if(kPrev != null)
		{
		System.out.println("last K node value is : " + kPrev.value);
		}
	}
	
	public static void main(String[] args)
	{
		//build node list
		Node head = new Node(0);
		Node pPrev = head;
		for(int i = 0; i < 10; i++)
		{
			Node node = new Node(i);
			node.next = null;
			pPrev.next = node;
			pPrev = node;
		}
		//find last k node 
		FindLastKNode fk = new FindLastKNode();
		fk.findLastNode(head, 5);
		
	    //output node list	
		Node node = head;
		while(node != null)
		{
			System.out.println("node: " + node.value);
			node = node.next;
		}
	}
}

 class Node{
	protected Node next;
	protected int value;
	
	Node(int data)
	{
		value = data;
	}
}