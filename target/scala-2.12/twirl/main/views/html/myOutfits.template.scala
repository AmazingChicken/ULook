
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

object myOutfits extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <h2>My Outfits</h2>
    <a href="javascript:void(0);">Sign in</a>
   </div>
   <div class="container-fluid">
   <div class="container">
   

   
      <div class="input-group stylish-input-group mt-2">
        <input type="text" class="form-control"  placeholder="Search by Outfit Name" >
        <span class="input-group-addon">
            <button type="submit">
                <img src=""""),_display_(/*31.28*/routes/*31.34*/.Assets.versioned("images/search.png")),format.raw/*31.72*/("""" height="35" width="35">
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
               <a href="#"><img src=""""),_display_(/*129.39*/routes/*129.45*/.Assets.versioned("images/hat.jpg")),format.raw/*129.80*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*130.39*/routes/*130.45*/.Assets.versioned("images/shirt.jpg")),format.raw/*130.82*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*131.39*/routes/*131.45*/.Assets.versioned("images/pants.jpg")),format.raw/*131.82*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*132.39*/routes/*132.45*/.Assets.versioned("images/boot.jpg")),format.raw/*132.81*/("""" height="120" width="120"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">Outfit 1</h4>
               <button type="button" class="btn btn-secondary ml-3">Edit</button>
               <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
            </div>
            <a href="#" class="ml-2"><img src=""""),_display_(/*139.49*/routes/*139.55*/.Assets.versioned("images/share.png")),format.raw/*139.92*/("""" height="50" width="150"></a>
         </div>
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*143.39*/routes/*143.45*/.Assets.versioned("images/hat.jpg")),format.raw/*143.80*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*144.39*/routes/*144.45*/.Assets.versioned("images/shirt.jpg")),format.raw/*144.82*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*145.39*/routes/*145.45*/.Assets.versioned("images/pants.jpg")),format.raw/*145.82*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*146.39*/routes/*146.45*/.Assets.versioned("images/boot.jpg")),format.raw/*146.81*/("""" height="120" width="120"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">Cool Outfit</h4>
               <button type="button" class="btn btn-secondary ml-3">Edit</button>
               <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
            </div>
            <a href="#" class="ml-2"><img src=""""),_display_(/*153.49*/routes/*153.55*/.Assets.versioned("images/share.png")),format.raw/*153.92*/("""" height="50" width="150"></a>
         </div>
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*157.39*/routes/*157.45*/.Assets.versioned("images/hat.jpg")),format.raw/*157.80*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*158.39*/routes/*158.45*/.Assets.versioned("images/shirt.jpg")),format.raw/*158.82*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*159.39*/routes/*159.45*/.Assets.versioned("images/pants.jpg")),format.raw/*159.82*/("""" height="120" width="120"></a>
               <a href="#"><img src=""""),_display_(/*160.39*/routes/*160.45*/.Assets.versioned("images/boot.jpg")),format.raw/*160.81*/("""" height="120" width="120"></a>
            </div> 
            <div class="card-block ">
               <h4 class="card-title ml-2">Outfit 3</h4>
               <button type="button" class="btn btn-secondary ml-3">Edit</button>
               <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
            </div>
            <a href="#" class="ml-2"><img src=""""),_display_(/*167.49*/routes/*167.55*/.Assets.versioned("images/share.png")),format.raw/*167.92*/("""" height="50" width="150"></a>          
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
                  DATE: Tue Oct 10 16:18:37 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/myOutfits.scala.html
                  HASH: 8c1f976cf0842f2819a591add88396ea77baeaea
                  MATRIX: 1034->0|1176->116|1190->122|1259->170|1334->219|1348->225|1413->270|1488->319|1502->325|1568->371|1612->389|1626->395|1692->441|1773->496|1805->507|1834->509|2321->969|2336->975|2395->1013|6446->5036|6462->5042|6519->5077|6618->5148|6634->5154|6693->5191|6792->5262|6808->5268|6867->5305|6966->5376|6982->5382|7040->5418|7464->5814|7480->5820|7539->5857|7727->6017|7743->6023|7800->6058|7899->6129|7915->6135|7974->6172|8073->6243|8089->6249|8148->6286|8247->6357|8263->6363|8321->6399|8748->6798|8764->6804|8823->6841|9011->7001|9027->7007|9084->7042|9183->7113|9199->7119|9258->7156|9357->7227|9373->7233|9432->7270|9531->7341|9547->7347|9605->7383|10030->7780|10046->7786|10105->7823
                  LINES: 33->1|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|45->13|45->13|46->14|63->31|63->31|63->31|161->129|161->129|161->129|162->130|162->130|162->130|163->131|163->131|163->131|164->132|164->132|164->132|171->139|171->139|171->139|175->143|175->143|175->143|176->144|176->144|176->144|177->145|177->145|177->145|178->146|178->146|178->146|185->153|185->153|185->153|189->157|189->157|189->157|190->158|190->158|190->158|191->159|191->159|191->159|192->160|192->160|192->160|199->167|199->167|199->167
                  -- GENERATED --
              */
          