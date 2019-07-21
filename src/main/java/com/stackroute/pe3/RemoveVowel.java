package com.stackroute.pe3;



public class RemoveVowel {
    public String[] vowelRemover(String[] country) {
                int i;
        String[] result=new String[country.length];

        //Replaces the vowels
        for ( i=0;i<country.length;i++){
            result[i]=country[i].replaceAll("[aeiou]","");
        }

        //returns the resulting changed values
        return result;
    }
}
