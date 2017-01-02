package demo1

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Song)
class SongSpec extends Specification {

    def "test something"() {

        setup:
        Artist artist = new Artist(name: "bhaskar")
        Song song = new Song(artist: artist, name: "kalovera")
        when:
        Boolean result = song.validate()
        println song
        song.save(failOnError: true, flush: true)
        println  Song.findByName('kalovera')
        then:
        result == true
    }
}
