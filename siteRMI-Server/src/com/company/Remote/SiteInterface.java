package com.company.Remote;

import java.rmi.Remote;

public interface SiteInterface extends Remote {

    void createUser(String user,String pass) throws Exception;
    void changePass(String pass) throws Exception;
}
