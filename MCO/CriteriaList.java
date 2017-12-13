/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mco.projetinfo4a;

import java.util.ArrayList;

/**
 *
 * @author pacomebondetdelabernardie
 */
public class CriteriaList {
    protected ArrayList<String> criterias;
    public CriteriaList(){
        criterias = new ArrayList<>();
    }
    
    public CriteriaList(String c){
        criterias = new ArrayList<>();
        criterias.add(c);
    }
    public ArrayList<String> getCriterias(){
        return criterias;
    }
    public void addCriteria(String c){
        criterias.add(c);
    }
    
    public int calculateScore(){
        //*todo
        return 420;
    }
        
    
    
    
    
    
}
