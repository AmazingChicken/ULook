
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
<<<<<<< HEAD
  </div>

  <article class="larg">


    <div>
      <h3><img src=""""),_display_(/*49.22*/routes/*49.28*/.Assets.versioned("images/2.png")),format.raw/*49.61*/(""""width="500" height="260">details here/h3>
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
  </article>
=======
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
>>>>>>> 0658d712bff933720594ea339531680f87773bfe
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
<<<<<<< HEAD
                  DATE: Tue Oct 17 21:13:27 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/detailPage.scala.html
                  HASH: c9f48cb3bdeb040aa8bab3bd61620cb6bb35c486
                  MATRIX: 1199->260|1295->262|1329->269|1441->354|1456->360|1522->405|1624->480|1639->486|1689->515|1801->600|1816->606|1864->633|1971->713|1986->719|2032->744|2238->923|2253->929|2298->953|2595->1223|2610->1229|2664->1262
                  LINES: 33->7|38->7|41->10|44->13|44->13|44->13|51->20|51->20|51->20|54->23|54->23|54->23|57->26|57->26|57->26|63->32|63->32|63->32|80->49|80->49|80->49
=======
                  DATE: Wed Oct 18 17:39:03 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/detailPage.scala.html
                  HASH: 3f647e562aca87f9b10a162cf6b8ef8e35c5ca22
                  MATRIX: 951->1|1058->13|1086->15|1228->131|1242->137|1311->185|1386->234|1400->240|1465->285|1540->334|1554->340|1620->386|1664->404|1678->410|1744->456|1825->511|1857->522|1886->524|2255->866|2268->870|2299->880
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|59->27|59->27|59->27
>>>>>>> 0658d712bff933720594ea339531680f87773bfe
                  -- GENERATED --
              */
          