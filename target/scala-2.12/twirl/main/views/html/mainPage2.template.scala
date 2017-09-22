
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object mainPage2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/mainPageandSignUp1.css")),format.raw/*14.115*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
    </head>
    <body>
         <div id="header">
            <div id="logo">
                Ulook.
            </div>
            <ul id="tools">
                <li>
                      User Name: <input type="text" name="fname" />
                      Password: <input type="text" name="lname" />
                      <input type="submit" value="Login" />
                      <input type="submit" value="Sign up" />

                      </form>
                </li>
            </ul>
            <div id="title">
                <span class="about">About this blog</span>
                <h1><a href="#">Welcome to Ulook!</a></h1>
                <h2>Here you can match your clothes by youselves!</h2>
            </div>
        </div>
       
         <div id="main">
            <img src=""""),_display_(/*40.24*/routes/*40.30*/.Assets.versioned("images/1.png")),format.raw/*40.63*/(""""width="800" height="600">
           
        </div>
        
         <p id="footer">
          
       
        </p>


        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.versioned("javascripts/main.js")),format.raw/*50.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 22 10:16:49 AEST 2017
                  SOURCE: /Users/RyanThai/Desktop/ULook/app/views/mainPage2.scala.html
                  HASH: 96d0fee4a5b8d6509cc57880e6580dabe948c0dd
                  MATRIX: 1211->260|1336->290|1364->292|1444->397|1480->406|1515->414|1541->419|1630->481|1645->487|1722->542|1810->603|1825->609|1886->648|2721->1456|2736->1462|2790->1495|2961->1639|2976->1645|3037->1685
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|71->40|71->40|71->40|81->50|81->50|81->50
                  -- GENERATED --
              */
          