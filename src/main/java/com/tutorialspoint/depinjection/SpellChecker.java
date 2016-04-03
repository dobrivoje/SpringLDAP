/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.depinjection;

import org.springframework.stereotype.Component;

/**
 *
 * @author root
 */
@Component
public class SpellChecker {

    public SpellChecker() {
        System.out.println("SpellChecker - Pozivanje konstruktora !");
    }

    public void checkSpelling() {
        System.out.println("SpellChecker - Pozivanje  : public void checkSpelling()");
    }

    public void init() {
        System.out.println("SpellChecker - Pozivanje : init()");
    }

    public void destroy() {
        System.out.println("SpellChecker - Pozivanje : destroy()");
    }

}
