package com.pixalione.quiz;

import com.pixalione.quiz.Models.Client;
import com.pixalione.quiz.Models.ClientTest;
import com.pixalione.quiz.Models.Compte;
import com.pixalione.quiz.Models.CompteTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        System.out.println( "********************* Menu ********************** \n" +
                "1- Afficher les informations \n" +
                "2- Créditer le compte prenant une somme en paramétre \n"+
                "3- Créditer le compte en prenant une somme et un compte en paramétre \n"+
                "4- Débiter le compte prenant une somme en paramétre \n"+
                "5- Débiter le compte prenant une somme et un compte en parametre \n"+
                "6- Afficher le résumé d'un compte");


        Scanner input =  new Scanner("Veuillez selectionner le numéro de la méthode");
        int num = input.nextInt();

        switch (num) {
            case 1:  //Afficher()
                break;
            case 2:  //Crediter()
                break;
            case 3:  //Crediter()
                break;
            case 4:  //Debiter()
                break;
            case 5:  //Debiter()
                break;
            case 6:  //Resume()
                break;
            default:
                System.out.println("numéro invalide");
                break;
        }

        System.out.println("Run tests");
        TestSuite test = new TestSuite( AppTest.class );
        test.addTestSuite(ClientTest.class);
        test.addTestSuite(CompteTest.class);
        return test;
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
