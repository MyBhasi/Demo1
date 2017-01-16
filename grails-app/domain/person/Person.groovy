package person

import org.grails.datastore.mapping.query.api.Criteria

class Person {

    String name
    int age
    static constraints = {
    }

    def static getPerson ()
    {
       def list=Person.findByAgeBetween(19,25)
        return list
    }
}
