package com.company;

import com.company.Remote.SiteInterface;

import java.rmi.server.UnicastRemoteObject;

public class SiteImplementor extends UnicastRemoteObject implements SiteInterface {

    public SiteImplementor() throws Exception{}

    @Override
    public void createUser(String user, String pass) throws Exception {
        System.out.println("\tUser Created!");
    }

    @Override
    public void changePass(String pass) throws Exception {
        System.out.println("\tPassword successfully Changed!");
    }
}
