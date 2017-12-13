package mco.projetinfo4a;


import java.util.ArrayList;
import java.util.HashMap;
/**
 * The Component decorator acts as a "FOLDER" and is specified in it's subclass 
 * defining what is the "criteria" that is searched for dynamically, in the order specified by the 
 * external class Comparator
 */
public class ComponentDecorator implements ModelComponent{
    protected ModelComponent component ;
    protected CriteriaList criterias;
    
    public ComponentDecorator(ModelComponent component,CriteriaList criterias){
        this.component = component;
        this.criterias = criterias;
        
    }
    
    
    public ComponentDecorator(ModelComponent component){
        this.component = component;
    }
    
    public CriteriaList getCriteriaList(){
        return criterias;
    }

    @Override
    public Boolean tryOrder() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object order() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getName() {
        return component.getName() + component.getModel();
    }
    @Override
    public String getModel(){
        return component.getModel();
    }
    @Override
    public String toString() {
        return "here's the specific info :";
    }
    

}