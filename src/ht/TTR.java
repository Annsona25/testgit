/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

import javax.swing.text.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

/**
 *
 * @author Manoj
 */
public class TTR {
    public static void main(String s[])
    {
      try
      {
        String html = "<p>An <a href='http://example.com/'><b>example</b></a> link.</p>";
          org.jsoup.nodes.Document doc = Jsoup.parse(html);
Element link = doc.select("a").first();

String text = doc.body().text(); // "An example link"
String linkHref = link.attr("href"); // "http://example.com/"
String linkText = link.text(); // "example""
String linkOuterH = link.outerHtml(); 
    // "<a href="http://example.com"><b>example</b></a>"
String linkInnerH = link.html(); // "<b>example</b>"
System.out.println(text);
      }
      catch(Exception ee)
      {
       System.out.println(ee);
      }
    }
    
}
