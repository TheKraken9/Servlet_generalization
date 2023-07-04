package models;

import etu2663.framework.annotation.Url;
import etu2663.framework.renderer.ModelView;

public class Test {

    @Url("/test")
    public ModelView helloWorld() {
        return new ModelView("views/test.jsp");
    }
}