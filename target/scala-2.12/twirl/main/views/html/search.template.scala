
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

   <div class="card ml-3 mt-3 mr-2">
      <strong class="ml-3 mt-2">Category</strong>
      <select class="form-control mt-1 ml-3 category">
         <option>Hats</option>
         <option>Tops</option>
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
             """),_display_(/*51.15*/for(option <- brands) yield /*51.36*/{_display_(Seq[Any](format.raw/*51.37*/("""
            """),format.raw/*52.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*55.17*/option),format.raw/*55.23*/("""
               """),format.raw/*56.16*/("""</label>
            </div> 
            """)))}),format.raw/*58.14*/("""
         """),format.raw/*59.10*/("""</div>
         <div class="card ml-3 mt-1">
            <form class="form-inline-sm mt-4 text-center">
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Minimum Price">
               <label class="sr-only" for="priceFrom">priceFrom</label>
               <label class="sr-only" for="priceTo">priceTo</label>
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Maximum Price">
            </form>
         </div>
         <div class="card ml-3 mt-1 scrollbox">
            """),_display_(/*69.14*/for(option <- types) yield /*69.34*/{_display_(Seq[Any](format.raw/*69.35*/("""
            """),format.raw/*70.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*73.17*/option),format.raw/*73.23*/("""
               """),format.raw/*74.16*/("""</label>
            </div> 
            """)))}),format.raw/*76.14*/("""
         """),format.raw/*77.10*/("""</div>
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
      """),_display_(/*90.8*/for(item <- items) yield /*90.26*/{_display_(Seq[Any](format.raw/*90.27*/("""
         """),format.raw/*91.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href=""""),_display_(/*94.29*/routes/*94.35*/.HomeController.details(item.getName())),format.raw/*94.74*/(""""><img src=""""),_display_(/*94.87*/routes/*94.93*/.Assets.versioned(item.getPicture())),format.raw/*94.129*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*97.48*/item/*97.52*/.getName()),format.raw/*97.62*/("""</h4>
                  <div class="mb-2">
                     <a href=""""),_display_(/*99.32*/routes/*99.38*/.HomeController.addToOutfit(item.getName())),format.raw/*99.81*/("""" class="btn btn-success float-right mr-2">Add to Outfit</a>
                      <a href=""""),_display_(/*100.33*/routes/*100.39*/.HomeController.addToFavourite(item.getName())),format.raw/*100.85*/("""" class="btn btn-success float-right mr-2">Save</a>
                     
                  </div>
               </div>
            </div>
         </div>
         """)))}),format.raw/*106.11*/("""
        
      """),format.raw/*108.7*/("""</div>


</main>

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
                  DATE: Thu Oct 19 16:26:02 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/search.scala.html
                  HASH: fcb9f73e7b8bab89dde9277e5e49566b2fde2099
                  MATRIX: 979->1|1137->64|1165->66|1307->182|1321->188|1390->236|1465->285|1479->291|1544->336|1619->385|1633->391|1699->437|1743->455|1757->461|1823->507|1904->562|1936->573|1965->575|2204->787|2219->793|2270->823|2615->1141|2630->1147|2689->1185|3464->1933|3501->1954|3540->1955|3582->1969|3796->2156|3823->2162|3868->2179|3943->2223|3982->2234|4576->2801|4612->2821|4651->2822|4693->2836|4907->3023|4934->3029|4979->3046|5054->3090|5093->3101|5460->3442|5494->3460|5533->3461|5572->3472|5735->3608|5750->3614|5810->3653|5850->3666|5865->3672|5923->3708|6095->3853|6108->3857|6139->3867|6242->3943|6257->3949|6321->3992|6443->4086|6459->4092|6527->4138|6731->4310|6777->4328
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|56->24|56->24|56->24|62->30|62->30|62->30|83->51|83->51|83->51|84->52|87->55|87->55|88->56|90->58|91->59|101->69|101->69|101->69|102->70|105->73|105->73|106->74|108->76|109->77|122->90|122->90|122->90|123->91|126->94|126->94|126->94|126->94|126->94|126->94|129->97|129->97|129->97|131->99|131->99|131->99|132->100|132->100|132->100|138->106|140->108
                  -- GENERATED --
              */
          