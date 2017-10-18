
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

object signInPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""
"""),format.raw/*8.1*/("""<link rel="shortcut icon" type="image/png; z-index:999" href=""""),_display_(/*8.64*/routes/*8.70*/.Assets.versioned("images/favicon.png")),format.raw/*8.109*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*9.46*/routes/*9.52*/.Assets.versioned("stylesheets/SignIn.css")),format.raw/*9.95*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*10.46*/routes/*10.52*/.Assets.versioned("stylesheets/button.css")),format.raw/*10.95*/("""">

<div id="loginform">
<div id="facebook"><i class="fa fa-facebook"></i><div id="connect">Connect with Facebook</div></div>
<div id="mainlogin">
<div id="or">or</div>
<h1>Log in with awesome new thing</h1>
<form action=""""),_display_(/*17.16*/routes/*17.22*/.HomeController.signIn("a","b")),format.raw/*17.53*/("""">
<input type="text" name = "name"placeholder="username or email" value="" required>
<input type="password" name = "password" placeholder="password" value="" required>
<button type="submit"><i class="fa fa-arrow-right"></i></button>
</form>
<div id="note"><a href="#">Forgot your password?</a></div>
<body style="margin-top:200px">
<div class="button gray"><div class="shine"></div><a href=""""),_display_(/*24.61*/routes/*24.67*/.HomeController.signUpPage()),format.raw/*24.95*/("""">Sign Up</a></div>


<div style="text-align:center;clear:both;">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</div></body>
</div>
</div>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 21:13:28 AEDT 2017
                  SOURCE: C:/Users/mr_to/ULook/app/views/signInPage.scala.html
                  HASH: 7492020a8bd7bd95de0bc0be2dd940fa02299c4c
                  MATRIX: 1217->266|1342->296|1370->298|1459->361|1473->367|1533->406|1608->455|1622->461|1685->504|1761->553|1776->559|1840->602|2097->832|2112->838|2164->869|2591->1269|2606->1275|2655->1303
                  LINES: 33->7|38->7|39->8|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|48->17|48->17|48->17|55->24|55->24|55->24
                  -- GENERATED --
              */
          