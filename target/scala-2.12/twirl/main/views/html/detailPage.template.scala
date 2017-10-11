
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

object detailPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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

        <a href=""""),_display_(/*20.19*/routes/*20.25*/.HomeController.getInspired()),format.raw/*20.54*/("""" data-title="Projects">Get inspired</a>
      </li>
      <li>
        <a href=""""),_display_(/*23.19*/routes/*23.25*/.HomeController.recommend()),format.raw/*23.52*/("""" data-title="Team">Recommended</a>
      </li>
      <li>
        <a href=""""),_display_(/*26.19*/routes/*26.25*/.HomeController.myItems()),format.raw/*26.50*/("""" data-title="Diary">My items</a>
      </li>
      <li>
        <a href="javascript:void(0);" data-title="Timeline">My Outfits</a>
      </li>
      <li>
        <a href=""""),_display_(/*32.19*/routes/*32.25*/.HomeController.search()),format.raw/*32.49*/("""" data-title="Settings">Search</a>
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

</form>
    <div>
      <h3><img src=""""),_display_(/*49.22*/routes/*49.28*/.Assets.versioned("images/2.png")),format.raw/*49.61*/(""""width="500" height="260">details here</span></h3>
      <p>xxx.</p>
      </h3>
    </div>

  <div id="login_click">  
        <a id="btlogin" href="#">Buy</a>  
    </div>
    <div id="login_click">  
        <a id="btlogin" href="#">Add to outfit</a>  
    </div>
      <div id="login_click">  
        <a id="btlogin" href="#">Cancel</a>  
    </div>
</main>
"""))
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
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/detailPage.scala.html
                  HASH: aa6d70df2b6df5be1dd1686a5a04bd115bc39400
                  MATRIX: 1194->254|1290->256|1321->260|1430->342|1445->348|1511->393|1606->461|1621->467|1671->496|1780->578|1795->584|1843->611|1947->688|1962->694|2008->719|2208->892|2223->898|2268->922|2555->1182|2570->1188|2624->1221
                  LINES: 33->7|38->7|41->10|44->13|44->13|44->13|51->20|51->20|51->20|54->23|54->23|54->23|57->26|57->26|57->26|63->32|63->32|63->32|80->49|80->49|80->49
                  -- GENERATED --
              */
          