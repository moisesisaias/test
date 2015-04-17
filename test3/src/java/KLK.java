/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RaymondStanley
 */
public class KLK {
    String coolnes;
    String name;
    String lastName;
    long amountOfHealth;

    public KLK(String coolnes, String name, String lastName, long amountOfHealth, String lalala) {
        this.coolnes = coolnes;
        this.name = name;
        this.lastName = lastName;
        this.amountOfHealth = amountOfHealth;
        this.lalala = lalala;
    }

    @Override
    public String toString() {
        return "KLK{" + "coolnes=" + coolnes + ", name=" + name + ", lastName=" + lastName + ", amountOfHealth=" + amountOfHealth + ", lalala=" + lalala + '}';
    }

    public void setCoolnes(String coolnes) {
        this.coolnes = coolnes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAmountOfHealth(long amountOfHealth) {
        this.amountOfHealth = amountOfHealth;
    }

    public void setLalala(String lalala) {
        this.lalala = lalala;
    }
    String lalala;

    public String getCoolnes() {
        return coolnes;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAmountOfHealth() {
        return amountOfHealth;
    }

    public String getLalala() {
        return lalala;
    }
    
    
    
    
}
