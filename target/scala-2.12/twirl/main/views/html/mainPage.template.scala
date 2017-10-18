
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
    <a href="javascript:void(0);">Sign out</a>
   </div>
   <div class="container-fluid">

  <div class="card-group mt-5">
  <div class="card ml-2">

<div class="text-center">
<a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*28.42*/routes/*28.48*/.Assets.versioned("images/hatslot.jpg")),format.raw/*28.87*/("""" height="200" width="200"></a>
<a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*29.42*/routes/*29.48*/.Assets.versioned("images/shirtslot.jpg")),format.raw/*29.89*/("""" height="200" width="200"></a>
<a href="#"><img  class="mt-2 mb-2"src=""""),_display_(/*30.42*/routes/*30.48*/.Assets.versioned("images/pantsslot.jpg")),format.raw/*30.89*/("""" height="200" width="200"></a>
<a href="#"><img class="mt-2 mb-2" src=""""),_display_(/*31.42*/routes/*31.48*/.Assets.versioned("images/shoeslot.jpg")),format.raw/*31.88*/("""" height="200" width="200"></a>
</div> 
  </div>
  <div class="card">
    <div class="card-block">
      <h4 class="card-title mt-3">Get Started With Your Outfit!</h4>
      <p class="card-text">Click on an icon to start searching for apparel in that category!</p>
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
<<<<<<< HEAD
                  DATE: Tue Oct 17 21:13:27 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/mainPage.scala.html
                  HASH: 99137f102d421dc56efc67fff0de768a88bc786a
                  MATRIX: 1197->260|1293->262|1327->269|1439->354|1454->360|1520->405|1572->431|1604->442|1634->445|2003->787|2018->793|2072->826|2238->965|2253->971|2307->1004|2468->1138|2483->1144|2537->1177
                  LINES: 33->7|38->7|41->10|44->13|44->13|44->13|46->15|46->15|47->16|61->30|61->30|61->30|65->34|65->34|65->34|69->38|69->38|69->38
=======
                  DATE: Wed Oct 18 17:53:03 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/mainPage.scala.html
                  HASH: 5ba8c37bbf5a9676e7b0b52c2aabbf00007588d8
                  MATRIX: 1033->2|1175->118|1189->124|1258->172|1333->221|1347->227|1412->272|1487->321|1501->327|1567->373|1611->391|1625->397|1691->443|1772->498|1804->509|1833->511|2154->805|2169->811|2229->850|2330->924|2345->930|2407->971|2508->1045|2523->1051|2585->1092|2686->1166|2701->1172|2762->1212
                  LINES: 33->2|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|45->14|45->14|46->15|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31
>>>>>>> 0658d712bff933720594ea339531680f87773bfe
                  -- GENERATED --
              */
          