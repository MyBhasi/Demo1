package My

class Book {
    String name
    static belongsTo = [author: Author]
    static constraints = {
        name nullable: false
    }
}
