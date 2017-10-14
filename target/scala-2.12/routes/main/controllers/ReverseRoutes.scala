
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Sat Oct 14 15:22:15 AEDT 2017

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
  
    // @LINE:15
    def approach2(s:String = "a"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "approach2" + play.core.routing.queryString(List(if(s == "a") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)))))
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
  
    // @LINE:14
    def approach1(s:String = "a"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "approach1" + play.core.routing.queryString(List(if(s == "a") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("s", s)))))
    }
  
    // @LINE:13
    def myOutfits(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myOutfits")
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
