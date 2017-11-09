package com.pixalione.quiz.Models;

import com.pixalione.quiz.Utils.UtilsTest;
import junit.framework.TestCase;

/**
 * Created by Ouasmine on 09/11/2017.
 */
public class CompteTest extends TestCase {

    private Compte compte;

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testConstructorWithClientArgs(){
        assertTrue(UtilsTest.checkConstructors(Compte.class, Client.class));
    }

    public void testGetNumeroCompte() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "getNumeroCompte"));

    }

    public void testSetNumeroCompte() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "setNumeroCompte", int.class));
    }

    public void testGetSolde() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "getSolde"));
    }

    public void testSetSolde() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "setSolde", float.class));
    }

    public void testGetPropretaire() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "getPropretaire"));
    }

    public void testSetPropretaire() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "setPropretaire", Client.class));
    }

    public void testAfficher() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "Afficher"));
    }

    public void testCrediterWithSommeArgs() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "Crediter", float.class));
    }

    public void testCrediterWithSomeCompteArgs() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "Crediter", float.class, Compte.class));
    }

    public void testDebiterWithSommeArgs() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "Debiter", float.class));
    }

    public void testDebiterWithSomeCompteArgs() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "Debiter", float.class, Compte.class));
    }

    public void testResumeCompte() throws Exception {
        assertTrue(UtilsTest.checkMethods(Compte.class, "resume", Compte.class));
    }
}