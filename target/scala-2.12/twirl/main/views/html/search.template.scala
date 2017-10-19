
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
 <a href=""""),_display_(/*20.12*/routes/*20.18*/.HomeController.signInPage()),format.raw/*20.46*/("""">Sign out</a>
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
<div class="dropdown">
  <button class="dropbtn">Category</button>
  <div class="dropdown-content">
    <a href=""""),_display_(/*40.15*/routes/*40.21*/.HomeController.search("Hats")),format.raw/*40.51*/("""">Hats</a>
    <a href=""""),_display_(/*41.15*/routes/*41.21*/.HomeController.search("Tops")),format.raw/*41.51*/("""">Tops</a>
    <a href=""""),_display_(/*42.15*/routes/*42.21*/.HomeController.search("Bottoms")),format.raw/*42.54*/("""">Bottoms</a>
    <a href=""""),_display_(/*43.15*/routes/*43.21*/.HomeController.search("Shoes")),format.raw/*43.52*/("""">Footwear</a>
  </div>
</div>
       

   </div>
  
   
   
      <div class="row mt-4 ml-5 mb-4 mr-1">
      """),_display_(/*53.8*/for(item <- items) yield /*53.26*/{_display_(Seq[Any](format.raw/*53.27*/("""
         """),format.raw/*54.10*/("""<div class="col-sm-4 mb-5">
            <div class="card mr-5">
               <div class="text-center">
                  <a href=""""),_display_(/*57.29*/routes/*57.35*/.HomeController.details(item.getName())),format.raw/*57.74*/(""""><img src=""""),_display_(/*57.87*/routes/*57.93*/.Assets.versioned(item.getPicture())),format.raw/*57.129*/("""" height="200" width="200"></a>
               </div> 
               <div class="card-block">
                  <h4 class="card-title ml-2">"""),_display_(/*60.48*/item/*60.52*/.getName()),format.raw/*60.62*/("""</h4>
                  <div class="mb-2">
                     <a href=""""),_display_(/*62.32*/routes/*62.38*/.HomeController.addToOutfit(item.getName())),format.raw/*62.81*/("""" class="btn btn-success float-right mr-2">Add to Outfit</a>
                      <a href=""""),_display_(/*63.33*/routes/*63.39*/.HomeController.addToFavourite(item.getName())),format.raw/*63.85*/("""" class="btn btn-success float-right mr-2">Save</a>
                     
                  </div>
               </div>
            </div>
         </div>
         """)))}),format.raw/*69.11*/("""
        
      """),format.raw/*71.7*/("""</div>


</main>

</body>

</html>
"""))
      }
    }
  }

  def render(items:List[Item],brands:List[String],types:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(items,brands,types)

  def f:((List[Item],List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (items,brands,types) => apply(items,brands,types)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 19 23:01:28 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/search.scala.html
                  HASH: 837716cf65f5d61af2476810116f9a8c4a96209e
                  MATRIX: 979->1|1137->64|1165->66|1307->182|1321->188|1390->236|1465->285|1479->291|1544->336|1619->385|1633->391|1699->437|1743->455|1757->461|1823->507|1904->562|1936->573|1965->575|2074->657|2089->663|2138->691|2275->801|2290->807|2341->837|2686->1155|2701->1161|2760->1199|3038->1450|3053->1456|3104->1486|3157->1512|3172->1518|3223->1548|3276->1574|3291->1580|3345->1613|3401->1642|3416->1648|3468->1679|3616->1801|3650->1819|3689->1820|3728->1831|3891->1967|3906->1973|3966->2012|4006->2025|4021->2031|4079->2067|4251->2212|4264->2216|4295->2226|4398->2302|4413->2308|4477->2351|4598->2445|4613->2451|4680->2497|4883->2669|4928->2687
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|46->14|46->14|47->15|52->20|52->20|52->20|56->24|56->24|56->24|62->30|62->30|62->30|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|85->53|85->53|85->53|86->54|89->57|89->57|89->57|89->57|89->57|89->57|92->60|92->60|92->60|94->62|94->62|94->62|95->63|95->63|95->63|101->69|103->71
                  -- GENERATED --
              */
          