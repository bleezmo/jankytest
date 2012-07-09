package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Logger.error("shiiiiit")
    val x = 1/ 0;
    Ok(views.html.index("Your new application is ready. go fuck yourself"))
  }
  
}
