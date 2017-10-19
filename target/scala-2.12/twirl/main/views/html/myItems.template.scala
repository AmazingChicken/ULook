
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
    <a href="javascript:void(0);">Sign out</a>
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
             """),_display_(/*50.15*/for(option <- brands) yield /*50.36*/{_display_(Seq[Any](format.raw/*50.37*/("""
            """),format.raw/*51.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*54.17*/option),format.raw/*54.23*/("""
               """),format.raw/*55.16*/("""</label>
            </div> 
            """)))}),format.raw/*57.14*/("""
         """),format.raw/*58.10*/("""</div>
         <div class="card ml-3 mt-1">
            <form class="form-inline-sm mt-4 text-center">
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Minimum Price">
               <label class="sr-only" for="priceFrom">priceFrom</label>
               <label class="sr-only" for="priceTo">priceTo</label>
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Maximum Price">
            </form>
         </div>
         <div class="card ml-3 mt-1 scrollbox">
            """),_display_(/*68.14*/for(option <- types) yield /*68.34*/{_display_(Seq[Any](format.raw/*68.35*/("""
            """),format.raw/*69.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*72.17*/option),format.raw/*72.23*/("""
               """),format.raw/*73.16*/("""</label>
            </div> 
            """)))}),format.raw/*75.14*/("""
         """),format.raw/*76.10*/("""</div>
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
      """),_display_(/*89.8*/for(item <- items) yield /*89.26*/{_display_(Seq[Any](format.raw/*89.27*/("""
         """),format.raw/*90.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href="#"><img src=""""),_display_(/*93.42*/routes/*93.48*/.Assets.versioned(item.getPicture())),format.raw/*93.84*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*96.48*/item/*96.52*/.getName()),format.raw/*96.62*/("""</h4>
                  <div class="mb-2">
                     <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                     <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
                  </div>
               </div>
            </div>
         </div>
         """)))}),format.raw/*104.11*/("""
        
      """),format.raw/*106.7*/("""</div>


</main>
<script>

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
<<<<<<< HEAD
                  DATE: Wed Oct 18 21:01:42 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/myItems.scala.html
                  HASH: 86261df38a277ab911599aafe8e5cf2e7def9fc1
                  MATRIX: 980->1|1138->64|1166->66|1308->182|1322->188|1391->236|1466->285|1480->291|1545->336|1620->385|1634->391|1700->437|1744->455|1758->461|1824->507|1905->562|1937->573|1966->575|2221->803|2236->809|2287->839|2655->1180|2670->1186|2729->1224|3457->1925|3494->1946|3533->1947|3575->1961|3789->2148|3816->2154|3861->2171|3936->2215|3975->2226|4569->2793|4605->2813|4644->2814|4686->2828|4900->3015|4927->3021|4972->3038|5047->3082|5086->3093|5453->3434|5487->3452|5526->3453|5565->3464|5741->3613|5756->3619|5813->3655|5985->3800|5998->3804|6029->3814|6401->4154|6447->4172
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|59->27|59->27|59->27|65->33|65->33|65->33|83->51|83->51|83->51|84->52|87->55|87->55|88->56|90->58|91->59|101->69|101->69|101->69|102->70|105->73|105->73|106->74|108->76|109->77|122->90|122->90|122->90|123->91|126->94|126->94|126->94|129->97|129->97|129->97|137->105|139->107
=======
                  DATE: Thu Oct 19 16:27:12 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/myItems.scala.html
                  HASH: 63b12e845465d195aecd7fd884da415c213b95a9
                  MATRIX: 980->1|1138->64|1166->66|1308->182|1322->188|1391->236|1466->285|1480->291|1545->336|1620->385|1634->391|1700->437|1744->455|1758->461|1824->507|1905->562|1937->573|1966->575|2205->787|2220->793|2271->823|2616->1141|2631->1147|2690->1185|3460->1928|3497->1949|3536->1950|3578->1964|3792->2151|3819->2157|3864->2174|3939->2218|3978->2229|4572->2796|4608->2816|4647->2817|4689->2831|4903->3018|4930->3024|4975->3041|5050->3085|5089->3096|5456->3437|5490->3455|5529->3456|5568->3467|5744->3616|5759->3622|5816->3658|5988->3803|6001->3807|6032->3817|6404->4157|6450->4175
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|56->24|56->24|56->24|62->30|62->30|62->30|82->50|82->50|82->50|83->51|86->54|86->54|87->55|89->57|90->58|100->68|100->68|100->68|101->69|104->72|104->72|105->73|107->75|108->76|121->89|121->89|121->89|122->90|125->93|125->93|125->93|128->96|128->96|128->96|136->104|138->106
>>>>>>> 97995ab25d004ba6bd74582703152614fdf6978f
                  -- GENERATED --
              */
          