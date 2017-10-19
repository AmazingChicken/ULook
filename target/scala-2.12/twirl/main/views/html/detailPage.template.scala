
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
   
   <div class="card details mt-5 ml-10">
   <div class="text-center">
      <img class="card-img-top" src=""""),_display_(/*26.39*/routes/*26.45*/.Assets.versioned(item.getPicture())),format.raw/*26.81*/("""" >
      </div>
         <h1 class="card-title mt-2">"""),_display_(/*28.39*/item/*28.43*/.getName()),format.raw/*28.53*/("""</h1>
         <p class="card-text">"""),_display_(/*29.32*/item/*29.36*/.getType()),format.raw/*29.46*/("""</p>
         <h1 class="card-title mt-2">Price $"""),_display_(/*30.46*/item/*30.50*/.getPrice),format.raw/*30.59*/("""</h1>
         <a href="#" class="btn btn-secondary">Add to Outfit</a>
         <a href=""""),_display_(/*32.20*/routes/*32.26*/.HomeController.addToFavourite(item.getName())),format.raw/*32.72*/("""" class="btn btn-success">Save</a>
         <a href=""""),_display_(/*33.20*/item/*33.24*/.getBrand()),format.raw/*33.35*/(""""><h1 class="card-title mt-2">Go to their website</h1></a>
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
                  DATE: Thu Oct 19 23:01:28 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/detailPage.scala.html
                  HASH: b9eab29c80a4d5dabf9129a2cef904ad25a76b7b
                  MATRIX: 951->1|1058->13|1085->14|1223->126|1237->132|1306->180|1380->228|1394->234|1459->279|1533->327|1547->333|1613->379|1656->396|1670->402|1736->448|1812->498|1844->509|1872->510|2169->780|2184->786|2241->822|2323->877|2336->881|2367->891|2431->928|2444->932|2475->942|2552->992|2565->996|2595->1005|2712->1095|2727->1101|2794->1147|2875->1201|2888->1205|2920->1216
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|58->26|58->26|58->26|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|64->32|64->32|64->32|65->33|65->33|65->33
                  -- GENERATED --
              */
          