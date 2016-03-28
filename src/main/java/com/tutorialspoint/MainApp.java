/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint;

import com.tutorialspoint.helloworld.HelloWorldConfig;
import com.tutorialspoint.helloworld.HelloWorld;
import com.tutorialspoint.depinjection.TextEditor;
import com.tutorialspoint.depinjection.TextEditorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author DPrtenjak
 */
public class MainApp {

    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("definitions/beans/beanDefinicije.xml");
        
         HelloWorld h1 = (HelloWorld) context.getBean("zdravoSveticu");
         HelloWorld h2 = (HelloWorld) context.getBean("zdravoSveticu");
        
         h1.setMessage("poruka 1");
         h2.setMessage("poruka 2");
        
         System.err.println(h1.getMessage());
         System.err.println(h2.getMessage());
        
         ApplicationContext context2 = new ClassPathXmlApplicationContext("definitions/beans/textEditor.xml");
        
         TextEditor t = (TextEditor) context2.getBean("textEditor");
         t.spellCheck();
         */

        ApplicationContext context3 = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld h3 = context3.getBean(HelloWorld.class);

        h3.setMessage("jbt. radi !");
        System.err.println(h3.getMessage());

        ApplicationContext ctx4 = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor h4 = ctx4.getBean(TextEditor.class);

        h4.spellCheck();
    }

}
