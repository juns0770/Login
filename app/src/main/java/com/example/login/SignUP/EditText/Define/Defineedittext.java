package com.example.login.SignUP.EditText.Define;

public class Defineedittext {

    public String idedit = "";
    public String pwedit = "";
    public String emailedit = "";
    public String phoneedit = "";



    /**
     * @param	instance Singleton Pattern
     */
    private static Defineedittext instance;
    public static Defineedittext ins() {
        if(instance == null){
            instance = new Defineedittext();
        }
        return instance;

    }
}
