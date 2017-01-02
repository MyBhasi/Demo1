package demo1

import My.Author
import My.Book
import grails.converters.JSON
import org.apache.jasper.tagplugins.jstl.core.Url

import javax.net.ssl.HttpsURLConnection

//import org.testng.annotations.Test;

class TestController {

    def pdfRenderingService

    def index() {

render session.id
    }

    def mailToPdf() {
        println "mail  to pdf"
//        log.info("mailToPdf")
        ByteArrayOutputStream byteArrayOutputStream = pdfRenderingService.render(template: '/pdf')
//        log.info("line 1")
        println byteArrayOutputStream.size()
//        String from = grailsApplication.config.grails.mail.default.from
//        String to = "bhaskarsingh.1169@gmail.com"
//        String subject = "Development - Important information from Credio"
//        String content = "hi  from Credio"
//        String cc = "bhaskarsingh.1169@gmail.com"
//        Map map = [:]
//        String downloadFileName = "sample.pdf"
//        byte[] bytes = byteArrayOutputStream.toByteArray()
//        byte[] encoded = Base64.encodeBase64(bytes);
//        map[downloadFileName] = new String(encoded)
//        log.info("befor sending  mail")
//        println map
//        Boolean check = sendMailService.sendMailPostmailWithAttachment(from, to, to, subject, content, map, cc)
//        log.info(check)
        response.contentType = "application/pdf"
        response.outputStream << byteArrayOutputStream.toByteArray()
        response.outputStream.flush()


    }

    def count() {
        println Artist.count()
        render "count"
    }
    def save() {
        Artist  artist=new Artist(name: "bhaskar").save(flush: true)
        Artist  artist1=new Artist(name: 'sonu').save(flush: true)
        Artist  artist2=new Artist(name: "ashish").save(flush: true)
        def a=Artist.findAll()
        println a.getClass()

        Set  set=[7,8,9,4]
        def f=set.findAll {
            it>3

        }
       println f.getClass()
        render f


//
//        Artist  artist=new Artist(name: "hesh")
//        Song song1=new Song(name:"33")
//        Song song2=new Song(name:"34")
//        Song song3=new Song(name: 'rte')
//        artist.addToSongs(song1)
//        artist.addToSongs(song2)
//        println song3
//        artist.save(flush: true)
//        println   artist.songs.each {
//            println it
//        }
//
//        Artist  artist1=Artist.findById(3)
//        artist1.songs.each {
//            println it
//        }
//        Artist artist2 = new Artist(name: "Kishore").save(flush: true, failOnError: true)
//        Song song3 = new Song(name: 'deewana', artist: artist2).save(flush: true)
//        Song song4 = new Song(name: 'pal pal', artist: artist2).save(flush: true)
//
//        println artist2.id
//        Song.withNewSession {
//            println "artist2 " + artist2.songs
//            Artist artist3 = Artist.findById(artist2.id)
//            println "artist3 " + artist3.songs
//        }
//        render "save"
    }

    /*def getDateDifference() {
        Date d2 = new Date()
        Date d1 = new Date(1993, 9, 9)
        long[] result = new long[5];
        if (d1) {
            Calendar cal = Calendar.getInstance();
            println cal
            cal.setTimeZone(TimeZone.getTimeZone("UTC"));
            println cal.setTimeZone(TimeZone.getTimeZone("UTC"));
            cal.setTime(d1);
            println cal.setTime(d1);
            long t1 = cal.getTimeInMillis();
            println t1
            cal.setTime(d2);
            println cal.setTime(d2);
            long diff = Math.abs(cal.getTimeInMillis() - t1);
            println diff
            final int ONE_DAY = 1000 * 60 * 60 * 24;
            println ONE_DAY
            final int ONE_HOUR = ONE_DAY / 24;
            println ONE_HOUR
            final int ONE_MINUTE = ONE_HOUR / 60;
            println ONE_MINUTE
            final int ONE_SECOND = ONE_MINUTE / 60;
            println ONE_SECOND

            long d = diff / ONE_DAY;
            println d
            diff %= ONE_DAY;

            long h = diff / ONE_HOUR;
            diff %= ONE_HOUR;

            long m = diff / ONE_MINUTE;
            diff %= ONE_MINUTE;

            long s = diff / ONE_SECOND;
            long ms = diff % ONE_SECOND;
            result[0] = d;
            result[1] = h;
            result[2] = m;
            result[3] = s;
            result[4] = ms;
            result.each {
                println it
            }
        }
        render result
    }*/
def select ()
{
    Artist  artist=Artist.load(1)


}

  def fb()
  {
println "in  fb"

  }

    def  callBack()
    {
println("llllllllllllllllllll ${request.properties}")
        def  data=request.getJSON()
        println  data
        println "*************"
        println "hubmode:${params?.hub?.mode}"
        println "hubs.verifyToken:${params?.hub?.verifyToken}"
        render "${params?.hub?.challenge}"
    }

    def  send()
    {
         String url ='https://graph.facebook.com/v2.6/me/messages?access_token=EAAZAVZBH7Y1yMBAMZATL9lXyntJEdzFrhhLaRdBBZAbNXEuqhxHfQ06SKLY9D0pC9uusaE4jB6ZCv8OEHee5y50ZCIfBfBDh0qBgGSpPIUKj5hFa9d10ShudrD8WO73i8BtPUF5LbmQiKTHRIJukAwWH0Br779e4KuRwvZC3M2xSgZDZD'
String contentType= "Content-Type: application/json"
//        String response = url1.text
        render "${response}"

//
//
}
    def afterAjax()
    {
        println "*************ajax"
  render  "hello"
    }
    def  login()
    {

println  "login**********"

    }

def  saveAorB()
    {

Author  author=new Author(name: "bhasi")
        author.book.setName("bha")
        author.save(failOnError: true)
        render author.book

    }

    def getBook()
    {
        render Book.first().author.name
    }

def url()
{
    URL  url=new URL("http://www.google.com")
    String response=url.text
  render response
}



}
