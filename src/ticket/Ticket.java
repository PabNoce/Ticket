/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Ticket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int nCoca, cocaPrice = 5;
        int nAgua, aguaPrice = 3;
        int cash, vuelta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero de cocacolas");
        nCoca = scan.nextInt();
        System.out.println("Nummero de aguas");
        nAgua = scan.nextInt();
        System.out.println("Introduce dinero");
        cash = scan.nextInt();
        System.out.println("");
        System.out.println(nCoca + " CocaCocolas -> " + (nCoca * cocaPrice));
        System.out.println(nAgua + " Aguas -------> " + (nAgua * aguaPrice));
        System.out.println("                _____");
        System.out.println("          Total: " + (nCoca * cocaPrice + nAgua * aguaPrice));
        System.out.println("");
        System.out.println("     Entregado-> " + cash);
        System.out.println("     Devuelve--> " + (cash - (nCoca * cocaPrice + nAgua * aguaPrice)));
        System.out.println("");
        System.out.println("   Grazas por vir");
    }

}
