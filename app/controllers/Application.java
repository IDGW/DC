package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Nothing"));
    }

    public static Result loginPage(){
    	return ok(loginPage.render("Login Page"));
    }

}
