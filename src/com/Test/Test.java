/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Test;

import com.bean.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author BA391760
 */
public class Test {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("AutoWireSpring.xml");
        Player p=(Player)context.getBean(Player.class);
        System.out.println(p.getName());
        System.out.println(p.getInstrument().getName());
        System.out.println(p.getInstrument().getSound());
      
    }
}
