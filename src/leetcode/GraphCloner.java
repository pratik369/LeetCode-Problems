/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.


OJ's undirected graph serialization:
Nodes are labeled uniquely.

We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
As an example, consider the serialized graph {0,1,2#1,2#2,2}.

The graph has a total of three nodes, and therefore contains three parts as separated by #.

First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
Second node is labeled as 1. Connect node 1 to node 2.
Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
Visually, the graph looks like the following:

       1
      / \
     /   \
    0 --- 2
         / \
         \_/
*/
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class GraphCloner {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;
        
        HashMap<Integer,UndirectedGraphNode> map = new HashMap<Integer,UndirectedGraphNode>();
        cloneBuilder(node,map);
        return map.get(node.label);
    }
    
    private void cloneBuilder(UndirectedGraphNode node, HashMap<Integer,UndirectedGraphNode> map) {
        if(map.containsKey(node.label))
            return;
            
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        map.put(node.label,newNode);
        
        for(UndirectedGraphNode neighbor : node.neighbors){
            cloneBuilder(neighbor,map);
            newNode.neighbors.add(map.get(neighbor.label));
        }
    }
    
}


class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { 
          label = x;
          neighbors = new ArrayList<UndirectedGraphNode>();
      }
  };