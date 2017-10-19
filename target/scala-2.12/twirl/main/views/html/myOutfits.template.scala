
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

object myOutfits extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(outfit: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
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
       
        <div class="col-sm-4 mb-5">
         <div class="card mr-5">
            <div class="text-center">
             """),_display_(/*33.15*/for(item <- outfit) yield /*33.34*/{_display_(Seq[Any](format.raw/*33.35*/("""
               """),format.raw/*34.16*/("""<a href="#"><img src=""""),_display_(/*34.39*/routes/*34.45*/.Assets.versioned(item.getPicture())),format.raw/*34.81*/("""" height="120" width="120"></a>
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""</div> 
            <div class="card-block">
               <h4 class="card-title ml-2">Your Outfit</h4>
               <button type="button" class="btn btn-secondary ml-3">Edit</button>
               <button type="button" class="btn btn-danger float-right mr-2" >Delete</button>
            </div>
            
         </div>
         </div>
         
      </div>


</main>

</body>

</html>
"""))
      }
    }
  }

  def render(outfit:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(outfit)

  def f:((List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (outfit) => apply(outfit)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 23:19:56 AEDT 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/myOutfits.scala.html
                  HASH: a6428ff5592bba8e63b5c5953f3deee380d8c178
                  MATRIX: 956->1|1071->21|1099->23|1241->139|1255->145|1324->193|1399->242|1413->248|1478->293|1553->342|1567->348|1633->394|1677->412|1691->418|1757->464|1838->519|1870->530|1899->532|2017->623|2032->629|2081->657|2370->919|2405->938|2444->939|2489->956|2539->979|2554->985|2611->1021|2688->1067|2730->1081
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|53->21|53->21|53->21|65->33|65->33|65->33|66->34|66->34|66->34|66->34|67->35|68->36
                  -- GENERATED --
              */
          