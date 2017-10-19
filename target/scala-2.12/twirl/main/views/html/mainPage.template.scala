
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
<a href=""""),_display_(/*29.11*/routes/*29.17*/.HomeController.search("Hats")),format.raw/*29.47*/(""""><img class="mt-2 mb-2" src=""""),_display_(/*29.78*/routes/*29.84*/.Assets.versioned("images/hatslot.jpg")),format.raw/*29.123*/("""" width="150"></a>
<a href=""""),_display_(/*30.11*/routes/*30.17*/.HomeController.search("Tops")),format.raw/*30.47*/(""""><img class="mt-2 mb-2" src=""""),_display_(/*30.78*/routes/*30.84*/.Assets.versioned("images/shirtslot.jpg")),format.raw/*30.125*/(""""  width="200"></a>
<a href=""""),_display_(/*31.11*/routes/*31.17*/.HomeController.search("Bottoms")),format.raw/*31.50*/(""""><img  class="mt-2 mb-2"src=""""),_display_(/*31.81*/routes/*31.87*/.Assets.versioned("images/pantsslot.jpg")),format.raw/*31.128*/("""" width="150"></a>
<a href=""""),_display_(/*32.11*/routes/*32.17*/.HomeController.search("Shoes")),format.raw/*32.48*/(""""><img class="mt-2 mb-2" src=""""),_display_(/*32.79*/routes/*32.85*/.Assets.versioned("images/shoeslot.jpg")),format.raw/*32.125*/(""""  width="200"></a>
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
                  DATE: Thu Oct 19 23:01:28 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/mainPage.scala.html
                  HASH: 7079a64bb023045e352d86116b0176bb43ef53a8
                  MATRIX: 1033->1|1171->113|1185->119|1254->167|1328->215|1342->221|1407->266|1481->314|1495->320|1561->366|1604->383|1618->389|1684->435|1760->485|1792->496|1820->497|1925->575|1940->581|1989->609|2235->828|2250->834|2301->864|2359->895|2374->901|2435->940|2491->969|2506->975|2557->1005|2615->1036|2630->1042|2693->1083|2750->1113|2765->1119|2819->1152|2877->1183|2892->1189|2955->1230|3011->1259|3026->1265|3078->1296|3136->1327|3151->1333|3213->1373|3628->1761|3643->1767|3699->1802|3947->2023|3962->2029|4019->2065
                  LINES: 33->2|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|45->14|45->14|46->15|51->20|51->20|51->20|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|72->41|72->41|72->41|76->45|76->45|76->45
                  -- GENERATED --
              */
          