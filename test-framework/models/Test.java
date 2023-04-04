package models;

import etu002663.framework.annotation.Url;
import etu002663.framework.renderer.ModelView;

public class Test {

    @Url("/test")
    public ModelView helloWorld() {
        return new ModelView("views/test.jsp");
    }
}