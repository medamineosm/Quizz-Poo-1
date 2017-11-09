package com.pixalione.quiz.Models;

import com.pixalione.quiz.Utils.UtilsTest;
import junit.framework.TestCase;


/**
 * Created by Ouasmine on 09/11/2017.
 */
public class ClientTest extends TestCase {

    private Client client;

    public void setUp() throws Exception {
        super.setUp();
        client = new Client();
    }

    public void testConstructorNoArgs(){
        assertTrue(UtilsTest.checkConstructors(Client.class));
    }

    public void testConstructorCin_Nom_Prenom(){
        assertTrue(UtilsTest.checkConstructors(Client.class, String.class, String.class, String.class));
    }

    public void testConstructorAll(){
        assertTrue(UtilsTest.checkConstructors(Client.class, String.class, String.class, String.class, String.class));
    }

    public void testGetCIN() throws Exception {
        assertTrue(UtilsTest.checkMethods(Client.class, "getCIN"));
    }

    public void testSetCIN() throws Exception {
        assertTrue(UtilsTest.checkMethods(Client.class, "setCIN", String.class));
    }

    public void testGetNom() throws Exception {
        assertTrue(UtilsTest.checkMethods(Client.class, "getNom"));
    }

    public void testSetNom() throws Exception {
        assertTrue(UtilsTest.checkMethods(Client.class, "setCIN", String.class));
    }

    public void testGetPrenom() throws Exception {
        assertTrue(UtilsTest.checkMethods(Client.class, "getPrenom"));
    }

    public void testSetPrenom() throws Exception {
        assertTrue(UtilsTest.checkMethods(Client.class, "setPrenom", String.class));
    }
}