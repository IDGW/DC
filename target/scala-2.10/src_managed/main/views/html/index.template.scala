
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

<!DOCTYPE html>
<html>

	<html lang="en">
		<head>
    	<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
   		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Bootstrap -->
    	<link href='"""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Assets.at("libs/bootstrap/css/bootstrap-modified.min.css"))),format.raw/*12.84*/("""' rel="stylesheet">
    	<link rel="stylesheet" href='"""),_display_(Seq[Any](/*13.36*/routes/*13.42*/.Assets.at("stylesheets/main.css"))),format.raw/*13.76*/("""'>
    	<title> """),_display_(Seq[Any](/*14.15*/message)),format.raw/*14.22*/(""" </title>
	</head>

	<body>
		<h1> Hello World :) """),_display_(Seq[Any](/*18.24*/message)),format.raw/*18.31*/(""" </h1>
	</body>

</html>"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 05 23:44:06 ICT 2014
                    SOURCE: D:/Coding/DreamChaser/app/views/index.scala.html
                    HASH: 386662b5e0cd610d2198b326d9637dc0067d2cd0
                    MATRIX: 774->1|885->18|1174->271|1189->277|1270->336|1361->391|1376->397|1432->431|1485->448|1514->455|1601->506|1630->513
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|46->18|46->18
                    -- GENERATED --
                */
            