
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
  <nav>
    <ul>
      <li>

        <a href="javascript:void(0);" data-title="Projects">Get inspire</a>
      </li>
      <li>
        <a href="javascript:void(0);"""),_display_(/*22.38*/routes/*22.44*/.HomeController.recommend()),format.raw/*22.71*/(""";" data-title="Team">Recommended</a>
      </li>
      <li>
        <a href="javascript:void(0);"""),_display_(/*25.38*/routes/*25.44*/.HomeController.myItems()),format.raw/*25.69*/(""";" data-title="Diary">My items</a>
      </li>
      <li>
        <a href="javascript:void(0);" data-title="Timeline">My Outfits</a>
      </li>
      <li>
        <a href="javascript:void(0);" data-title="Settings">Search</a>
      </li>

    </ul>
  </nav>
</header>
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
      <h3><img src=""""),_display_(/*50.22*/routes/*50.28*/.Assets.versioned("images/2.png")),format.raw/*50.61*/(""""width="200" height="160">price<span class="entypo-down-open"></span></h3>
      <p>xxx.</p>
    </div>
    <div>
      <h3><img src=""""),_display_(/*54.22*/routes/*54.28*/.Assets.versioned("images/3.png")),format.raw/*54.61*/(""""width="200" height="160"><span class="entypo-down-open"></span></h3>
      <p>xxx.</p>
    </div>
    <div>
      <h3><img src=""""),_display_(/*58.22*/routes/*58.28*/.Assets.versioned("images/4.png")),format.raw/*58.61*/(""""width="200" height="160"><span class="entypo-down-open"></span></h3>
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
                  DATE: Fri Sep 22 01:13:20 AEST 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/mainPage.scala.html
                  HASH: 94f744f057c9f71cf00d9a75770080c98afac6e6
                  MATRIX: 1197->260|1293->262|1327->269|1439->354|1454->360|1520->405|1741->599|1756->605|1804->632|1931->732|1946->738|1992->763|2631->1375|2646->1381|2700->1414|2866->1553|2881->1559|2935->1592|3096->1726|3111->1732|3165->1765
                  LINES: 33->7|38->7|41->10|44->13|44->13|44->13|53->22|53->22|53->22|56->25|56->25|56->25|81->50|81->50|81->50|85->54|85->54|85->54|89->58|89->58|89->58
                  -- GENERATED --
              */
          