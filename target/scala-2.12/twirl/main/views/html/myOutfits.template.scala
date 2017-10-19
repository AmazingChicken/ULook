
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

object myOutfits extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],List[Outfit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(occasion: List[String],outfits :List[Outfit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""
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
    <a href=""""),_display_(/*21.15*/routes/*21.21*/.HomeController.signInPage()),format.raw/*21.49*/("""">Sign out</a>
   </div>
   <div class="container-fluid">
   </div>
   

   
      <div class="row mt-4 ml-5 mb-4 mr-1">
       """),_display_(/*29.9*/for(outfit<- outfits) yield /*29.30*/{_display_(Seq[Any](format.raw/*29.31*/("""
        """),format.raw/*30.9*/("""<div class="col-sm-4 mb-5">
         <div class="card mr-5">
            <div class="text-center">
               <a href="#"><img src=""""),_display_(/*33.39*/routes/*33.45*/.Assets.versioned(outfit.getHat())),format.raw/*33.79*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*34.42*/routes/*34.48*/.Assets.versioned(outfit.getTop())),format.raw/*34.82*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*35.42*/routes/*35.48*/.Assets.versioned(outfit.getBottom())),format.raw/*35.85*/("""" height="120" width="120"></a>
                  <a href="#"><img src=""""),_display_(/*36.42*/routes/*36.48*/.Assets.versioned(outfit.getShoes())),format.raw/*36.84*/("""" height="120" width="120"></a>
            </div> 
            <div class="card-block">
               <h4 class="card-title ml-2">"""),_display_(/*39.45*/outfit/*39.51*/.getName()),format.raw/*39.61*/("""</h4>
               <button type="button" class="btn btn-secondary ml-3">Edit</button>
                <a href=""""),_display_(/*41.27*/routes/*41.33*/.HomeController.deleteFromOutfit()),format.raw/*41.67*/("""" >
               <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
               </a>

            </div>
            <a href="#" class="ml-2"><img src=""""),_display_(/*46.49*/routes/*46.55*/.Assets.versioned("images/share.png")),format.raw/*46.92*/("""" height="50" width="150"></a>
         </div>
         </div>
         """)))}),format.raw/*49.11*/("""
      """),format.raw/*50.7*/("""</div>


</main>

</body>

</html>
"""))
      }
    }
  }

  def render(occasion:List[String],outfits:List[Outfit]): play.twirl.api.HtmlFormat.Appendable = apply(occasion,outfits)

  def f:((List[String],List[Outfit]) => play.twirl.api.HtmlFormat.Appendable) = (occasion,outfits) => apply(occasion,outfits)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 23:01:28 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/myOutfits.scala.html
                  HASH: 660fdb56297babbe1502196ad427f597ccfb33ec
                  MATRIX: 971->1|1112->47|1139->48|1277->160|1291->166|1360->214|1434->262|1448->268|1513->313|1587->361|1601->367|1667->413|1710->430|1724->436|1790->482|1866->532|1898->543|1926->544|2038->629|2053->635|2102->663|2257->792|2294->813|2333->814|2369->823|2533->960|2548->966|2603->1000|2703->1073|2718->1079|2773->1113|2873->1186|2888->1192|2946->1229|3046->1302|3061->1308|3118->1344|3278->1477|3293->1483|3324->1493|3465->1607|3480->1613|3535->1647|3748->1833|3763->1839|3821->1876|3925->1949|3959->1956
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|53->21|53->21|53->21|61->29|61->29|61->29|62->30|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|71->39|71->39|71->39|73->41|73->41|73->41|78->46|78->46|78->46|81->49|82->50
                  -- GENERATED --
              */
          