
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
        <a href=""""),_display_(/*11.19*/routes/*11.25*/.HomeController.recommend()),format.raw/*11.52*/("""" data-title="Team">What's Hot?</a>
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
        <a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*28.50*/routes/*28.56*/.Assets.versioned("images/hatslot.jpg")),format.raw/*28.95*/(""""  width="80"></a>
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
                  DATE: Thu Oct 19 23:01:28 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/navigator.scala.html
                  HASH: 337fdea680c5178c526dc0772ce77c1df7f46b4d
                  MATRIX: 1034->2|1108->50|1122->56|1170->84|1270->158|1284->164|1333->193|1443->276|1458->282|1506->309|1610->386|1625->392|1671->417|1773->492|1788->498|1836->525|1943->605|1958->611|2003->635|2280->885|2295->891|2355->930|2473->1021|2488->1027|2550->1068|2668->1159|2683->1165|2745->1206|2862->1296|2877->1302|2938->1342
                  LINES: 33->1|37->5|37->5|37->5|40->8|40->8|40->8|43->11|43->11|43->11|46->14|46->14|46->14|49->17|49->17|49->17|52->20|52->20|52->20|60->28|60->28|60->28|63->31|63->31|63->31|66->34|66->34|66->34|69->37|69->37|69->37
                  -- GENERATED --
              */
          