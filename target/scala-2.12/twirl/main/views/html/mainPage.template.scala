
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

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
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
    <h2>Home</h2>
    <a href=""""),_display_(/*20.15*/routes/*20.21*/.HomeController.signInPage()),format.raw/*20.49*/("""">Sign out</a>
   </div>
   <div class="container-fluid">

  <div class="card-deck mt-5 ml-5 mr-5">
  <div class="card ml-5 mr-5">

<div class="text-center">
<h1 class="card-title">Your Outfit Silhouette</h1>
<a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*29.42*/routes/*29.48*/.Assets.versioned("images/hatslot.jpg")),format.raw/*29.87*/("""" width="150"></a>
<a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*30.42*/routes/*30.48*/.Assets.versioned("images/shirtslot.jpg")),format.raw/*30.89*/(""""  width="200"></a>
<a href="#"><img  class="mt-2 mb-2"src=""""),_display_(/*31.42*/routes/*31.48*/.Assets.versioned("images/pantsslot.jpg")),format.raw/*31.89*/("""" width="150"></a>
<a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*32.42*/routes/*32.48*/.Assets.versioned("images/shoeslot.jpg")),format.raw/*32.88*/(""""  width="200"></a>
</div> 
  </div>
  <div class="card ml-5 mr-5">
    <div class="card-block">
      <h1 class="card-title ">Get Started With Your Outfit!</h1>
      <h2 class="card-text">Click on an icon to start searching for apparel in that category!</h2>
      <h1 class="card-title ">Adding to your Outfit</h1>
      <div class="text-center">
         <img  class="mt-2 mb-2"src=""""),_display_(/*41.39*/routes/*41.45*/.Assets.versioned("images/add.jpg")),format.raw/*41.80*/("""" width="400"></a>
      </div>
      <h2 class="card-text">The Add to Outfit button adds the Item to your custom silhouette in the sidebar</h2>
            <div class="text-center">
         <img  class="mt-2 mb-2"src=""""),_display_(/*45.39*/routes/*45.45*/.Assets.versioned("images/help.png")),format.raw/*45.81*/("""" width="120"></a>
      </div>
      <h2 class="card-text">The Save button below the silhouette saves the outfit to My Outfits</h2>
    </div>
  </div>

</div>
   </div>
   
   
   
   </div>
</main>

</body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 20:09:09 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/mainPage.scala.html
                  HASH: a40a12abe144bea3a3f17a8273bc12bffbe2e7a3
                  MATRIX: 1033->2|1175->118|1189->124|1258->172|1333->221|1347->227|1412->272|1487->321|1501->327|1567->373|1611->391|1625->397|1691->443|1772->498|1804->509|1833->511|1943->594|1958->600|2007->628|2293->887|2308->893|2368->932|2456->993|2471->999|2533->1040|2622->1102|2637->1108|2699->1149|2787->1210|2802->1216|2863->1256|3287->1653|3302->1659|3358->1694|3610->1919|3625->1925|3682->1961
                  LINES: 33->2|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|45->14|45->14|46->15|51->20|51->20|51->20|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|72->41|72->41|72->41|76->45|76->45|76->45
                  -- GENERATED --
              */
          