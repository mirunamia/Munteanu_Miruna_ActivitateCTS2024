package main;

import banca.Cont;
import banca.FacadeCont;

public class Main {
    public static void main(String[] args) {
        Cont cont = new Cont(20,false,false);

        System.out.println("Fara Facade");
        if(cont.verificareVarsta() && cont.verificarePolitie() &&cont.verificareCreante()){
            System.out.println("Contul poate fi creat!");
        }
        else{
            System.out.println("Persoana nu indeplineste cele 3 conditii pentru a fi creat contul!");
        }

        System.out.println("Cu facade");
        FacadeCont fcont = new FacadeCont(new Cont(18, false, false));
        if(fcont.verificareDate()){
            System.out.println("Contul poate fi creat!");
        }
        else{
            System.out.println("Persoana nu indeplineste cele 3 conditii pentru a fi creat contul!");
        }
    }
}