import java.util.ArrayList;
/**
 * The Component decorator acts as a "FOLDER" and is specified in it's subclass 
 * defining what is the "criteria" that is searched for dynamically, in the order specified by the 
 * external class Comparator
 */
public class ComponentDecorator implements ModelComponent{

    /*
    // to do push back and pop
    */
    public ArrayList<ModelComponent> criteria;
    public void operation(){
        //todo
    }

    @Override
    public String getModelNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean tryOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}