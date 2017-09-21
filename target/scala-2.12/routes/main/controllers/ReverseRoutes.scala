
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Thu Sep 21 19:31:15 AEST 2017

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
  
    // @LINE:7
    def goMainPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mainPage")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
