
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/RyanThai/Desktop/SENG2021/Project/ULook/conf/routes
// @DATE:Thu Oct 19 23:01:28 AEDT 2017


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
