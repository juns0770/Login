package com.example.login.LogIn.Kakao.Define;

import com.example.login.LogIn.Kakao.SessionCallback;
import com.kakao.auth.Session;

public class KDefine {

    public Session mSession;

    /**
     * @param	instance Singleton Pattern
     */
    private static KDefine instance;
    public static KDefine ins() {
        if(instance == null){
            instance = new KDefine();
        }
        return instance;

    }
}
