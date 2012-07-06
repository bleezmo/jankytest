package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
	var x:Int = 5;
	x = x / 0;
    Ok(views.html.index("Your new application is ready. go fuck yourself"))
  }
  
}
