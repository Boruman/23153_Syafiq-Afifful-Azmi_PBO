/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;
/**
 *
 * @author Syafiq Afifful Azmi
 */
public class BangunRuang {
    double s, p, l, t;
    
    public BangunRuang(double s) {
        this.s = s;
    } 
    public BangunRuang(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    public double luasKubus() {
        return 6 * (s * s);
    }
    
    public double volumeKubus() {
        return s * s * s;
    }
    public double luasBalok() {
        return 2 * (p * l + p * t + l * t);
    }
    public double volumeBalok() {
        return p * l * t;
    }
    
}
