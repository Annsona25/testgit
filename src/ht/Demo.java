/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

import java.util.ArrayList;

/**
 *
 * @author Manoj
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> tweets = new ArrayList<String>();
        tweets.add("In this country, \"democracy\" means pro-government. #irony");
        NLP.init();
        for(String tweet : tweets) {
            System.out.println(tweet + " : " + NLP.findSentiment(tweet));
        }
    }
}
