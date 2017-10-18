
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
      """),_display_(/*92.8*/for(item <- items) yield /*92.26*/{_display_(Seq[Any](format.raw/*92.27*/("""
         """),format.raw/*93.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href="#"><img src=""""),_display_(/*96.42*/routes/*96.48*/.Assets.versioned(item.getPicture())),format.raw/*96.84*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*99.48*/item/*99.52*/.getName()),format.raw/*99.62*/("""</h4>
                  <div class="mb-2">
                     <a href=""""),_display_(/*101.32*/routes/*101.38*/.HomeController.addToOutfit(item.getName())),format.raw/*101.81*/("""" class="btn btn-success float-right mr-2">Add to Outfit</a>
                     <button type="button" class="btn btn-success float-right mr-2" >Save</button>
                  </div>
               </div>
            </div>
         </div>
         """)))}),format.raw/*107.11*/("""
        
      """),format.raw/*109.7*/("""</div>


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
                  DATE: Thu Oct 19 02:14:36 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/search.scala.html
                  HASH: b6cf144ad3d4efc827e18ced053bf3b0d56173ad
                  MATRIX: 979->1|1137->64|1165->66|1307->182|1321->188|1390->236|1465->285|1479->291|1544->336|1619->385|1633->391|1699->437|1743->455|1757->461|1823->507|1904->562|1936->573|1965->575|2217->800|2232->806|2283->836|2628->1154|2643->1160|2702->1198|3472->1941|3509->1962|3548->1963|3590->1977|3804->2164|3831->2170|3876->2187|3951->2231|3990->2242|4584->2809|4620->2829|4659->2830|4701->2844|4915->3031|4942->3037|4987->3054|5062->3098|5101->3109|5468->3450|5502->3468|5541->3469|5580->3480|5756->3629|5771->3635|5828->3671|6000->3816|6013->3820|6044->3830|6148->3906|6164->3912|6229->3955|6519->4213|6565->4231
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|59->27|59->27|59->27|65->33|65->33|65->33|85->53|85->53|85->53|86->54|89->57|89->57|90->58|92->60|93->61|103->71|103->71|103->71|104->72|107->75|107->75|108->76|110->78|111->79|124->92|124->92|124->92|125->93|128->96|128->96|128->96|131->99|131->99|131->99|133->101|133->101|133->101|139->107|141->109
                  -- GENERATED --
              */
          