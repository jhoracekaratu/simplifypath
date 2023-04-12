/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.mspace.simplifypath;

/**
 *
 * @author developer
 */
public class Main {

    public static void main(String[] args) {
        String pathbefore ="/path/./pah";
        Solution solution = new Solution();
//        String simplifiedPath = solution.simplifyPath(path);
//        System.out.println(simplifiedPath);
System.out.println(pathbefore);
String path=solution.handleDots(pathbefore);
        System.out.println(path);

    }
}
