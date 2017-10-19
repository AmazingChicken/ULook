
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Item],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

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
    <h2>Search</h2>
    <a href="javascript:void(0);">Sign in</a>
   </div>
   <div class="container-fluid">
   <div class="container">
      <form action=""""),_display_(/*24.22*/routes/*24.28*/.HomeController.approach1("a")),format.raw/*24.58*/("""">
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
   <div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Dropdown button
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="#">Action</a>
    <a class="dropdown-item" href="#">Another action</a>
    <a class="dropdown-item" href="#">Something else here</a>
  </div>
</div>
   
   <div class="card ml-3 mt-3 mr-2">
      <strong class="ml-3 mt-2">Category</strong>
      <select class="form-control mt-1 ml-3 category">
         <option value=""""),_display_(/*49.26*/routes/*49.32*/.HomeController.myOutfits()),format.raw/*49.59*/("""">Hats</option>
         <option value=""""),_display_(/*50.26*/routes/*50.32*/.HomeController.myOutfits()),format.raw/*50.59*/("""">Tops</option>
         <option>Bottoms</option>
         <option>Footwear</option>
      </select>
        <div class="row mt-3 ml-3">
            <div class="col-md-4"><strong>Brand</strong></div>
            <div class="col-md-4"><strong>Price</strong></div>
            <div class="col-md-4"><strong>Type</strong></div>
        </div>
   <div class="card-deck mt-1 ml-2 mb-2 mr-1">
         <div class="card ml-3 mt-1 scrollbox">
             """),_display_(/*61.15*/for(option <- brands) yield /*61.36*/{_display_(Seq[Any](format.raw/*61.37*/("""
            """),format.raw/*62.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*65.17*/option),format.raw/*65.23*/("""
               """),format.raw/*66.16*/("""</label>
            </div> 
            """)))}),format.raw/*68.14*/("""
         """),format.raw/*69.10*/("""</div>
         <div class="card ml-3 mt-1">
            <form class="form-inline-sm mt-4 text-center">
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Minimum Price">
               <label class="sr-only" for="priceFrom">priceFrom</label>
               <label class="sr-only" for="priceTo">priceTo</label>
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Maximum Price">
            </form>
         </div>
         <div class="card ml-3 mt-1 scrollbox">
            """),_display_(/*79.14*/for(option <- types) yield /*79.34*/{_display_(Seq[Any](format.raw/*79.35*/("""
            """),format.raw/*80.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*83.17*/option),format.raw/*83.23*/("""
               """),format.raw/*84.16*/("""</label>
            </div> 
            """)))}),format.raw/*86.14*/("""
         """),format.raw/*87.10*/("""</div>
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
      """),_display_(/*100.8*/for(item <- items) yield /*100.26*/{_display_(Seq[Any](format.raw/*100.27*/("""
         """),format.raw/*101.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href=""""),_display_(/*104.29*/routes/*104.35*/.HomeController.details(item.getName())),format.raw/*104.74*/(""""><img src=""""),_display_(/*104.87*/routes/*104.93*/.Assets.versioned(item.getPicture())),format.raw/*104.129*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*107.48*/item/*107.52*/.getName()),format.raw/*107.62*/("""</h4>
                  <div class="mb-2">
                     <a href=""""),_display_(/*109.32*/routes/*109.38*/.HomeController.addToOutfit(item.getName())),format.raw/*109.81*/("""" class="btn btn-success float-right mr-2">Add to Outfit</a>
                      <a href=""""),_display_(/*110.33*/routes/*110.39*/.HomeController.addToFavourite(item.getName())),format.raw/*110.85*/("""" class="btn btn-success float-right mr-2">Save</a>
                     
                  </div>
               </div>
            </div>
         </div>
         """)))}),format.raw/*116.11*/("""
        
      """),format.raw/*118.7*/("""</div>


</main>
<script>
$(document).ready(function() """),format.raw/*123.30*/("""{"""),format.raw/*123.31*/("""
    """),format.raw/*124.5*/("""$(".dropdown-toggle").dropdown();
"""),format.raw/*125.1*/("""}"""),format.raw/*125.2*/(""");
</script>
</body>

</html>"""))
      }
    }
  }

  def render(items:List[Item],brands:List[String],types:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(items,brands,types)

  def f:((List[Item],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (items,brands,types) => apply(items,brands,types)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 14:58:07 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/search.scala.html
                  HASH: 4bcf6b9e6cc37f8c58851ce2defcd1ce3e75de83
                  MATRIX: 979->1|1137->64|1165->66|1307->182|1321->188|1390->236|1465->285|1479->291|1544->336|1619->385|1633->391|1699->437|1743->455|1757->461|1823->507|1904->562|1936->573|1965->575|2204->787|2219->793|2270->823|2615->1141|2630->1147|2689->1185|3461->1930|3476->1936|3524->1963|3593->2005|3608->2011|3656->2038|4143->2498|4180->2519|4219->2520|4261->2534|4475->2721|4502->2727|4547->2744|4622->2788|4661->2799|5255->3366|5291->3386|5330->3387|5372->3401|5586->3588|5613->3594|5658->3611|5733->3655|5772->3666|6140->4007|6175->4025|6215->4026|6255->4037|6419->4173|6435->4179|6496->4218|6537->4231|6553->4237|6612->4273|6785->4418|6799->4422|6831->4432|6935->4508|6951->4514|7016->4557|7138->4651|7154->4657|7222->4703|7426->4875|7472->4893|7561->4953|7591->4954|7625->4960|7688->4995|7717->4996
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|56->24|56->24|56->24|62->30|62->30|62->30|81->49|81->49|81->49|82->50|82->50|82->50|93->61|93->61|93->61|94->62|97->65|97->65|98->66|100->68|101->69|111->79|111->79|111->79|112->80|115->83|115->83|116->84|118->86|119->87|132->100|132->100|132->100|133->101|136->104|136->104|136->104|136->104|136->104|136->104|139->107|139->107|139->107|141->109|141->109|141->109|142->110|142->110|142->110|148->116|150->118|155->123|155->123|156->124|157->125|157->125
                  -- GENERATED --
              */
          