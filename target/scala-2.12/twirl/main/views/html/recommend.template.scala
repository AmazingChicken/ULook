
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

object recommend extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],List[Outfit],play.twirl.api.HtmlFormat.Appendable] {

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
    <h2>Recommended</h2>
    <a href="javascript:void(0);">Sign in</a>
   </div>
   <div class="container-fluid">
   <div class="container">


      <form action=""""),_display_(/*27.22*/routes/*27.28*/.HomeController.approach1("a")),format.raw/*27.58*/("""">
      <div class="input-group stylish-input-group mt-2">
        <input type="search" class="form-control"  placeholder="Search by Keywords" onkeyup="myFunction()" name = "s" required>
        <span class="input-group-addon">
            <button type="submit"></button></span></div>
            </form>
                <img src=""""),_display_(/*33.28*/routes/*33.34*/.Assets.versioned("images/search.png")),format.raw/*33.72*/("""" height="35" width="35">


      </div>
   </div>
   
   <div class="card ml-3 mt-3 mr-2">
      <div class="row mt-3 ml-3">
         <div class="col-md-4"><strong>Occasion</strong></div>
         <div class="col-md-4"><strong>Price</strong></div>
         <div class="col-md-4"><strong>Tags</strong></div>
      </div>
      <div class="card-deck mt-1 ml-2 mb-2 mr-1">
         <div class="card ml-3 mt-1 scrollbox">
            """),_display_(/*47.14*/for(option <- occasion) yield /*47.37*/{_display_(Seq[Any](format.raw/*47.38*/("""
            """),format.raw/*48.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*51.17*/option),format.raw/*51.23*/("""
               """),format.raw/*52.16*/("""</label>
            </div>
            """)))}),format.raw/*54.14*/("""
         """),format.raw/*55.10*/("""</div>
         <div class="card ml-3 mt-1">
            <form class="form-inline-sm mt-4 text-center">
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Minimum Price">
               <label class="sr-only" for="priceFrom">priceFrom</label>
               <label class="sr-only" for="priceTo">priceTo</label>
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Maximum Price">
            </form>
         </div>
         <div class="card ml-3 mt-1 scrollbox">
         </div>
      </div>
   </div>
   <select class="form-control mt-3 sort">
      <option>Price High to Low</option>
      <option>Price Low to High</option>
      <option>Newest-Oldest</option>
      <option>Name A-Z</option>
      <option>Name Z-A</option>
   </select>
   
      <div class="row mt-4 ml-5 mb-4 mr-1">
         """),_display_(/*77.11*/for(outfit<- outfits) yield /*77.32*/{_display_(Seq[Any](format.raw/*77.33*/("""
         """),format.raw/*78.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href="#"><img src=""""),_display_(/*81.42*/routes/*81.48*/.Assets.versioned(outfit.getHat())),format.raw/*81.82*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*82.42*/routes/*82.48*/.Assets.versioned(outfit.getTop())),format.raw/*82.82*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*83.42*/routes/*83.48*/.Assets.versioned(outfit.getBottom())),format.raw/*83.85*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*84.42*/routes/*84.48*/.Assets.versioned(outfit.getShoes())),format.raw/*84.84*/("""" height="120" width="120"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*87.48*/outfit/*87.54*/.getName()),format.raw/*87.64*/("""</h4>
                  <button type="button" class="btn btn-secondary ml-3 mb-2">Edit</button>
               </div>
            </div>
         </div>
         """)))}),format.raw/*92.11*/("""
      """),format.raw/*93.7*/("""</div>


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
                  DATE: Tue Oct 17 21:13:37 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/recommend.scala.html
                  HASH: b00284370f8b7f3dff48261f59e6c4e6c3ee03c0
                  MATRIX: 971->1|1112->47|1140->49|1282->165|1296->171|1365->219|1440->268|1454->274|1519->319|1594->368|1608->374|1674->420|1718->438|1732->444|1798->490|1879->545|1911->556|1940->558|2190->781|2205->787|2256->817|2622->1156|2637->1162|2696->1200|3169->1646|3208->1669|3247->1670|3289->1684|3503->1871|3530->1877|3575->1894|3649->1937|3688->1948|4617->2850|4654->2871|4693->2872|4732->2883|4908->3032|4923->3038|4978->3072|5079->3146|5094->3152|5149->3186|5250->3260|5265->3266|5323->3303|5424->3377|5439->3383|5496->3419|5668->3564|5683->3570|5714->3580|5913->3748|5948->3756
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|59->27|59->27|59->27|65->33|65->33|65->33|79->47|79->47|79->47|80->48|83->51|83->51|84->52|86->54|87->55|109->77|109->77|109->77|110->78|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|119->87|119->87|119->87|124->92|125->93
                  -- GENERATED --
              */
          