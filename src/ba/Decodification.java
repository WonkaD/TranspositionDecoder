package ba;

import java.util.*;

public class Decodification {
    
    /*protected Character[][] DecodeWithKey(String key, String code) {
        int symbols = code.length()/key.length();
        int overflow = code.length()%key.length();
        Character solution[][] = new Character[key.length()][symbols+1];
        int cuenta =0;
        for (int i = 0; i < key.length(); i++) {
            if(KeyTransformation(key).get(i) < key.length()-overflow){
                for (int j = 0; j < symbols; j++) {
                    solution[i][j] = code.charAt(symbols*KeyTransformation(key).get(i)+j);
                }
            }else{
                for (int j = 0; j < symbols +1; j++) {
                    solution[i][j] = code.charAt(symbols*KeyTransformation(key).get(i)+j+cuenta);
                }
                cuenta++;
            }
        }
        return solution;
    }*/
    
    
    
    private static String printTable(char[][] columnArray, int[] key) {
        String res ="";
        for (char[] columnArray1 : columnArray) {
            for (int i = 0; i < columnArray1.length; i++) {
                res += columnArray1[key[i]];
                
            }
            //System.out.println();
        }
        return res;
    }
    

    public static String decode(int [] permutation, int[] overflows, String text) {
        
        char[][] table = new char[rowsCalculator(text, permutation.length)][permutation.length];
        
        for (int i = 0; i < permutation.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if(overflows[i]==0 && j == table.length-1){
                    table[j][i] ='-';
                }else {
                    table[j][i] = text.charAt(0);
                    text = text.substring(1);
                }
                
            }
            
        }
        return printTable(table, permutation);
        
    }

    private static int rowsCalculator(String text, int colums) {
        final int rows = text.length()/colums;
        return text.length()%colums>0 ? rows+1: rows;
    }
    

    protected Character[][] DecodeWithBruteForce() {
        return null;
    }

    private ArrayList<Integer> KeyTransformation(String key ) {
        ArrayList<Integer> transformation = new ArrayList<>();
        ArrayList<Integer> result;
        String keyToUpper = key.toUpperCase();
        
        
        for (int i = 0; i < keyToUpper.length(); i++) {
            transformation.add((int) keyToUpper.charAt(i) - 64);
        }
        
        result = (ArrayList<Integer>) transformation.clone();
        
        for (int i = 0; i < key.length(); i++) {
            int position = MaxValue(transformation);
            transformation.set(position, 0);
            result.set(position, key.length() - (i+1));
        }
        return result;
        
    }

    private int MaxValue(ArrayList<Integer> transformation){
        int pointer = 0;
        for (int i = transformation.size()-1; i > 0; i--) {
            if (transformation.get(i) > transformation.get(pointer)) {
                pointer = i;
            }
        }
        return pointer;
    }
}