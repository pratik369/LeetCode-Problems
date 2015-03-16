/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.
*/
package leetcode;

import java.util.HashMap;

/**
 *
 * @author Pratik
 */
public class ListCloner {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return null;
        
        HashMap<Integer,RandomListNode> map = new HashMap<Integer,RandomListNode>();
        
        for(RandomListNode node = head; node != null ; node = node.next){
            RandomListNode clone = new RandomListNode(node.label);
            map.put(node.label,clone);
        }
        
        for(RandomListNode node = head; node != null ; node = node.next){
            RandomListNode clone = map.get(node.label);
            
            if(node.next !=null)
                clone.next = map.get(node.next.label);
            if(node.random != null)
                clone.random = map.get(node.random.label);
        }
        
        return map.get(head.label);
    }
    
}


class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };