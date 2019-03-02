
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="material-lite">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Material Lite Angular Admin Theme">
    <meta name="author" content="Theme Guys - The Netherlands">

    <title>Material Lite</title>

    <link href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!-- build:css css/vendors.min.css -->
    """),format.raw/*17.29*/("""
    """),format.raw/*18.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*18.50*/routes/*18.56*/.Assets.versioned("bower_components/angular-ui-select/dist/select.css")),format.raw/*18.127*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*19.50*/routes/*19.56*/.Assets.versioned("stylesheets/select2.css")),format.raw/*19.100*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*21.50*/routes/*21.56*/.Assets.versioned("bower_components/ng-wig/dist/css/ng-wig.css")),format.raw/*21.120*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*23.50*/routes/*23.56*/.Assets.versioned("bower_components/ng-table/dist/ng-table.css")),format.raw/*23.120*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*25.50*/routes/*25.56*/.Assets.versioned("bower_components/pikaday/css/pikaday.css")),format.raw/*25.117*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*27.50*/routes/*27.56*/.Assets.versioned("bower_components/c3/c3.css")),format.raw/*27.103*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*28.50*/routes/*28.56*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.css")),format.raw/*28.127*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*30.50*/routes/*30.56*/.Assets.versioned("bower_components/animate.css/animate.css")),format.raw/*30.117*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*32.50*/routes/*32.56*/.Assets.versioned("stylesheets/material-lite-blank.css")),format.raw/*32.112*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*34.50*/routes/*34.56*/.Assets.versioned("stylesheets/helpers.css")),format.raw/*34.100*/("""">


      <!-- IE Compatibility shims -->
      <!--[if lt IE 9]>
  <script app="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
  <![endif]-->
      <!--[if IE]>
  <script app="//cdnjs.cloudflare.com/ajax/libs/es5-shim/4.1.7/es5-shim.min.js"></script>
  <script app="//cdnjs.cloudflare.com/ajax/libs/classlist/2014.01.31/classList.min.js"></script>
  <script app="//cdnjs.cloudflare.com/ajax/libs/selectivizr/1.0.2/selectivizr-min.js"></script>
  <script app="//cdnjs.cloudflare.com/ajax/libs/flexie/1.0.3/flexie.min.js"></script>
  <![endif]-->
      <!-- end shims -->

  </head>

  <body ng-controller="MainController">
    <div id="app" class="app" ng-include="'assets/app/tpl/demo/app.html'"></div>

    <script src=""""),_display_(/*54.19*/routes/*54.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*54.95*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*55.19*/routes/*55.25*/.Assets.versioned("bower_components/angular/angular.js")),format.raw/*55.81*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*56.19*/routes/*56.25*/.Assets.versioned("bower_components/angular-route/angular-route.js")),format.raw/*56.93*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*57.19*/routes/*57.25*/.Assets.versioned("bower_components/angular-animate/angular-animate.js")),format.raw/*57.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*58.19*/routes/*58.25*/.Assets.versioned("bower_components/angular-ui-select/dist/select.js")),format.raw/*58.95*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*59.19*/routes/*59.25*/.Assets.versioned("bower_components/angular-sanitize/angular-sanitize.js")),format.raw/*59.99*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*60.19*/routes/*60.25*/.Assets.versioned("bower_components/angular-local-storage/dist/angular-local-storage.js")),format.raw/*60.114*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*61.19*/routes/*61.25*/.Assets.versioned("bower_components/lodash/dist/lodash.min.js")),format.raw/*61.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("bower_components/angular-simple-logger/dist/angular-simple-logger.js")),format.raw/*62.114*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("bower_components/angular-google-maps/dist/angular-google-maps.js")),format.raw/*63.110*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*64.19*/routes/*64.25*/.Assets.versioned("bower_components/ng-file-upload/ng-file-upload.js")),format.raw/*64.95*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*65.19*/routes/*65.25*/.Assets.versioned("bower_components/ng-table/dist/ng-table.js")),format.raw/*65.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("bower_components/ng-wig/dist/ng-wig.js")),format.raw/*66.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("bower_components/moment/moment.js")),format.raw/*67.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*68.19*/routes/*68.25*/.Assets.versioned("bower_components/pikaday/pikaday.js")),format.raw/*68.81*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("bower_components/pikaday-angular/pikaday-angular.js")),format.raw/*69.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("bower_components/d3/d3.js")),format.raw/*70.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("bower_components/c3/c3.js")),format.raw/*71.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("bower_components/c3-angular/c3-angular.min.js")),format.raw/*72.91*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("bower_components/angulargrid/angulargrid.js")),format.raw/*73.89*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("bower_components/ngSmoothScroll/dist/angular-smooth-scroll.min.js")),format.raw/*74.111*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*75.19*/routes/*75.25*/.Assets.versioned("bower_components/ngSmoothScroll/dist/angular-smooth-scroll.min.js")),format.raw/*75.111*/("""" type="text/javascript"></script>


    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("app/js/vendors/angular-placeholders.js")),format.raw/*78.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("app/js/vendors/angular-mdl.js")),format.raw/*79.75*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("app/js/demo/app.js")),format.raw/*80.64*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("app/js/demo/app.route.js")),format.raw/*81.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*82.19*/routes/*82.25*/.Assets.versioned("app/js/demo/app.config.js")),format.raw/*82.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*83.19*/routes/*83.25*/.Assets.versioned("app/js/app.constants.js")),format.raw/*83.69*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*84.19*/routes/*84.25*/.Assets.versioned("app/js/demo/controllers/main.js")),format.raw/*84.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("app/js/demo/controllers/dashboard.js")),format.raw/*85.82*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*86.19*/routes/*86.25*/.Assets.versioned("app/js/demo/controllers/todo.js")),format.raw/*86.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*87.19*/routes/*87.25*/.Assets.versioned("app/js/demo/controllers/ui-elements/loading.js")),format.raw/*87.92*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*88.19*/routes/*88.25*/.Assets.versioned("app/js/demo/controllers/gallery.js")),format.raw/*88.80*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.versioned("app/js/demo/controllers/forms/advanced-elements/select.js")),format.raw/*89.103*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*90.19*/routes/*90.25*/.Assets.versioned("app/js/demo/controllers/forms/advanced-elements/upload.js")),format.raw/*90.103*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*91.19*/routes/*91.25*/.Assets.versioned("app/js/demo/controllers/forms/advanced-elements/text-editor.js")),format.raw/*91.108*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*92.19*/routes/*92.25*/.Assets.versioned("app/js/demo/controllers/maps/clickable-map.js")),format.raw/*92.91*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*93.19*/routes/*93.25*/.Assets.versioned("app/js/demo/controllers/maps/searchable-map.js")),format.raw/*93.92*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*94.19*/routes/*94.25*/.Assets.versioned("app/js/demo/controllers/maps/zoomable-map.js")),format.raw/*94.90*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*95.19*/routes/*95.25*/.Assets.versioned("app/js/demo/controllers/maps/styled-map.js")),format.raw/*95.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*96.19*/routes/*96.25*/.Assets.versioned("app/js/demo/controllers/maps/full-map.js")),format.raw/*96.86*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("app/js/demo/controllers/charts.js")),format.raw/*97.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("app/js/demo/controllers/tables-data.js")),format.raw/*98.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*99.19*/routes/*99.25*/.Assets.versioned("app/js/demo/directives/dynamic-color.js")),format.raw/*99.85*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*100.19*/routes/*100.25*/.Assets.versioned("app/js/demo/directives/header.js")),format.raw/*100.78*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*101.19*/routes/*101.25*/.Assets.versioned("app/js/demo/directives/sidebar.js")),format.raw/*101.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*102.19*/routes/*102.25*/.Assets.versioned("app/js/modules/chat.js")),format.raw/*102.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*103.19*/routes/*103.25*/.Assets.versioned("app/js/modules/menu.js")),format.raw/*103.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*104.19*/routes/*104.25*/.Assets.versioned("app/js/modules/svg-map.js")),format.raw/*104.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*105.19*/routes/*105.25*/.Assets.versioned("app/js/modules/todo.js")),format.raw/*105.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*106.19*/routes/*106.25*/.Assets.versioned("app/js/directives/sticky.js")),format.raw/*106.73*/("""" type="text/javascript"></script>

      <!-- endbuild -->
  </body>
</html>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 02 11:15:14 BRT 2019
                  SOURCE: C:/Users/haroldo/projetos/prototypeplay/app/views/index.scala.html
                  HASH: f413c06cf4d838533cee720ef1993ba428eea40a
                  MATRIX: 941->1|1037->3|1067->7|1795->731|1828->737|1900->782|1915->788|2008->859|2088->912|2103->918|2169->962|2251->1017|2266->1023|2352->1087|2434->1142|2449->1148|2535->1212|2617->1267|2632->1273|2715->1334|2797->1389|2812->1395|2881->1442|2961->1495|2976->1501|3069->1572|3151->1627|3166->1633|3249->1694|3331->1749|3346->1755|3424->1811|3506->1866|3521->1872|3587->1916|4388->2690|4403->2696|4494->2766|4575->2820|4590->2826|4667->2882|4748->2936|4763->2942|4852->3010|4933->3064|4948->3070|5041->3142|5122->3196|5137->3202|5228->3272|5309->3326|5324->3332|5419->3406|5500->3460|5515->3466|5626->3555|5707->3609|5722->3615|5806->3678|5887->3732|5902->3738|6013->3827|6094->3881|6109->3887|6216->3972|6297->4026|6312->4032|6403->4102|6484->4156|6499->4162|6583->4225|6664->4279|6679->4285|6759->4344|6840->4398|6855->4404|6930->4458|7011->4512|7026->4518|7103->4574|7184->4628|7199->4634|7292->4706|7373->4760|7388->4766|7455->4812|7536->4866|7551->4872|7618->4918|7699->4972|7714->4978|7801->5044|7882->5098|7897->5104|7982->5168|8063->5222|8078->5228|8186->5314|8267->5368|8282->5374|8390->5460|8475->5518|8490->5524|8570->5583|8651->5637|8666->5643|8737->5693|8818->5747|8833->5753|8893->5792|8974->5846|8989->5852|9055->5897|9136->5951|9151->5957|9218->6003|9299->6057|9314->6063|9379->6107|9460->6161|9475->6167|9548->6219|9629->6273|9644->6279|9722->6336|9803->6390|9818->6396|9891->6448|9972->6502|9987->6508|10075->6575|10156->6629|10171->6635|10247->6690|10328->6744|10343->6750|10443->6828|10524->6882|10539->6888|10639->6966|10720->7020|10735->7026|10840->7109|10921->7163|10936->7169|11023->7235|11104->7289|11119->7295|11207->7362|11288->7416|11303->7422|11389->7487|11470->7541|11485->7547|11569->7610|11650->7664|11665->7670|11747->7731|11828->7785|11843->7791|11918->7845|11999->7899|12014->7905|12094->7964|12175->8018|12190->8024|12271->8084|12353->8138|12369->8144|12444->8197|12526->8251|12542->8257|12618->8311|12700->8365|12716->8371|12781->8414|12863->8468|12879->8474|12944->8517|13026->8571|13042->8577|13110->8623|13192->8677|13208->8683|13273->8726|13355->8780|13371->8786|13441->8834
                  LINES: 28->1|33->1|35->3|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|53->21|53->21|53->21|55->23|55->23|55->23|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|62->30|62->30|62->30|64->32|64->32|64->32|66->34|66->34|66->34|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|106->74|106->74|106->74|107->75|107->75|107->75|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|122->90|122->90|122->90|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|130->98|130->98|130->98|131->99|131->99|131->99|132->100|132->100|132->100|133->101|133->101|133->101|134->102|134->102|134->102|135->103|135->103|135->103|136->104|136->104|136->104|137->105|137->105|137->105|138->106|138->106|138->106
                  -- GENERATED --
              */
          