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
public class Solution {

    String simplifyPath(String path) {
         path=path.replaceAll("\\.{1,}", "");//logic to handle ..
         if(path.contains("\\.{1,}")){
             
         }
          path=path.replaceAll("/{1,}", "/");
       
        if(path.endsWith("/")){
            path=path;
            path=path.substring(0, path.length()-1); 
        }
         if(!path.startsWith("/")){
                path="/"+path;
            }
        
        return path;
    }
    public String handleDots(String path){
        for(int i=path.length();i>1;i--){
            if(path.charAt(i-1)=='.'){// .
                if(path.charAt(i-2)=='.'){//..
                    
                }else{
//                only one charater
//                    replace all before with /
                        while(path.charAt(i)=='.'){
                            i--;
                        }
                        if(path.charAt(i)=='/'){
                            //delete /
                        }
                    path=path.substring(i, path.length());
                    path="/"+path;
                }
            }
        }
        return path;
    }
}
