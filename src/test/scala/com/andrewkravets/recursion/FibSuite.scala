package com.andrewkravets.recursion

import org.junit.Ignore
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import Fib._

@RunWith(classOf[JUnitRunner])
class FibSuite extends FunSuite {

  test("simple fibonacci algo") {
    assert(simpleFib(10) === 55)
  }

  test("tail fibonacci algo") {
    assert(tailFib(10) === 55)
  }

  test("tail fibonacci algo1") {
    assert(tailFib(20) === 6765)
  }

  test("tail and simple fibonacci algo is equals") {
    assert(tailFib(20)===simpleFib(20))
  }

}
