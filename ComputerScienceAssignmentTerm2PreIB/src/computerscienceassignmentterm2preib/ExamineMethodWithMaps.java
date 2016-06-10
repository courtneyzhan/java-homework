/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceassignmentterm2preib;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class ExamineMethodWithMaps {

    public static String examineObject(String object, boolean hasKey) {
        Map<String, String> examine = new HashMap();
        //table/desk
        examine.put("table", "There are a few things strewn about the table;\nsome loose pencils and a blank pad of paper.\n There is also an eclectic assortment of knick-knacks near the back of the desk.\nUnderneath the table is a set of drawers.");
        examine.put("desk", "There are a few things strewn about the table;\nsome loose pencils and a blank pad of paper.\n There is also an eclectic assortment of knick-knacks near the back of the desk.\nUnderneath the table is a set of drawers.");
        //knick-knacks
        examine.put("knick-knacks", "");
        examine.put("knick knacks", "");
        examine.put("knickknacks", "");
        //wooden box
        examine.put("wooden box", "");
        //paper
        examine.put("paper", "");
        examine.put("pad", "");
        examine.put("pad of paper", "");
        //pencil
        examine.put("pencils", "");
        //bookshelf
        examine.put("bookshelf", "");
        examine.put("book shelf", "");
        examine.put("book-shelf", "");
        examine.put("bookcase", "");
        //the books (GG, TKAM, Escape)
        examine.put("the great gatsby", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");
        examine.put("", "");

        examine.put("paper", "It's just a standard pad of paper. Nothing much to see here");
        return examine.get(object);
    }

    public static void main(String[] args) {
        System.out.println(examineObject("paper", false));
    }

}
