/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author F
 */
class User {
    private String Title,Status;
    public User(String Title,String Status){
        
        
        
        this.Title=Title;
        this.Status=Status;
    }
    public String getTitle(){
        
        
        
        return Title;
    }
    public String getStatus(){
        
        
        return Status;
    }
}
