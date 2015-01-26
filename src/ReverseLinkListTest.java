//26/01/2015
//Hanfang Dong
//Reverse linked list algorithm

import java.util.*;

class ListNode
{
	int m_nKey;
	ListNode m_pNext;
	ListNode(int value)
	{
		m_nKey = value;
		m_pNext = null;
	}
}

public class ReverseLinkListTest {
	public ListNode reverseLinkedList(ListNode head)
	{
        ListNode pPrev = null;
        ListNode pNode = head;
        ListNode reversedHead = null;
        ListNode pNext = null;
        
        while(pNode != null)
        {
        	pNext = pNode.m_pNext;
        	if(pNext == null)
        	{
        		reversedHead = pNode;
        	}
        	
        	pNode.m_pNext = pPrev;
        	pPrev = pNode;
        	pNode = pNext;
        	
        }     
        
        return reversedHead;
        		
	}
	
	public void printList(ListNode pNode)
	{

		while(pNode != null)
		{
			System.out.println(pNode.m_nKey);
			pNode = pNode.m_pNext;
		}
	}
	
	public static void main(String[] args)
	{
		ListNode head = new ListNode(0);
		ListNode pPrev = head;
		for(int i = 0; i < 10; i++)
		{
			ListNode pNode = new ListNode(i);
			pPrev.m_pNext = pNode;
			pPrev = pNode;	
		}

		
		ReverseLinkListTest rls = new ReverseLinkListTest();
		rls.printList(head);
		
		ListNode rHead = rls.reverseLinkedList(head);
		
        rls.printList(rHead);
	}
}
