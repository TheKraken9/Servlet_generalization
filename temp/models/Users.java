package models;

import etu002663.framework.annotation.Url;
import etu002663.framework.renderer.ModelView;

public class Users {
    @Url("/Users")
    public ModelView helloWorld() {
        return new ModelView("views/users.jsp");
    }
}
