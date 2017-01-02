package demo1

import grails.test.mixin.TestFor
import spock.lang.Specification

import javax.swing.text.StyledEditorKit

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Artist)
class ArtistSpec extends Specification {

    def "test something"() {
        setup:
        Artist  artist=new Artist()
        Song  song=new Song(artist:artist)
        when:
        Boolean result=song.validate()
        song.save(failOnError: true,flush: true)
        then:
        result==true
    }
}
