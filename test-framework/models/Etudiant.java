package models;

import etu002663.framework.annotation.Url;
import etu002663.framework.renderer.ModelView;

public class Etudiant {

    @Url("/Etudiant")
    public ModelView helloWorld() {
        return new ModelView("views/etudiant.jsp");
    }
}