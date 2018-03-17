package controllers;

import play.mvc.*;

import java.io.File;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result downloadFile(){
        java.io.File arc = new File("/tmp/fileToServe.pdf");
        return ok(arc, "fileServe.pdf");
    }

}
