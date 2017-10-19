
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/RyanThai/Desktop/SENG2021/Project/ULook/conf/routes
// @DATE:Thu Oct 19 23:01:28 AEDT 2017

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

  
    // @LINE:8
    def signInPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signInPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signInPage"})
        }
      """
    )
  
    // @LINE:18
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signIn",
      """
        function(name0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn" + _qS([(name0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)), (password1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1))])})
        }
      """
    )
  
    // @LINE:20
    def addToFavourite: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addToFavourite",
      """
        function(a0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToFavourite" + _qS([(a0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("a", a0))])})
        }
      """
    )
  
    // @LINE:10
    def myItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myItems",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myItems"})
        }
      """
    )
  
    // @LINE:16
    def approach2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.approach2",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "approach2" + _qS([(s0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s0))])})
        }
      """
    )
  
    // @LINE:9
    def signUpPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUpPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUpPage"})
        }
      """
    )
  
    // @LINE:12
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.search",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(s0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s0))])})
        }
      """
    )
  
    // @LINE:17
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUp",
      """
        function(name0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp" + _qS([(name0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)), (password1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1))])})
        }
      """
    )
  
    // @LINE:23
    def details: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.details",
      """
        function(a0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "details" + _qS([(a0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("a", a0))])})
        }
      """
    )
  
    // @LINE:11
    def recommend: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.recommend",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommend"})
        }
      """
    )
  
    // @LINE:21
    def removeFromFavourite: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.removeFromFavourite",
      """
        function(a0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeFromFavourite" + _qS([(a0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("a", a0))])})
        }
      """
    )
  
    // @LINE:19
    def addToOutfit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addToOutfit",
      """
        function(a0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToOutfit" + _qS([(a0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("a", a0))])})
        }
      """
    )
  
    // @LINE:22
    def deleteFromOutfit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteFromOutfit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteFromOutfit"})
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
  
    // @LINE:13
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
  
    // @LINE:15
    def approach1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.approach1",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "approach1" + _qS([(s0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("s", s0))])})
        }
      """
    )
  
    // @LINE:14
    def myOutfits: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myOutfits",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myOutfits"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
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
