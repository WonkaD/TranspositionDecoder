/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba;

/**
 *
 * @author oscky
 */
class MyArrays {

    static int[] createOfLength(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) array[i] = i;
        return array;
    }
    
    static int[] createSpaceArrayOfLength(int spaces, int length) {
        int[] array = new int[length];
        if (spaces>length) return new int [0];
        for (int i = 0; i < spaces; i++) array[i] = 1;
        return array;
    }
    
}
