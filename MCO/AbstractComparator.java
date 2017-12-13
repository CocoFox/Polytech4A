/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mco.projetinfo4a;

/**
 *
 * @author pacomebondetdelabernardie
 */
public abstract class AbstractComparator {
    protected CriteriaList userPrefs;
    protected CriteriaList modPrefs;
    
    public abstract void getScore();
    public abstract void setCriterias(ComponentDecorator userPrefs,ComponentDecorator modPrefs);
    
}
