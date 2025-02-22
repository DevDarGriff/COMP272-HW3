/*
 * *** Devon Griffith / COMP 272 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

 import java.util.*;

 public class TreeProblems {
 
   /**
    * Method different()
    *
    * Given two TreeSets of integers, return a TreeSet containing all elements 
    * that are NOT in both sets. In other words, return a TreeSet of all the
    * elements that are in one set but not the other.
    */
   
   public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
 
     // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
     //
     // This can be done numerous ways, but once such will only that
     // *several* lines of code. Hint: create two temporary TreeSets and utilize the
     // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

     Set<Integer> union = new TreeSet<Integer>();                             //union Set to hold setA & setB
     //System.out.println();
     //System.out.println("union set before: " + union);
     union.addAll(setA);                                                      //add setA to union Set
     union.addAll(setB);                                                      //add setB to union Set
     //System.out.println("union set after: " + union);
     //System.out.println();

     Set<Integer> intersection = new TreeSet<Integer>();                      //intersection Set to hold elements found in both
     //System.out.println("intersection set before: " + intersection);
     intersection.addAll(setA);                                               //add setA to intersection Set
     intersection.retainAll(setB);                                            //take intersection of setA & setB, stored in intersection Set
     //System.out.println("intersection set after: " + intersection);
     //System.out.println();

     //System.out.println("Removing intersec from union...");
     union.removeAll(intersection);                                           //remove all intersection elements from union Set 
     //System.out.println(union);
     //System.out.println();
     
    
     //System.out.println(union);
     //System.out.println(intersection);
 
     return union;                                                            //return union Set
   }
 
 
   /**
    * Method removeEven()
    *
    * Given a treeMap with the key as an integer, and the value as a String,
    * remove all <key, value> pairs where the key is even. 
    */
 
   public static void removeEven(Map<Integer, String> treeMap) {
 
     // INSERT CODE HERE.
     //int keys = treeMap.keySet();
     /* 
     for (int keys : treeMap.keySet()) {        //cannot modify treeMap in foreach loop; read only. need iterator
        if (keys % 2 == 0) {
            treeMap.remove(keys);
        }
     }
     */
     
     Iterator<Integer> itr = treeMap.keySet().iterator();                     //an iterator for treeMap's key set 
     while (itr.hasNext()) {
        int keys = itr.next();
        if (keys % 2 == 0) {                                                  //if keys in ketSet are even
            itr.remove();                                                     //remove key-value pair for treeMap
        }
     }
 
     return;                                                                  //return
   }
 
 
   /**
    * Method treesEqual()
    *
    * Given two treeMaps, each with the key as an integer, and the value as a String,
    * return a boolean value indicating if the two trees are equal or not.
    */
 
   public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
 
     // INSERT CODE HERE
     if (tree1.equals(tree2)) {
        return true;
     }
     return false;
 
   }
 
 } // end treeProblems class
