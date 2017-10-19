
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

object signUpPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.4*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8">
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*15.80*/("""{"""),format.raw/*15.81*/(""" """),format.raw/*15.82*/("""setTimeout(hideURLbar, 0); """),format.raw/*15.109*/("""}"""),format.raw/*15.110*/(""", false); function hideURLbar()"""),format.raw/*15.141*/("""{"""),format.raw/*15.142*/(""" """),format.raw/*15.143*/("""window.scrollTo(0,1); """),format.raw/*15.165*/("""}"""),format.raw/*15.166*/(""" """),format.raw/*15.167*/("""</script>
		  <link rel="stylesheet" media="screen" href=""""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/SignUp.css")),format.raw/*16.99*/("""" rel='stylesheet' type='text/css' />
		
</head>
 
<body>
	<div class="main">

				 <div class="inset">
				 	<div class="social-icons">
		    			 <div class="span"><a href="#"><img src=""""),_display_(/*25.52*/routes/*25.58*/.Assets.versioned("images/fb.png")),format.raw/*25.92*/("""" alt=""/><i>Connect with Facebook </i><div class="clear"></div></a></div>	
    					 <div class="span1"><a href="#"><img src=""""),_display_(/*26.53*/routes/*26.59*/.Assets.versioned("images/t-bird.png")),format.raw/*26.97*/("""" alt=""/><i>Connect with Twitter</i><div class="clear"></div></a></div>
    					 <div class="clear"></div>
					</div>
				 </div>	
				 <h2>Or sign up with</h2>
				 <form action=""""),_display_(/*31.21*/routes/*31.27*/.HomeController.signUp("a","b")),format.raw/*31.58*/("""">
							<div class="lable">
		                     	<input type="text" name = "name" placeholder="UserName" class="text" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*33.151*/("""{"""),format.raw/*33.152*/("""this.value = 'User Name';"""),format.raw/*33.177*/("""}"""),format.raw/*33.178*/("""" >

		                     
		                    </div>
		                    <div class="clear"> </div>
		                    <div class="lable-2">
		                    <input type="text" name = "password" class="text" placeholder="Password" onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*39.153*/("""{"""),format.raw/*39.154*/("""this.value = 'Password';"""),format.raw/*39.178*/("""}"""),format.raw/*39.179*/("""">
		                   
							</div>
							<div class="clear"> </div>
							
								 <div class="submit">
									<input type="submit" onclick="myFunction()" value="Create account" >
									
								</div>
									<div class="clear"> </div>
									
							 </form>
							 <a href=""""),_display_(/*51.19*/routes/*51.25*/.HomeController.signInPage()),format.raw/*51.53*/("""" >
										<input type="submit" onclick="myFunction()" value="Cancel" >
									</a>
	
	 
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
                  DATE: Thu Oct 19 23:01:28 AEDT 2017
                  SOURCE: /Users/RyanThai/Desktop/SENG2021/Project/ULook/app/views/signUpPage.scala.html
                  HASH: 76506e9dda77dab89d5694756886acc51afce669
                  MATRIX: 1200->260|1296->262|1324->264|1622->534|1651->535|1680->536|1736->563|1766->564|1826->595|1856->596|1886->597|1937->619|1967->620|1997->621|2083->680|2098->686|2162->729|2377->917|2392->923|2447->957|2602->1085|2617->1091|2676->1129|2887->1313|2902->1319|2954->1350|3163->1530|3193->1531|3247->1556|3277->1557|3609->1860|3639->1861|3692->1885|3722->1886|4043->2180|4058->2186|4107->2214
                  LINES: 33->7|38->7|40->9|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|56->25|56->25|56->25|57->26|57->26|57->26|62->31|62->31|62->31|64->33|64->33|64->33|64->33|70->39|70->39|70->39|70->39|82->51|82->51|82->51
                  -- GENERATED --
              */
          