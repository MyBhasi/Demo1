package demo1

class Artist {
String  name
    static   hasMany = [songs:Song]
    static constraints = {
    }
}
