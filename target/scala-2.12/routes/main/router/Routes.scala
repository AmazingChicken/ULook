
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mr_to/ULook/conf/routes
// @DATE:Tue Oct 17 21:13:27 AEDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:18
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:18
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mainPage""", """controllers.HomeController.goMainPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUpPage""", """controllers.HomeController.signUpPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myItems""", """controllers.HomeController.myItems"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommend""", """controllers.HomeController.recommend"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.HomeController.search"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getInspired""", """controllers.HomeController.getInspired"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myOutfits""", """controllers.HomeController.myOutfits"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """approach1""", """controllers.HomeController.approach1(s:String ?= "a")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.HomeController.signUp(name:String ?= "a", password:String ?= "b")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.HomeController.signIn(name:String ?= "a", password:String ?= "b")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_goMainPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mainPage")))
  )
  private[this] lazy val controllers_HomeController_goMainPage1_invoker = createInvoker(
    HomeController_0.goMainPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "goMainPage",
      Nil,
      "GET",
      this.prefix + """mainPage""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_signUpPage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUpPage")))
  )
  private[this] lazy val controllers_HomeController_signUpPage2_invoker = createInvoker(
    HomeController_0.signUpPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signUpPage",
      Nil,
      "GET",
      this.prefix + """signUpPage""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_myItems3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myItems")))
  )
  private[this] lazy val controllers_HomeController_myItems3_invoker = createInvoker(
    HomeController_0.myItems,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myItems",
      Nil,
      "GET",
      this.prefix + """myItems""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_recommend4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommend")))
  )
  private[this] lazy val controllers_HomeController_recommend4_invoker = createInvoker(
    HomeController_0.recommend,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "recommend",
      Nil,
      "GET",
      this.prefix + """recommend""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_search5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_HomeController_search5_invoker = createInvoker(
    HomeController_0.search,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "search",
      Nil,
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_getInspired6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getInspired")))
  )
  private[this] lazy val controllers_HomeController_getInspired6_invoker = createInvoker(
    HomeController_0.getInspired,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getInspired",
      Nil,
      "GET",
      this.prefix + """getInspired""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_myOutfits7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myOutfits")))
  )
  private[this] lazy val controllers_HomeController_myOutfits7_invoker = createInvoker(
    HomeController_0.myOutfits,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myOutfits",
      Nil,
      "GET",
      this.prefix + """myOutfits""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_approach18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("approach1")))
  )
  private[this] lazy val controllers_HomeController_approach18_invoker = createInvoker(
    HomeController_0.approach1(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "approach1",
      Seq(classOf[String]),
      "GET",
      this.prefix + """approach1""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_signUp9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_HomeController_signUp9_invoker = createInvoker(
    HomeController_0.signUp(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signUp",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_signIn10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_HomeController_signIn10_invoker = createInvoker(
    HomeController_0.signIn(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signIn",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_goMainPage1_route(params) =>
      call { 
        controllers_HomeController_goMainPage1_invoker.call(HomeController_0.goMainPage)
      }
  
    // @LINE:8
    case controllers_HomeController_signUpPage2_route(params) =>
      call { 
        controllers_HomeController_signUpPage2_invoker.call(HomeController_0.signUpPage)
      }
  
    // @LINE:9
    case controllers_HomeController_myItems3_route(params) =>
      call { 
        controllers_HomeController_myItems3_invoker.call(HomeController_0.myItems)
      }
  
    // @LINE:10
    case controllers_HomeController_recommend4_route(params) =>
      call { 
        controllers_HomeController_recommend4_invoker.call(HomeController_0.recommend)
      }
  
    // @LINE:11
    case controllers_HomeController_search5_route(params) =>
      call { 
        controllers_HomeController_search5_invoker.call(HomeController_0.search)
      }
  
    // @LINE:12
    case controllers_HomeController_getInspired6_route(params) =>
      call { 
        controllers_HomeController_getInspired6_invoker.call(HomeController_0.getInspired)
      }
  
    // @LINE:13
    case controllers_HomeController_myOutfits7_route(params) =>
      call { 
        controllers_HomeController_myOutfits7_invoker.call(HomeController_0.myOutfits)
      }
  
    // @LINE:14
    case controllers_HomeController_approach18_route(params) =>
      call(params.fromQuery[String]("s", Some("a"))) { (s) =>
        controllers_HomeController_approach18_invoker.call(HomeController_0.approach1(s))
      }
  
    // @LINE:15
    case controllers_HomeController_signUp9_route(params) =>
      call(params.fromQuery[String]("name", Some("a")), params.fromQuery[String]("password", Some("b"))) { (name, password) =>
        controllers_HomeController_signUp9_invoker.call(HomeController_0.signUp(name, password))
      }
  
    // @LINE:16
    case controllers_HomeController_signIn10_route(params) =>
      call(params.fromQuery[String]("name", Some("a")), params.fromQuery[String]("password", Some("b"))) { (name, password) =>
        controllers_HomeController_signIn10_invoker.call(HomeController_0.signIn(name, password))
      }
  
    // @LINE:18
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
