/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author nodira
 */
public class ProjectRunner {

   
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/NodiraRA/builder");
        
        project.run();
    }
    
}
