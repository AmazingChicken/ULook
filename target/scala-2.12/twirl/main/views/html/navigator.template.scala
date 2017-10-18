
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

object navigator extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.3*/("""<nav>
   
    <ul>
      <li>
        <a href=""""),_display_(/*5.19*/routes/*5.25*/.HomeController.goMainPage()),format.raw/*5.53*/("""" data-title="Projects">Home</a>
      </li>
      <li>
        <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.getInspired()),format.raw/*8.54*/("""" data-title="Projects">Get Inspired!</a>
      </li>
      <li>
        <a href=""""),_display_(/*11.19*/routes/*11.25*/.HomeController.recommend()),format.raw/*11.52*/("""" data-title="Team">Recommended</a>
      </li>
      <li>
        <a href=""""),_display_(/*14.19*/routes/*14.25*/.HomeController.myItems()),format.raw/*14.50*/("""" data-title="Diary">My Items</a>
      </li>
      <li>
        <a href=""""),_display_(/*17.19*/routes/*17.25*/.HomeController.myOutfits()),format.raw/*17.52*/("""" data-title="Timeline">My Outfits</a>
      </li>
      <li>
        <a href=""""),_display_(/*20.19*/routes/*20.25*/.HomeController.search()),format.raw/*20.49*/("""" data-title="Settings">Search</a>
      </li>
      <li>
      <form>
      <input class="outfitname" type="text" name="outfitname" placeholder="Outfit Name"><br>
      </form>
      </li>
      <li>
        <a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*28.50*/routes/*28.56*/.Assets.versioned("images/hatslot.jpg")),format.raw/*28.95*/("""" width="80"></a>
      </li>
      <li>
        <a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*31.50*/routes/*31.56*/.Assets.versioned("images/shirtslot.jpg")),format.raw/*31.97*/(""""  width="80"></a>
      </li>
      <li>
        <a href="#"><img  class="mt-2 mb-2"src=""""),_display_(/*34.50*/routes/*34.56*/.Assets.versioned("images/pantsslot.jpg")),format.raw/*34.97*/("""" width="80"></a>
      </li>
      <li>
        <a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*37.50*/routes/*37.56*/.Assets.versioned("images/shoeslot.jpg")),format.raw/*37.96*/(""""  width="80"></a>
      </li>
       <li>
      <button type="button" class="btn btn-success">Save</button>
      </li>

    </ul>
  </nav>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 00:14:42 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/navigator.scala.html
                  HASH: b655fdc5c716c88ad6da252fbe9d63cf2f14c064
                  MATRIX: 1034->2|1112->54|1126->60|1174->88|1277->165|1291->171|1340->200|1453->286|1468->292|1516->319|1623->399|1638->405|1684->430|1789->508|1804->514|1852->541|1962->624|1977->630|2022->654|2307->912|2322->918|2382->957|2502->1050|2517->1056|2579->1097|2700->1191|2715->1197|2777->1238|2897->1331|2912->1337|2973->1377
                  LINES: 33->1|37->5|37->5|37->5|40->8|40->8|40->8|43->11|43->11|43->11|46->14|46->14|46->14|49->17|49->17|49->17|52->20|52->20|52->20|60->28|60->28|60->28|63->31|63->31|63->31|66->34|66->34|66->34|69->37|69->37|69->37
                  -- GENERATED --
              */
          