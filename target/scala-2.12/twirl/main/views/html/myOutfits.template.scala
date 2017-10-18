
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

object myOutfits extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],List[Outfit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(occasion: List[String],outfits :List[Outfit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""
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
    <h2>My Outfits</h2>
    <a href="javascript:void(0);">Sign out</a>
   </div>
   <div class="container-fluid">
   </div>
   

   
      <div class="row mt-4 ml-5 mb-4 mr-1">
       """),_display_(/*29.9*/for(outfit<- outfits) yield /*29.30*/{_display_(Seq[Any](format.raw/*29.31*/("""
        """),format.raw/*30.9*/("""<div class="col-sm-4 mb-5">
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*33.39*/routes/*33.45*/.Assets.versioned(outfit.getHat())),format.raw/*33.79*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*34.42*/routes/*34.48*/.Assets.versioned(outfit.getTop())),format.raw/*34.82*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*35.42*/routes/*35.48*/.Assets.versioned(outfit.getBottom())),format.raw/*35.85*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*36.42*/routes/*36.48*/.Assets.versioned(outfit.getShoes())),format.raw/*36.84*/("""" height="120" width="120"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">"""),_display_(/*39.45*/outfit/*39.51*/.getName()),format.raw/*39.61*/("""</h4>
               <button type="button" class="btn btn-secondary ml-3">Edit</button>
               <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
            </div>
            <a href="#" class="ml-2"><img src=""""),_display_(/*43.49*/routes/*43.55*/.Assets.versioned("images/share.png")),format.raw/*43.92*/("""" height="50" width="150"></a>
         </div>
         </div>
         """)))}),format.raw/*46.11*/("""
      """),format.raw/*47.7*/("""</div>


</main>

</body>

</html>"""))
      }
    }
  }

  def render(occasion:List[String],outfits:List[Outfit]): play.twirl.api.HtmlFormat.Appendable = apply(occasion,outfits)

  def f:((List[String],List[Outfit]) => play.twirl.api.HtmlFormat.Appendable) = (occasion,outfits) => apply(occasion,outfits)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 02:14:36 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/myOutfits.scala.html
                  HASH: fc9a08de07543aea5394ac50187ec469b566e93b
                  MATRIX: 971->1|1112->47|1140->49|1282->165|1296->171|1365->219|1440->268|1454->274|1519->319|1594->368|1608->374|1674->420|1718->438|1732->444|1798->490|1879->545|1911->556|1940->558|2212->804|2249->825|2288->826|2325->836|2492->976|2507->982|2562->1016|2663->1090|2678->1096|2733->1130|2834->1204|2849->1210|2907->1247|3008->1321|3023->1327|3080->1363|3243->1499|3258->1505|3289->1515|3569->1768|3584->1774|3642->1811|3749->1887|3784->1895
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|61->29|61->29|61->29|62->30|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|71->39|71->39|71->39|75->43|75->43|75->43|78->46|79->47
                  -- GENERATED --
              */
          