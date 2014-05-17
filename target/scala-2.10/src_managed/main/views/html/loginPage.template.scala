
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
object loginPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
    	<link href='"""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Assets.at("libs/bootstrap/css/bootstrap-login.css"))),format.raw/*12.77*/("""' rel="stylesheet">
    	<title> """),_display_(Seq[Any](/*13.15*/message)),format.raw/*13.22*/(""" </title>
	</head>

	<body>
	<h1>lalala</h1>
	<div id="fullscreen_bg" class="fullscreen_bg"/>
	<div class="container">
		<form class="form-signin">
			<h1 class="form-signin-heading text-muted">Sign In</h1>
			<input type="text" class="form-control" placeholder="Email address" required="" autofocus="">
			<input type="password" class="form-control" placeholder="Password" required="">
			<button class="btn btn-lg btn-primary btn-block" type="submit">
				Sign In
			</button>
		</form>

</div>
	</body>

</html>"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 18 03:38:47 ICT 2014
                    SOURCE: C:/Users/Ryan/Documents/GitHub/DC/app/views/loginPage.scala.html
                    HASH: 68cdc4eb91689181e70a8012966bb126d2560fd4
                    MATRIX: 778->1|889->18|1189->282|1204->288|1278->340|1349->375|1378->382
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13
                    -- GENERATED --
                */
            