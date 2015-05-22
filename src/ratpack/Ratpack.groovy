import ratpack.groovy.template.MarkupTemplateModule
import ratpack.groovy.template.TextTemplateModule

import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {

    bindings {
        add MarkupTemplateModule
        add(TextTemplateModule) { TextTemplateModule.Config config -> config.staticallyCompile = true }
    }

    handlers {
        get {
            render groovyTemplate("index.html")
        }

        assets "public"
    }
}
