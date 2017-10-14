
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<span class="bckg"></span>
<head>
<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*5.100*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.versioned("stylesheets/mainPage.css")),format.raw/*6.97*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*7.46*/routes/*7.52*/.Assets.versioned("stylesheets/searchbar.css")),format.raw/*7.98*/("""">
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*8.67*/(""""></script>

</head>
<header>
  <h1>ULook</h1>
  """),_display_(/*13.4*/navigator()),format.raw/*13.15*/("""
"""),format.raw/*14.1*/("""</header>
<body>
<main>

  <div class="title">
    <h2>Search</h2>
    <a href="javascript:void(0);">Sign in</a>
   </div>
   <div class="container-fluid">
   <div class="container">
   

      <form action=""""),_display_(/*26.22*/routes/*26.28*/.HomeController.approach1("a")),format.raw/*26.58*/("""">
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
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option1
               </label>
            </div>            
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option2
               </label>
            </div>   
         </div>
         <div class="card ml-3 mt-1">
            <form class="form-inline-sm mt-4 text-center">
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Minimum Price">
               <label class="sr-only" for="priceFrom">priceFrom</label>
               <label class="sr-only" for="priceTo">priceTo</label>
               <input type="text" class="form-control-sm" id="inlineFormInput" placeholder="Maximum Price">
            </form>
         </div>
         <div class="card ml-3 mt-1 scrollbox">
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option2
               </label>
            </div> 
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option2
               </label>
            </div> 
            <div class="form-check form-inline mt-2 mb-2">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option2
               </label>
            </div> 
            <div class="form-check form-inline mt-2 mb-2 ">
               <label class="form-check-label">
               <input class="form-check-input" type="checkbox" value="">
               Option2
               </label>
            </div> 
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
   
   
      <div class="card-deck mt-4 ml-5 mb-4 mr-1">
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*162.39*/routes/*162.45*/.Assets.versioned("images/roshe.jpg")),format.raw/*162.82*/("""" height="200" width="200"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">Nike Roshe</h4>
               <div class="mb-2">
                  <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                  <button type="button" class="btn btn-success float-right mr-2" >Favourite</button>
               </div>
            </div>
         </div>
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*174.39*/routes/*174.45*/.Assets.versioned("images/boot.jpg")),format.raw/*174.81*/("""" height="200" width="200"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">Cool Boot</h4>
               <div class="mb-2">
                  <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                  <button type="button" class="btn btn-success float-right mr-2" >Favourite</button>
               </div>
            </div>
         </div>
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*186.39*/routes/*186.45*/.Assets.versioned("images/chucks.jpg")),format.raw/*186.83*/("""" height="200" width="200"></a>
            </div> 
            <div class="card-block ">
               <h4 class="card-title ml-2">Chucks</h4>
               <div class="mb-2">
                  <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                  <button type="button" class="btn btn-success float-right mr-2" >Favourite</button>
               </div>
            </div>       
         </div>
      </div>
   </div>

</main>
</body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 15:22:15 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/search.scala.html
                  HASH: 43243bb3c381873e7fe82d53aa8a381ec9cd66d3
                  MATRIX: 1031->0|1173->116|1187->122|1256->170|1331->219|1345->225|1410->270|1485->319|1499->325|1565->371|1609->389|1623->395|1689->441|1770->496|1802->507|1831->509|2079->730|2094->736|2145->766|2495->1089|2510->1095|2569->1133|7897->6433|7913->6439|7972->6476|8555->7031|8571->7037|8629->7073|9211->7627|9227->7633|9287->7671
                  LINES: 33->1|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|45->13|45->13|46->14|58->26|58->26|58->26|65->33|65->33|65->33|194->162|194->162|194->162|206->174|206->174|206->174|218->186|218->186|218->186
                  -- GENERATED --
              */
          