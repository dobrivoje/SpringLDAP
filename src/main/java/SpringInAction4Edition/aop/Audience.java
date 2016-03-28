/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringInAction4Edition.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author DPrtenjak
 */
@Aspect
public class Audience {

    @Before("execution(** SpringInAction4Edition.aop.Performance.perform(..))")
    public void silenceCellPhones() {
        System.err.println("Silence your phones !");
    }

    @Before("execution(** SpringInAction4Edition.aop.Performance.perform(..))")
    public void takeSeats() {
        System.err.println("take your seats, and be quiet !");
    }

    @AfterReturning("execution(** SpringInAction4Edition.aop.Performance.perform(..))")
    public void applause() {
    }

    @AfterThrowing("execution(** SpringInAction4Edition.aop.Performance.perform(..))")
    public void demandRefund() {
    }

}
