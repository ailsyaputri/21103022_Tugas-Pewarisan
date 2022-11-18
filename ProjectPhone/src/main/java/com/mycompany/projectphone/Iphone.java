/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectphone;

/**
 *
 * @author ASUS
 * 21103022_Ailsya Putri_SI05A
 */
public class Iphone  implements Phone {
    private int volume;
    private boolean isPowerOn;
    public Iphone(){
        this.volume = 50;
    }
    
    @Override
        public void powerOn(){
        isPowerOn = true;
        System.out.println("Welcome to Iphone");
        System.out.println("Android version 29");
    }
    @Override
        public void powerOff(){
        isPowerOn = false;
        System.out.println("Good Bye");
    }
    @Override
    public void volumeUp(){
        if (isPowerOn){
            if (this.volume == MAX_VOLUME){
                System.out.println("Volume FULL");
                System.out.println("sudah " + this.getVolume() + "%");
            }else{
                this.volume += 10;
                System.out.println("Volume Now: " + this.getVolume());
            }
        }else{
            System.out.println("Iphone Off");
        }
    }
    @Override
    public void volumeDown(){
        if (isPowerOn){
            if (this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
            }else{
                this.volume -= 10;
                System.out.println("Volume Now: " + this.getVolume());
            }
        }else{
           System.out.println("Iphone Off");
        }
    }
    public int getVolume(){
        return this.volume; 
    }
}
