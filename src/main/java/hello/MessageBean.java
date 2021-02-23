package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String msg;
        
    public MessageBean() {
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String value) {
        switch (value){
            case "":
            case "pt":
                msg = "Alô, meu consagrado ";
                break;
            case "en":
                msg = "Hello, my friend ";
                break;
            case "fr":
                msg = "Bonjour, mon amie ";
                break;
            case "de":
                msg = "Hallo, mein freund ";
                break;
            case "es":
                msg = "Hola, mi amigo ";
                break;
            case "ru":
                msg = "Привет, мой друг ";
                break;
        }
    }
}
