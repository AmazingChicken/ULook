
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

object detailPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Item,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: Item):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<span class="bckg"></span>
<head>
<link rel="stylesheet" media="screen" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*6.100*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*7.46*/routes/*7.52*/.Assets.versioned("stylesheets/mainPage.css")),format.raw/*7.97*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*8.46*/routes/*8.52*/.Assets.versioned("stylesheets/searchbar.css")),format.raw/*8.98*/("""">
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*9.67*/(""""></script>

</head>
<header>
  <h1>ULook</h1>
  """),_display_(/*14.4*/navigator()),format.raw/*14.15*/("""
"""),format.raw/*15.1*/("""</header>
<body>
<main>
  <div class="title">
    <h2>Details</h2>
    <a href="javascript:void(0);">Sign out</a>
   </div>
   <div class="container-fluid ">
   
   <div class="card details mt-5 ml-2">
      <img class="card-img-top" src="..." alt="Card image cap">
      <div class="card-block">
         <h4 class="card-title">"""),_display_(/*27.34*/item/*27.38*/.getName()),format.raw/*27.48*/("""</h4>
         <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
         <a href="#" class="btn btn-secondary">Add to Outfit</a>
      </div>
   </div>
   

   </div>
</main>

</body>

</html>"""))
      }
    }
  }

  def render(item:Item): play.twirl.api.HtmlFormat.Appendable = apply(item)

  def f:((Item) => play.twirl.api.HtmlFormat.Appendable) = (item) => apply(item)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 18 17:39:03 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/detailPage.scala.html
                  HASH: 3f647e562aca87f9b10a162cf6b8ef8e35c5ca22
                  MATRIX: 951->1|1058->13|1086->15|1228->131|1242->137|1311->185|1386->234|1400->240|1465->285|1540->334|1554->340|1620->386|1664->404|1678->410|1744->456|1825->511|1857->522|1886->524|2255->866|2268->870|2299->880
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|59->27|59->27|59->27
                  -- GENERATED --
              */
          