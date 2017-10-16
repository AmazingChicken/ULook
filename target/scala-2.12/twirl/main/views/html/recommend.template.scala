
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

object recommend extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],Map[String, Outfit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(occasion: List[String],outfits : Map[String,Outfit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""
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
            <button type="submit">
            </form>
                <img src=""""),_display_(/*33.28*/routes/*33.34*/.Assets.versioned("images/search.png")),format.raw/*33.72*/("""" height="35" width="35">
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
         """),_display_(/*77.11*/for((name,outfit)<- outfits) yield /*77.39*/{_display_(Seq[Any](format.raw/*77.40*/("""
         """),format.raw/*78.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href="#"><img src=""""),_display_(/*81.42*/routes/*81.48*/.Assets.versioned(outfit.getHat())),format.raw/*81.82*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*82.42*/routes/*82.48*/.Assets.versioned(outfit.getTop())),format.raw/*82.82*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*83.42*/routes/*83.48*/.Assets.versioned(outfit.getBottom())),format.raw/*83.85*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*84.42*/routes/*84.48*/.Assets.versioned(outfit.getShoes())),format.raw/*84.84*/("""" height="120" width="120"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*87.48*/name),format.raw/*87.52*/("""</h4>
                  <button type="button" class="btn btn-secondary ml-3 mb-2">Edit</button>
               </div>
            </div>
         </div>
         """)))}),format.raw/*92.11*/("""
      """),format.raw/*93.7*/("""</div>
   </div>

</main>

</body>

</html>"""))
      }
    }
  }

  def render(occasion:List[String],outfits:Map[String, Outfit]): play.twirl.api.HtmlFormat.Appendable = apply(occasion,outfits)

  def f:((List[String],Map[String, Outfit]) => play.twirl.api.HtmlFormat.Appendable) = (occasion,outfits) => apply(occasion,outfits)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Oct 16 11:52:44 GMT+11:00 2017
                  SOURCE: C:/Users/Administrator/ULook/app/views/recommend.scala.html
                  HASH: 4fc40b8d7f788422dc9ae8e3c0119ee637931761
                  MATRIX: 978->1|1126->54|1154->56|1296->172|1310->178|1379->226|1454->275|1468->281|1533->326|1608->375|1622->381|1688->427|1732->445|1746->451|1812->497|1893->552|1925->563|1954->565|2204->788|2219->794|2270->824|2614->1141|2629->1147|2688->1185|3199->1669|3238->1692|3277->1693|3319->1707|3533->1894|3560->1900|3605->1917|3679->1960|3718->1971|4647->2873|4691->2901|4730->2902|4769->2913|4945->3062|4960->3068|5015->3102|5116->3176|5131->3182|5186->3216|5287->3290|5302->3296|5360->3333|5461->3407|5476->3413|5533->3449|5705->3594|5730->3598|5929->3766|5964->3774
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|59->27|59->27|59->27|65->33|65->33|65->33|79->47|79->47|79->47|80->48|83->51|83->51|84->52|86->54|87->55|109->77|109->77|109->77|110->78|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|119->87|119->87|124->92|125->93
                  -- GENERATED --
              */
          