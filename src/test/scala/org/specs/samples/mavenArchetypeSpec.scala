package org.specs.samples
import org.specs._

/**
 * Sample specification.
 * This specification can be executed with: scala -cp <your classpath> ${package}.ListTest
 * Or using maven: mvn test
 * 
 * For more information on how to write or run specifications, please visit: http://code.google.com/p/specs.
 * 
 */
class ListTest extends SpecificationWithJUnit {
  "A List" should {
    "have a size method returning the number of elements in the list" in {
      List(1, 2, 3).size must_== 3
    }
    // add more examples here
    // ...
  }
}
