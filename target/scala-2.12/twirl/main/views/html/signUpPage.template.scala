
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
<html lang="en">
    <head>
        <title>myULook</title>
                <link rel="stylesheet" media="screen" href=""""),_display_(/*13.62*/routes/*13.68*/.Assets.versioned("stylesheets/mainPageandSignUp1.css")),format.raw/*13.123*/("""">
	</head>
		<body>
 			<ul id="tools">
				<li>
                      Already have account? sign in here <input type="submit" value="Sign in" />
                      </form>
                </li>
            </ul>
	<center>
		<h1>Welcome to ULook!</h1>
		<hr>

	</center>

	<h1>Sign Up</h1>
		<hr>
			<form>
			<table width="0" border="0" cellspacing="0" cellpadding="0">
			<tr>
			<td>username：</td>
			<td><input type="text" name="username"/></td>
		</tr>
		<tr>
			<td>password： </td>
			<td><input type="password" name="password"/></td>
		</tr>

		<tr>
			<td>Please enter your password again：</td>
			<td><input type="password" name="confirmpass"/></td>
		</tr>

		<tr>
			<td>Email Adress：</td>
			<td><input type="text" name="Email"/></td>
		</tr>


		<tr>
			<td colspan="2"><input type="submit" value="submit"/>
			<input type="submit" value="cancel"/> 
			</td>
		</tr>
		</table>
		</form>
		<center>
			
					<input type="button" value="Begin browsing" style="height=200px;width=1000px;" /> 
		

 



        <script src=""""),_display_(/*68.23*/routes/*68.29*/.Assets.versioned("javascripts/main.js")),format.raw/*68.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Sep 21 19:23:33 AEST 2017
                  SOURCE: C:/Users/Daniel/ULook/app/views/signUpPage.scala.html
                  HASH: b08ad6f933cc82f2aa4ae897bcaaa2c0fe1e762e
                  MATRIX: 1205->266|1301->268|1331->272|1498->412|1513->418|1590->473|2711->1567|2726->1573|2787->1613
                  LINES: 33->7|38->7|40->9|44->13|44->13|44->13|99->68|99->68|99->68
                  -- GENERATED --
              */
          