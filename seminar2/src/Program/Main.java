package Program;

import java.io.FileNotFoundException;
import java.util.List;

import Clase.Aplicant;
import Reader.AngajatReader;
import Reader.AplicantReader;

public class Main {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        try {
            AplicantReader angajatReader = new AngajatReader();
            listaAngajati = angajatReader.read("angajati.txt");
            for(Aplicant angajat:listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
