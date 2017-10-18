
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

object getInspired extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(images: Map[String,String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""
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
         <img class="img-valign mt-2 mb-2 ml-2" src=""""),_display_(/*26.55*/routes/*26.61*/.Assets.versioned("images/insta.png")),format.raw/*26.98*/("""" height="60" width="60">
         <span><strong>Outfit of the Day! #OOTD</strong></span>
      </div>
   </div>
   
      <div class="row mt-4 ml-5 mb-4 mr-1">
         """),_display_(/*32.11*/for((name,image) <- images) yield /*32.38*/{_display_(Seq[Any](format.raw/*32.39*/("""
         """),format.raw/*33.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center mt-4 mb-3">
                  <a href="#"><img src=""""),_display_(/*36.42*/routes/*36.48*/.Assets.versioned(image)),format.raw/*36.72*/("""" height="500" width="400"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-4">"""),_display_(/*39.48*/name),format.raw/*39.52*/("""</h4>
               </div>
            </div>
        </div>
        """)))}),format.raw/*43.10*/("""
      """),format.raw/*44.7*/("""</div>
   </div>

</main>

</body>

</html>"""))
      }
    }
  }

  def render(images:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(images)

  def f:((Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (images) => apply(images)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 21:13:27 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/getInspired.scala.html
                  HASH: 789152504ef98761a9aef25ba15a87592b29cd7c
                  MATRIX: 967->1|1090->29|1118->31|1260->147|1274->153|1343->201|1418->250|1432->256|1497->301|1572->350|1586->356|1652->402|1696->420|1710->426|1776->472|1857->527|1889->538|1918->540|2213->808|2228->814|2286->851|2490->1028|2533->1055|2572->1056|2611->1067|2797->1226|2812->1232|2857->1256|3029->1401|3054->1405|3160->1480|3195->1488
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|58->26|58->26|58->26|64->32|64->32|64->32|65->33|68->36|68->36|68->36|71->39|71->39|75->43|76->44
                  -- GENERATED --
              */
          