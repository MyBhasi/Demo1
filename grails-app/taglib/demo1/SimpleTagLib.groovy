package demo1

class SimpleTagLib {
    static defaultEncodeAs = 'html'
    //static encodeAsForTags = [tagName: 'raw']
    static namespace = 's'

        def hello = { attrs, body ->
            out << "Hello ${attrs.name ?: 'World'}"
        }

        def bye = { attrs, body ->
            out << "Bye ${attrs.author.name ?: 'World'}"
        }

}
