
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

object myItems extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Map[String, String],List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(images: Map[String, String], brands: List[String], types: List[String] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""
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
    <a href="javascript:void(0);">Sign in</a>
   </div>
   <div class="container-fluid">
   <div class="container">
   
 
   
      <div class="input-group stylish-input-group mt-2">
        <input type="text" class="form-control"  placeholder="Search by Item Name" >
        <span class="input-group-addon">
            <button type="submit">
                <img src=""""),_display_(/*31.28*/routes/*31.34*/.Assets.versioned("images/search.png")),format.raw/*31.72*/("""" height="35" width="35">
            </button>  
        </span>
      </div>
   </div>
   <div class="card ml-3 mt-3 mr-2">
      <strong class="ml-3 mt-2">Category</strong>
      <select class="form-control mt-1 ml-3 category">
         <option>Hats</option>
         <option>Shirts</option>
         <option>Pants</option>
         <option>Shoes</option>
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
      """),_display_(/*90.8*/for((name,image) <- images) yield /*90.35*/{_display_(Seq[Any](format.raw/*90.36*/("""
         """),format.raw/*91.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href="#"><img src=""""),_display_(/*94.42*/routes/*94.48*/.Assets.versioned(image)),format.raw/*94.72*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*97.48*/name),format.raw/*97.52*/("""</h4>
                  <div class="mb-2">
                     <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                     <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
                  </div>
               </div>
            </div>
         </div>
         """)))}),format.raw/*105.11*/("""
        
      """),format.raw/*107.7*/("""</div>
   </div>

</main>

</body>

</html>"""))
      }
    }
  }

  def render(images:Map[String, String],brands:List[String],types:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(images,brands,types)

  def f:((Map[String, String],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (images,brands,types) => apply(images,brands,types)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 15:50:38 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/myItems.scala.html
                  HASH: 9e6ff65709cf3906ea0effd588812614970dd8dc
                  MATRIX: 989->1|1157->74|1185->76|1327->192|1341->198|1410->246|1485->295|1499->301|1564->346|1639->395|1653->401|1719->447|1763->465|1777->471|1843->517|1924->572|1956->583|1985->585|2467->1040|2482->1046|2541->1084|3311->1827|3348->1848|3387->1849|3429->1863|3643->2050|3670->2056|3715->2073|3790->2117|3829->2128|4423->2695|4459->2715|4498->2716|4540->2730|4754->2917|4781->2923|4826->2940|4901->2984|4940->2995|5307->3336|5350->3363|5389->3364|5428->3375|5604->3524|5619->3530|5664->3554|5836->3699|5861->3703|6233->4043|6279->4061
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|63->31|63->31|63->31|83->51|83->51|83->51|84->52|87->55|87->55|88->56|90->58|91->59|101->69|101->69|101->69|102->70|105->73|105->73|106->74|108->76|109->77|122->90|122->90|122->90|123->91|126->94|126->94|126->94|129->97|129->97|137->105|139->107
                  -- GENERATED --
              */
          