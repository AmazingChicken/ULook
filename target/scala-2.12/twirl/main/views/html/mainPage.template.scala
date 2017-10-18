
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
                  DATE: Tue Oct 17 21:13:27 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/mainPage.scala.html
                  HASH: 99137f102d421dc56efc67fff0de768a88bc786a
                  MATRIX: 1197->260|1293->262|1327->269|1439->354|1454->360|1520->405|1572->431|1604->442|1634->445|2003->787|2018->793|2072->826|2238->965|2253->971|2307->1004|2468->1138|2483->1144|2537->1177
                  LINES: 33->7|38->7|41->10|44->13|44->13|44->13|46->15|46->15|47->16|61->30|61->30|61->30|65->34|65->34|65->34|69->38|69->38|69->38
                  -- GENERATED --
              */
          