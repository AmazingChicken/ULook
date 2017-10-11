
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

object getInspired extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<span class="bckg"></span>
<head>
<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*5.100*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.versioned("stylesheets/mainPage.css")),format.raw/*6.97*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*7.46*/routes/*7.52*/.Assets.versioned("stylesheets/searchbar.css")),format.raw/*7.98*/("""">
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*8.67*/(""""></script>

</head>
<header>
  <h1>ULook</h1>
  """),_display_(/*13.4*/navigator()),format.raw/*13.15*/("""
"""),format.raw/*14.1*/("""</header>
<body>
<main>

  <div class="title">
    <h2>Get Inspired!</h2>
    <a href="javascript:void(0);">Sign in</a>
   </div>
   <div class="container-fluid">
   <div class="card mt-2">
      <div>
         <img class="img-valign mt-2 mb-2 ml-2" src=""""),_display_(/*25.55*/routes/*25.61*/.Assets.versioned("images/insta.png")),format.raw/*25.98*/("""" height="60" width="60">
         <span><strong>Outfit of the Day! #OOTD</strong></span>
      </div>
   </div>
   
      <div class="card-deck mt-4 ml-5 mb-4 mr-1">
         <div class="card mr-5">
            <div class="text-center mt-4 mb-3">
               <a href="#"><img src=""""),_display_(/*33.39*/routes/*33.45*/.Assets.versioned("images/xenia.png")),format.raw/*33.82*/("""" height="500" width="400"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-4">Xenia</h4>
            </div>
         </div>
         <div class="card mr-5">
            <div class="text-center mt-4 mb-3">
               <a href="#"><img src=""""),_display_(/*41.39*/routes/*41.45*/.Assets.versioned("images/andreialbu_.png")),format.raw/*41.88*/(""""  height="500" width="400"></a>

            </div> 
            <div class="card-block">
               <h4 class="card-title ml-4">andreialbu</h4>
            </div>
         </div>
         <div class="card mr-5">
            <div class="text-center mt-4 mb-3">
               <a href="#"><img src=""""),_display_(/*50.39*/routes/*50.45*/.Assets.versioned("images/blogjuniorestevam.png")),format.raw/*50.94*/(""""  height="500" width="400"></a>
            </div> 
            <div class="card-block ">
               <h4 class="card-title ml-4">blogjuniorestevam</h4>
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
                  DATE: Wed Oct 11 20:28:48 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/getInspired.scala.html
                  HASH: d4993aaf6f7170a22a95aa6ade086d9d0899b153
                  MATRIX: 1036->0|1174->112|1188->118|1257->166|1331->214|1345->220|1410->265|1484->313|1498->319|1564->365|1607->382|1621->388|1687->434|1763->484|1795->495|1823->496|2106->752|2121->758|2179->795|2492->1081|2507->1087|2565->1124|2889->1421|2904->1427|2968->1470|3299->1774|3314->1780|3384->1829
                  LINES: 33->1|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|45->13|45->13|46->14|57->25|57->25|57->25|65->33|65->33|65->33|73->41|73->41|73->41|82->50|82->50|82->50
                  -- GENERATED --
              */
          