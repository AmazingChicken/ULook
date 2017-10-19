
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

object getInspired extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[ArrayList[TwitterPhoto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(images: ArrayList[TwitterPhoto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
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
    <h2>Get Inspired!</h2>
    <a href="javascript:void(0);">Sign out</a>
   </div>
   <div class="container-fluid">
   <div class="card mt-2">
      <div>
         <img class="img-valign mt-2 mb-2 ml-2" src=""""),_display_(/*26.55*/routes/*26.61*/.Assets.versioned("images/twitter.png")),format.raw/*26.100*/("""" height="60" width="60">
         <span><strong>Outfit of the Day! #OOTD</strong></span>
      </div>
   </div>
   <div>
   <h1 class="mt-3">Get Inspired by these creative outfits from Twitter!<h1>
   </div>
      <div class="row mt-4 ml-5 mb-4 mr-1">
         """),_display_(/*34.11*/for(image <- images) yield /*34.31*/{_display_(Seq[Any](format.raw/*34.32*/("""
         """),format.raw/*35.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5 twitter">
               <div class="text-center mt-4 mb-3">
                  <img src=""""),_display_(/*38.30*/routes/*38.36*/.Assets.versioned(image.getPicture())),format.raw/*38.73*/("""" height="500" width="400">
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-4">"""),_display_(/*41.48*/image/*41.53*/.getUsername()),format.raw/*41.67*/("""</h4>
               </div>
            </div>
        </div>
        """)))}),format.raw/*45.10*/("""
      """),format.raw/*46.7*/("""</div>
   </div>

</main>

</body>

</html>"""))
      }
    }
  }

  def render(images:ArrayList[TwitterPhoto]): play.twirl.api.HtmlFormat.Appendable = apply(images)

  def f:((ArrayList[TwitterPhoto]) => play.twirl.api.HtmlFormat.Appendable) = (images) => apply(images)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 23:01:28 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/getInspired.scala.html
                  HASH: 5429e93516ba0824513ec0527d983ffac97d53e3
                  MATRIX: 971->1|1099->34|1126->35|1264->147|1278->153|1347->201|1421->249|1435->255|1500->300|1574->348|1588->354|1654->400|1697->417|1711->423|1777->469|1853->519|1885->530|1913->531|2197->788|2212->794|2273->833|2563->1096|2599->1116|2638->1117|2676->1127|2855->1279|2870->1285|2928->1322|3093->1460|3107->1465|3142->1479|3244->1550|3278->1557
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|58->26|58->26|58->26|66->34|66->34|66->34|67->35|70->38|70->38|70->38|73->41|73->41|73->41|77->45|78->46
                  -- GENERATED --
              */
          