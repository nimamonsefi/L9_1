package com.company;

import com.company.Remote.SiteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        String username,pass,Newpass;
        try {
            SiteInterface siteInterface = (SiteInterface) Naming.lookup("//localhost/site");
            System.out.println("1.Create User");
            System.out.println("2.Change password");
            choose = input.nextInt();
            switch (choose){
                case 1:{
                    System.out.print("Your username:");
                    username = input.next();
                    System.out.print("Your password:");
                    pass = input.next();
                    siteInterface.createUser(username,pass);
                    break;
                }
                case 2:{
                    System.out.print("Your new password:");
                    Newpass = input.next();
                    siteInterface.changePass(Newpass);
                    break;
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
