package com.andrewkravets.recursion

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import Fib._

@RunWith(classOf[JUnitRunner])
class FibSuite extends FunSuite {

  test("simple fibonacci algo") {
    assert(simpleFib(10) === 55)
  }

}
