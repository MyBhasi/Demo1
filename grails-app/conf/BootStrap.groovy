import person.Person

class BootStrap {

    def init = { servletContext ->
       new  Person(name: 'a',age: '19').save(failOnError: true,flush: true)
        new Person(name: 'b',age: '25').save(failOnError: true,flush: true)
        new Person(name: 'c',age: '26').save(failOnError: true,flush: true)
    }
    def destroy = {
    }
}
