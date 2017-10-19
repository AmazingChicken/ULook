
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

object myItems extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Item],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[Item], brands: List[String], types: List[String] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""
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
    <h2>My Items</h2>
<a href=""""),_display_(/*20.11*/routes/*20.17*/.HomeController.signInPage()),format.raw/*20.45*/("""">Sign out</a>
   </div>
   <div class="container-fluid">
<div class="container">
      <form action=""""),_display_(/*24.22*/routes/*24.28*/.HomeController.approach2("a")),format.raw/*24.58*/("""">
      <div class="input-group stylish-input-group mt-2">
        <input type="search" class="form-control"  placeholder="Search by Item Name" onkeyup="myFunction()" name = "s" required>
        <span class="input-group-addon">
            <button type="submit">
            </form>
                <img src=""""),_display_(/*30.28*/routes/*30.34*/.Assets.versioned("images/search.png")),format.raw/*30.72*/("""" height="35" width="35">
            </button>  
        </span>
      </div>
   </div>
  
   
   
      <div class="row mt-4 ml-5 mb-4 mr-1">
      """),_display_(/*39.8*/for(item <- items) yield /*39.26*/{_display_(Seq[Any](format.raw/*39.27*/("""
         """),format.raw/*40.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href=""""),_display_(/*43.29*/routes/*43.35*/.HomeController.details(item.getName())),format.raw/*43.74*/(""""><img src=""""),_display_(/*43.87*/routes/*43.93*/.Assets.versioned(item.getPicture())),format.raw/*43.129*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*46.48*/item/*46.52*/.getName()),format.raw/*46.62*/("""</h4>
                  <div class="mb-2">
                     <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                     <a href=""""),_display_(/*49.32*/routes/*49.38*/.HomeController.removeFromFavourite(item.getName())),format.raw/*49.89*/("""" >
                     <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
                     </a> 
                  </div>
               </div>
            </div>
         </div>
         """)))}),format.raw/*56.11*/("""
        
      """),format.raw/*58.7*/("""</div>


</main>
<script>

</body>

</html>
"""))
      }
    }
  }

  def render(items:List[Item],brands:List[String],types:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(items,brands,types)

  def f:((List[Item],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (items,brands,types) => apply(items,brands,types)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 23:01:28 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/myItems.scala.html
                  HASH: 7dadf06ba2fdd423a806aa6ee07998d0681e2232
                  MATRIX: 980->1|1138->64|1165->65|1303->177|1317->183|1386->231|1460->279|1474->285|1539->330|1613->378|1627->384|1693->430|1736->447|1750->453|1816->499|1892->549|1924->560|1952->561|2057->639|2072->645|2121->673|2251->776|2266->782|2317->812|2656->1124|2671->1130|2730->1168|2907->1319|2941->1337|2980->1338|3018->1348|3178->1481|3193->1487|3253->1526|3293->1539|3308->1545|3366->1581|3535->1723|3548->1727|3579->1737|3777->1908|3792->1914|3864->1965|4118->2188|4161->2204
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|52->20|52->20|52->20|56->24|56->24|56->24|62->30|62->30|62->30|71->39|71->39|71->39|72->40|75->43|75->43|75->43|75->43|75->43|75->43|78->46|78->46|78->46|81->49|81->49|81->49|88->56|90->58
                  -- GENERATED --
              */
          