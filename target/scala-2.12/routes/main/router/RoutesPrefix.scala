
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mr_to/ULook/conf/routes
// @DATE:Tue Oct 17 21:13:27 AEDT 2017


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
