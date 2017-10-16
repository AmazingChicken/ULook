
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrator/ULook/conf/routes
// @DATE:Mon Oct 16 11:52:42 GMT+11:00 2017


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
