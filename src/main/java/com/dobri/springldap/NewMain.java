/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dobri.springldap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author root
 */
public class NewMain {

    public static void main(String[] args) {
        try {
            ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        } catch (Exception ioe) {
            System.err.println("nema config fajla !");
        }

    }

}
