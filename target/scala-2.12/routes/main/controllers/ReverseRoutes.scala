
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mr_to/ULook/conf/routes
// @DATE:Thu Oct 19 02:14:35 AEDT 2017

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

  
    // @LINE:16
    def signIn(name:String = "a", password:String = "b"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn" + play.core.routing.queryString(List(if(name == "a") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), if(password == "b") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:9
    def myItems(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "myItems")
    }
  
    // @LINE:8
    def signUpPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUpPage")
    }
  
    // @LINE:15
    def signUp(name:String = "a", password:String = "b"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUp" + play.core.routing.queryString(List(if(name == "a") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), if(password == "b") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:10
    def recommend(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recommend")
    }
  
    // @LINE:11
    def search(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:17
    def addToOutfit(a:String = "a"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToOutfit" + play.core.routing.queryString(List(if(a == "a") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("a", a)))))
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

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
