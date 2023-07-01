package etu1987.framework;
import java.util.HashMap;
import java.util.*;


public class Modelview {
    String view;
    HashMap<String, Object> data = new HashMap<String, Object>();
    HashMap<String, Object> session = new HashMap<String, Object>();
    boolean gson = false;
    boolean invalideSession = false;
    List<String> sessionDestroy = new ArrayList<>();

    public void destroy(String sessionName) {
        this.getSessionDestroy().add(sessionName);
    }
    public void setSessionDestroy(List<String> sessionDestroy) {
        this.sessionDestroy = sessionDestroy;
    }
    public List<String> getSessionDestroy() {
        return sessionDestroy;
    }
    public void setInvalideSession(boolean invalideSession) {
        this.invalideSession = invalideSession;
    }
    public boolean isInvalideSession() {
        return invalideSession;
    }
    
    public void setGson(boolean isGson) {
        this.gson = isGson;
    }
    public boolean isGson() {
        return gson;
    }
    public void setSession(HashMap<String, Object> session) {
        this.session = session;
    }
    public HashMap<String, Object> getSession() {
        return session;
    }
    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
    public  HashMap<String, Object> getData(){
        return this.data;
    }
    public String getView() {
        return view;
    }
    public void setView(String view) {
        this.view = view;
    }

    public void addItem(String key, Object object) {
        this.getData().put(key, object);
    }
    public void addSession(String key, Object object) {
        this.getSession().put(key, object);
    }
}
