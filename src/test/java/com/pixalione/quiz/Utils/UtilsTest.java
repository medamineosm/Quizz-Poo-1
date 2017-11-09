package com.pixalione.quiz.Utils;

import com.pixalione.quiz.Models.Client;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static junit.framework.Assert.fail;

/**
 * Created by Ouasmine on 09/11/2017.
 */
public class UtilsTest {

    public static boolean checkMethods(Class<?> clazz, String methodsName, Class<?>... parameterTypes) {
        Method methodToFind = null;
        try {
            methodToFind = clazz.getMethod(methodsName, (Class<?>[]) parameterTypes);
            return true;
        } catch (NoSuchMethodException | SecurityException e) {
            // Your exception handling goes here
            fail( "The specified " + clazz.getName() + " does not containes this " +methodToFind+"!");
            return false;
        }
    }

    public static boolean checkConstructors(Class<?> clazz, Class<?>... parameterTypes){
        try {
            Constructor<?> contructor = clazz.getConstructor(parameterTypes);
            return true;
        } catch( NoSuchMethodException nsme) {
            fail( "The specified " + Client.class.getName() + " constructor does not exist!");
            return false;
        }
    }
}
