import demo1.Artist
import demo1.Song
import spock.lang.Specification

/**
 * Created by anuj on 13/12/16.
 */
class SongSpec extends Specification {
    def "test"() {

    setup:
    Artist artist = new Artist(name: "bhaskar")
    Song song = new Song(artist: artist, name: "kalovera")
    when:
    Boolean result = song.validate()
    println song
    artist.save(failOnError: true,flush: true)
    song.save ( failOnError: true, flush: true )
    println Song.findByName ( 'kalovera' )
    then:
    result == true
}

}
