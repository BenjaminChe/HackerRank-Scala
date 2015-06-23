package com.benche

object Solution {
   def main(args: Array[String]) {
      /** Define input */
      val in = io.Source.stdin;
      val lines = in.getLines().toList
      
      /** Read first line, pattern matching for N, T assignment */
      val n :: t = lines(0).split(" ").toList  //both of these values can be derived from the data structure
      
      /** Read second line as width[k] */
      val width = lines(1).split(" ").map(_.toInt)
      
      /** Read the rest of the values, match width[k] array, output result */
      for(testCase <- lines.drop(2)) {
         val Array(i, j) = testCase.split(" ").map(_.toInt)
         println(width.slice(i, j).min)
      }
   }
}