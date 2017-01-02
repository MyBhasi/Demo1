package My

class Author {
    String name
    Book  book
//static   hasOne = [book:Book]

    static constraints = {
        book(nullable: true)
    }
Author()
{
    this.book=new Book()
}
}
