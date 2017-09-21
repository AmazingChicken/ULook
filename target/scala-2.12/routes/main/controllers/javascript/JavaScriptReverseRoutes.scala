
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Thu Sep 21 22:46:18 AEST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def myItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myItems",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myItems"})
        }
      """
    )
  
    // @LINE:8
    def signUpPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUpPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUpPage"})
        }
      """
    )
  
    // @LINE:10
    def recommend: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.recommend",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommend"})
        }
      """
    )
  
    // @LINE:7
    def goMainPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.goMainPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainPage"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
