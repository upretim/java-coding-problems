package sorting;

import java.util.*;

//https://leetcode.com/problems/jump-game-ii/
public class ShortestPathBFS {
    public static void main(String[] args) {
        ShortestPathBFS shortestPathBFS = new ShortestPathBFS();
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(shortestPathBFS.jump(nums));
    }
    public int jump(int[] nums) {
        ShortestPathBFS shortestPathBFS = new ShortestPathBFS();
        Map<Integer, ArrayList<Integer>> graph = shortestPathBFS.getGraph(nums);
        int result =0;
        int [] destination = new int[nums.length];
        Set<Integer> visitedSet = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visitedSet.add(0);
        while(!queue.isEmpty()){
           int node = queue.poll();
           ArrayList<Integer> connectedNode = graph.get(node);
           for(int counter=0;counter<connectedNode.size();counter++){
               int data = connectedNode.get(counter);
               if(!visitedSet.contains(data)){
                   visitedSet.add(data);
                   queue.add(data);
                   if(destination[data]==0){
                       destination[data]= destination[node]+1;
                       if((destination.length-1)==data) return destination[destination.length-1];
                   }
               }
           }
        }
        return result;
    }
    private Map<Integer, ArrayList<Integer>> getGraph(int[] arr){
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int start =i;
            int end = i+ arr[i];
            ArrayList<Integer> connectedNodes = new ArrayList<>();
            while(start<=end && start<arr.length){
                connectedNodes.add(start);
                start++;
            }
            graph.put(i,connectedNodes);
        }
        return graph;
    };
}
