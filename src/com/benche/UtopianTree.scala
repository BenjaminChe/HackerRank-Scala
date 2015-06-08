package com.benche

/**
 * Solution to the Utopian Tree challenge
 * @author Benjamin Che
 */
object Solution {
   def main(args: Array[String]) {
        val lines = io.Source.stdin.getLines()  
        val cases = lines.next.toInt 
        
        /** Simple recursive approach */
        for(i <- 1 to cases) { 
            val cycles = lines.next.toInt
            lazy val finalHeight = logic(cycles)   
            println(finalHeight)
            
            def logic(j: Int) : Int = {
                ~(~1<<(j>>1)) << j%2 
            }
        }
    }
}

