
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Thu Oct 19 01:47:32 AEDT 2017

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

  
    // @LINE:16
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signIn",
      """
        function(name0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn" + _qS([(name0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)), (password1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1))])})
        }
      """
    )
  
    // @LINE:18
    def addToFavourite: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addToFavourite",
      """
        function(a0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToFavourite" + _qS([(a0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("a", a0))])})
        }
      """
    )
  
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
  
    // @LINE:15
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUp",
      """
        function(name0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp" + _qS([(name0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)), (password1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1))])})
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
  
    // @LINE:11
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.search",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:17
    def addToOutfit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addToOutfit",
      """
        function(a0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToOutfit" + _qS([(a0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("a", a0))])})
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
  
    // @LINE:12
    def getInspired: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getInspired",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getInspired"})
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
  
    // @LINE:14
    def approach1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.approach1",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "approach1" + _qS([(s0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s0))])})
        }
      """
    )
  
    // @LINE:13
    def myOutfits: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myOutfits",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myOutfits"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
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
