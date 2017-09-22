
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/RyanThai/Desktop/ULook/conf/routes
// @DATE:Fri Sep 22 10:16:49 AEST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def myItems(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myItems")
    }
  
    // @LINE:8
    def signUpPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUpPage")
    }
  
    // @LINE:10
    def recommend(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recommend")
    }
  
    // @LINE:11
    def search(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:7
    def goMainPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mainPage")
    }
  
    // @LINE:12
    def getInspired(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getInspired")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
