package demo1

import      grails.test.mixin.TestFor
import spock.lang.Specification


@TestFor(Person)
class PersonSpec extends Specification {

 def "test1"(){
     setup:
     mockForConstraintsTests(Person)
     Person  person=new Person(name: "JEFF",age: 0)

  assert ! person.validate()
     assert 'min'==person.errors['age']
 }
}
