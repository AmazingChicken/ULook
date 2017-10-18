
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/mr_to/ULook/conf/routes
// @DATE:Thu Oct 19 02:14:35 AEDT 2017
=======
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Thu Oct 19 01:47:32 AEDT 2017
>>>>>>> 5155b89c33441a7e39683978ae241d49abbd19f7


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
