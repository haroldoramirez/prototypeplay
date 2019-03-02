// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/haroldo/projetos/prototypeplay/conf/routes
// @DATE:Sat Mar 02 11:15:14 BRT 2019


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
