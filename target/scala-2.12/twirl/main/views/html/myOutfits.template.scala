
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

object myOutfits extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],Map[String, Outfit],play.twirl.api.HtmlFormat.Appendable] {

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
       """),_display_(/*79.9*/for((name,outfit)<- outfits) yield /*79.37*/{_display_(Seq[Any](format.raw/*79.38*/("""
        """),format.raw/*80.9*/("""<div class="col-sm-4 mb-5">
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*83.39*/routes/*83.45*/.Assets.versioned(outfit.getHat())),format.raw/*83.79*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*84.42*/routes/*84.48*/.Assets.versioned(outfit.getTop())),format.raw/*84.82*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*85.42*/routes/*85.48*/.Assets.versioned(outfit.getBottom())),format.raw/*85.85*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*86.42*/routes/*86.48*/.Assets.versioned(outfit.getShoes())),format.raw/*86.84*/("""" height="120" width="120"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">Outfit 1</h4>
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

  def render(occasion:List[String],outfits:Map[String, Outfit]): play.twirl.api.HtmlFormat.Appendable = apply(occasion,outfits)

  def f:((List[String],Map[String, Outfit]) => play.twirl.api.HtmlFormat.Appendable) = (occasion,outfits) => apply(occasion,outfits)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 17:27:21 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/myOutfits.scala.html
                  HASH: 8e6e5160111d52e2cfdb7851487ac4bc7bdaa34a
                  MATRIX: 978->1|1126->54|1154->56|1296->172|1310->178|1379->226|1454->275|1468->281|1533->326|1608->375|1622->381|1688->427|1732->445|1746->451|1812->497|1893->552|1925->563|1954->565|2211->795|2226->801|2277->831|2624->1151|2639->1157|2698->1195|3217->1687|3256->1710|3295->1711|3337->1725|3551->1912|3578->1918|3623->1935|3697->1978|3736->1989|4662->2889|4706->2917|4745->2918|4782->2928|4949->3068|4964->3074|5019->3108|5120->3182|5135->3188|5190->3222|5291->3296|5306->3302|5364->3339|5465->3413|5480->3419|5537->3455|5960->3851|5975->3857|6033->3894|6140->3970|6175->3978
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|60->28|60->28|60->28|66->34|66->34|66->34|81->49|81->49|81->49|82->50|85->53|85->53|86->54|88->56|89->57|111->79|111->79|111->79|112->80|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|125->93|125->93|125->93|128->96|129->97
                  -- GENERATED --
              */
          