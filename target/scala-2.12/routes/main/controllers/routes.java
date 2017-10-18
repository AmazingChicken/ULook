
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/mr_to/ULook/conf/routes
// @DATE:Tue Oct 17 21:13:27 AEDT 2017
=======
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Wed Oct 18 20:25:14 AEDT 2017
>>>>>>> 0658d712bff933720594ea339531680f87773bfe

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
