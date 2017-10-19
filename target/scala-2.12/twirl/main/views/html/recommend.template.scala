
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

object recommend extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Item],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

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
    <h2>Popular</h2>
   <a href=""""),_display_(/*21.14*/routes/*21.20*/.HomeController.signInPage()),format.raw/*21.48*/("""">Sign out</a>
   </div>
   <div class="container-fluid">
   <div class="container">

<h1 class="mt-3">
<font size="9" face="Verdana">
The Most popular Items
</font>
</h1>



      </div>
   </div>
   
 
   
      <div class="row mt-4 ml-5 mb-4 mr-1">
         """),_display_(/*40.11*/for(item <- items) yield /*40.29*/{_display_(Seq[Any](format.raw/*40.30*/("""
         """),format.raw/*41.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                 <a href=""""),_display_(/*44.28*/routes/*44.34*/.HomeController.details(item.getName())),format.raw/*44.73*/(""""><img src=""""),_display_(/*44.86*/routes/*44.92*/.Assets.versioned(item.getPicture())),format.raw/*44.128*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*47.48*/item/*47.52*/.getName()),format.raw/*47.62*/("""</h4>
                   
                   
            
                   

               </div>
            </div>
         </div>
         """)))}),format.raw/*56.11*/("""
      """),format.raw/*57.7*/("""</div>


</main>

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
                  DATE: Thu Oct 19 21:21:51 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/recommend.scala.html
                  HASH: b927e4eba0b6baef29b17a6b314e618c8c4d7c82
                  MATRIX: 982->1|1140->64|1168->66|1310->182|1324->188|1393->236|1468->285|1482->291|1547->336|1622->385|1636->391|1702->437|1746->455|1760->461|1826->507|1907->562|1939->573|1968->575|2082->662|2097->668|2146->696|2454->977|2488->995|2527->996|2566->1007|2728->1142|2743->1148|2803->1187|2843->1200|2858->1206|2916->1242|3088->1387|3101->1391|3132->1401|3319->1557|3354->1565
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|53->21|53->21|53->21|72->40|72->40|72->40|73->41|76->44|76->44|76->44|76->44|76->44|76->44|79->47|79->47|79->47|88->56|89->57
                  -- GENERATED --
              */
          