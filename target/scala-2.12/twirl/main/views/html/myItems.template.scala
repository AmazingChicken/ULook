
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

object myItems extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
            <div class="form-check form-inline mt-2 mb-2">
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
               <a href="#"><img src=""""),_display_(/*160.39*/routes/*160.45*/.Assets.versioned("images/roshe.jpg")),format.raw/*160.82*/("""" height="200" width="200"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">Nike Roshe</h4>
               <div class="mb-2">
                  <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                  <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
               </div>
            </div>
         </div>
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*172.39*/routes/*172.45*/.Assets.versioned("images/boot.jpg")),format.raw/*172.81*/("""" height="200" width="200"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">Cool Boot</h4>
               <div class="mb-2">
                  <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                  <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
               </div>
            </div>
         </div>
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*184.39*/routes/*184.45*/.Assets.versioned("images/chucks.jpg")),format.raw/*184.83*/("""" height="200" width="200"></a>
            </div> 
            <div class="card-block ">
               <h4 class="card-title ml-2">Chucks</h4>
               <div class="mb-2">
                  <button type="button" class="btn btn-secondary ml-2">Add to Outfit</button>
                  <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
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
                  DATE: Mon Oct 09 16:57:22 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/myItems.scala.html
                  HASH: 8266f9b8971e9127d64870da8948964dffdd3784
                  MATRIX: 1032->0|1174->116|1188->122|1257->170|1332->219|1346->225|1411->270|1486->319|1500->325|1566->371|1610->389|1624->395|1690->441|1771->496|1803->507|1832->509|2315->965|2330->971|2389->1009|7716->6308|7732->6314|7791->6351|8370->6902|8386->6908|8444->6944|9022->7494|9038->7500|9098->7538
                  LINES: 33->1|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|45->13|45->13|46->14|63->31|63->31|63->31|192->160|192->160|192->160|204->172|204->172|204->172|216->184|216->184|216->184
                  -- GENERATED --
              */
          