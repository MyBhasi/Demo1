package demo1

class Person {
String  name
  int age
    static constraints = {
        name blank: false ,matches: /[A-Z].*/

    }
}
