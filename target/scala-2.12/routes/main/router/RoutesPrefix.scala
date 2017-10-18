
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/mr_to/ULook/conf/routes
// @DATE:Tue Oct 17 21:13:27 AEDT 2017
=======
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Wed Oct 18 20:25:14 AEDT 2017
>>>>>>> 0658d712bff933720594ea339531680f87773bfe


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
