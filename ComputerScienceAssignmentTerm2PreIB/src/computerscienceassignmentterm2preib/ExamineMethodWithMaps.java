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
        examine.put("paper", "It's just a standard pad of paper. Nothing much to see here");
        return examine.get(object);
    }
    
    public static void main(String[] args) {
        System.out.println(examineObject("paper", false));
    }

}
