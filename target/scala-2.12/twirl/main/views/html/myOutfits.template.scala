
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
    <a href="javascript:void(0);">Sign in</a>
   </div>
   <div class="container-fluid">
   <div class="container">
   

   
      <form action=""""),_display_(/*28.22*/routes/*28.28*/.HomeController.approach1("a")),format.raw/*28.58*/("""">
      <div class="input-group stylish-input-group mt-2">
        <input type="search" class="form-control"  placeholder="Search by Outfit name" onkeyup="myFunction()" name = "s" required>
        <span class="input-group-addon">
            <button type="submit">
            </form>
                <img src=""""),_display_(/*34.28*/routes/*34.34*/.Assets.versioned("images/search.png")),format.raw/*34.72*/("""" height="35" width="35">
            </button>  
        </span>
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
            """),_display_(/*49.14*/for(option <- occasion) yield /*49.37*/{_display_(Seq[Any](format.raw/*49.38*/("""
            """),format.raw/*50.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*53.17*/option),format.raw/*53.23*/("""
               """),format.raw/*54.16*/("""</label>
            </div>
            """)))}),format.raw/*56.14*/("""
         """),format.raw/*57.10*/("""</div>
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
       """),_display_(/*79.9*/for(outfit<- outfits) yield /*79.30*/{_display_(Seq[Any](format.raw/*79.31*/("""
        """),format.raw/*80.9*/("""<div class="col-sm-4 mb-5">
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*83.39*/routes/*83.45*/.Assets.versioned(outfit.getHat())),format.raw/*83.79*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*84.42*/routes/*84.48*/.Assets.versioned(outfit.getTop())),format.raw/*84.82*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*85.42*/routes/*85.48*/.Assets.versioned(outfit.getBottom())),format.raw/*85.85*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*86.42*/routes/*86.48*/.Assets.versioned(outfit.getShoes())),format.raw/*86.84*/("""" height="120" width="120"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">"""),_display_(/*89.45*/outfit/*89.51*/.getName()),format.raw/*89.61*/("""</h4>
               <button type="button" class="btn btn-secondary ml-3">Edit</button>
               <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
            </div>
            <a href="#" class="ml-2"><img src=""""),_display_(/*93.49*/routes/*93.55*/.Assets.versioned("images/share.png")),format.raw/*93.92*/("""" height="50" width="150"></a>
         </div>
         </div>
         """)))}),format.raw/*96.11*/("""
      """),format.raw/*97.7*/("""</div>
   </div>

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
                  DATE: Mon Oct 16 18:25:02 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/myOutfits.scala.html
                  HASH: 2dd8fc5cad91c0f0ebaa9b7605c2041c0a2cf990
                  MATRIX: 971->1|1112->47|1140->49|1282->165|1296->171|1365->219|1440->268|1454->274|1519->319|1594->368|1608->374|1674->420|1718->438|1732->444|1798->490|1879->545|1911->556|1940->558|2197->788|2212->794|2263->824|2610->1144|2625->1150|2684->1188|3203->1680|3242->1703|3281->1704|3323->1718|3537->1905|3564->1911|3609->1928|3683->1971|3722->1982|4648->2882|4685->2903|4724->2904|4761->2914|4928->3054|4943->3060|4998->3094|5099->3168|5114->3174|5169->3208|5270->3282|5285->3288|5343->3325|5444->3399|5459->3405|5516->3441|5679->3577|5694->3583|5725->3593|6005->3846|6020->3852|6078->3889|6185->3965|6220->3973
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|60->28|60->28|60->28|66->34|66->34|66->34|81->49|81->49|81->49|82->50|85->53|85->53|86->54|88->56|89->57|111->79|111->79|111->79|112->80|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|121->89|121->89|121->89|125->93|125->93|125->93|128->96|129->97
                  -- GENERATED --
              */
          