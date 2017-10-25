/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author BA391760
 */
public class Instrument {

    @Value("guitar")
    private String name;
    @Value("Ting Tang")
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
