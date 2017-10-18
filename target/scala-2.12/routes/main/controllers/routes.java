
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/mr_to/ULook/conf/routes
// @DATE:Thu Oct 19 02:14:35 AEDT 2017
=======
// @SOURCE:C:/Users/Daniel/ULook/conf/routes
// @DATE:Thu Oct 19 01:47:32 AEDT 2017
>>>>>>> 5155b89c33441a7e39683978ae241d49abbd19f7

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
