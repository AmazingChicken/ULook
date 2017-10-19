
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/mr_to/ULook/conf/routes
// @DATE:Thu Oct 19 02:24:10 AEDT 2017
=======
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Thu Oct 19 16:28:14 AEDT 2017
>>>>>>> 97995ab25d004ba6bd74582703152614fdf6978f


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
