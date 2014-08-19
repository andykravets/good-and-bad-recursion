package com.andrewkravets.recursion

object Fib {

  def simpleFib(x: Int): Int = {
    if (x == 0) 0
    else if (x == 1) x
    else simpleFib(x - 1) + simpleFib(x - 2)
  }


}
