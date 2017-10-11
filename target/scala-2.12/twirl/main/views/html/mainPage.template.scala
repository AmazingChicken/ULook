
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

object mainPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the index template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a String for the title of the page and an Html
 * object to insert into the body of the page.
 */
  def apply/*7.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.4*/("""


 """),format.raw/*10.2*/("""<span class="bckg"></span>
<header>

<link rel="stylesheet" media="screen" href=""""),_display_(/*13.46*/routes/*13.52*/.Assets.versioned("stylesheets/mainPage.css")),format.raw/*13.97*/("""">
  <h1>Ulook</h1>
   """),_display_(/*15.5*/navigator()),format.raw/*15.16*/(""" 
"""),format.raw/*16.1*/("""</header>
<main>

  <div class="title">
    <h2>Welcome to ULook!</h2>
    <a href="javascript:void(0);">Sign out</a>
  </div>

  <article class="larg">
      <form class="search" action="">
<input type="search" placeholder="Search here..." required>
<button type="submit">Search</button>
</form>
    <div>
      <h3><img src=""""),_display_(/*30.22*/routes/*30.28*/.Assets.versioned("images/2.png")),format.raw/*30.61*/(""""width="200" height="160">price<span class="entypo-down-open"></span></h3>
      <p>xxx.</p>
    </div>
    <div>
      <h3><img src=""""),_display_(/*34.22*/routes/*34.28*/.Assets.versioned("images/3.png")),format.raw/*34.61*/(""""width="200" height="160"><span class="entypo-down-open"></span></h3>
      <p>xxx.</p>
    </div>
    <div>
      <h3><img src=""""),_display_(/*38.22*/routes/*38.28*/.Assets.versioned("images/4.png")),format.raw/*38.61*/(""""width="200" height="160"><span class="entypo-down-open"></span></h3>
      <p>xxx.</p>
    </div>
  </article>
</main>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 20:28:48 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/mainPage.scala.html
                  HASH: f7e3af011a3dea405fbbb3efe38fc624e82ed2cc
                  MATRIX: 1192->254|1288->256|1319->260|1428->342|1443->348|1509->393|1559->417|1591->428|1620->430|1975->758|1990->764|2044->797|2206->932|2221->938|2275->971|2432->1101|2447->1107|2501->1140
                  LINES: 33->7|38->7|41->10|44->13|44->13|44->13|46->15|46->15|47->16|61->30|61->30|61->30|65->34|65->34|65->34|69->38|69->38|69->38
                  -- GENERATED --
              */
          