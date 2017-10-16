
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
   
 
   
      <form action=""""),_display_(/*27.22*/routes/*27.28*/.HomeController.approach1("a")),format.raw/*27.58*/("""">
      <div class="input-group stylish-input-group mt-2">
        <input type="search" class="form-control"  placeholder="Search by Item Name" onkeyup="myFunction()" name = "s" required>
        <span class="input-group-addon">
            <button type="submit">
            </form>
                <img src=""""),_display_(/*33.28*/routes/*33.34*/.Assets.versioned("images/search.png")),format.raw/*33.72*/("""" height="35" width="35">
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
             """),_display_(/*53.15*/for(option <- brands) yield /*53.36*/{_display_(Seq[Any](format.raw/*53.37*/("""
            """),format.raw/*54.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*57.17*/option),format.raw/*57.23*/("""
               """),format.raw/*58.16*/("""</label>
            </div> 
            """)))}),format.raw/*60.14*/("""
         """),format.raw/*61.10*/("""</div>
         <div class="card ml-3 mt-1">
            <form class="form-inline-sm mt-4 text-center">
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Minimum Price">
               <label class="sr-only" for="priceFrom">priceFrom</label>
               <label class="sr-only" for="priceTo">priceTo</label>
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Maximum Price">
            </form>
         </div>
         <div class="card ml-3 mt-1 scrollbox">
            """),_display_(/*71.14*/for(option <- types) yield /*71.34*/{_display_(Seq[Any](format.raw/*71.35*/("""
            """),format.raw/*72.13*/("""<div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               """),_display_(/*75.17*/option),format.raw/*75.23*/("""
               """),format.raw/*76.16*/("""</label>
            </div> 
            """)))}),format.raw/*78.14*/("""
         """),format.raw/*79.10*/("""</div>
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
      """),_display_(/*92.8*/for((name,image) <- images) yield /*92.35*/{_display_(Seq[Any](format.raw/*92.36*/("""
         """),format.raw/*93.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href="#"><img src=""""),_display_(/*96.42*/routes/*96.48*/.Assets.versioned(image)),format.raw/*96.72*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*99.48*/name),format.raw/*99.52*/("""</h4>
                  <div class="mb-2">
                     <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                     <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
                  </div>
               </div>
            </div>
         </div>
         """)))}),format.raw/*107.11*/("""
        
      """),format.raw/*109.7*/("""</div>
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
                  DATE: Mon Oct 16 11:52:44 GMT+11:00 2017
                  SOURCE: C:/Users/Administrator/ULook/app/views/myItems.scala.html
                  HASH: ce78635306a2a191b1816f727e0d1b9faeed7aea
                  MATRIX: 989->1|1157->74|1185->76|1327->192|1341->198|1410->246|1485->295|1499->301|1564->346|1639->395|1653->401|1719->447|1763->465|1777->471|1843->517|1924->572|1956->583|1985->585|2239->812|2254->818|2305->848|2650->1166|2665->1172|2724->1210|3494->1953|3531->1974|3570->1975|3612->1989|3826->2176|3853->2182|3898->2199|3973->2243|4012->2254|4606->2821|4642->2841|4681->2842|4723->2856|4937->3043|4964->3049|5009->3066|5084->3110|5123->3121|5490->3462|5533->3489|5572->3490|5611->3501|5787->3650|5802->3656|5847->3680|6019->3825|6044->3829|6416->4169|6462->4187
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|59->27|59->27|59->27|65->33|65->33|65->33|85->53|85->53|85->53|86->54|89->57|89->57|90->58|92->60|93->61|103->71|103->71|103->71|104->72|107->75|107->75|108->76|110->78|111->79|124->92|124->92|124->92|125->93|128->96|128->96|128->96|131->99|131->99|139->107|141->109
                  -- GENERATED --
              */
          