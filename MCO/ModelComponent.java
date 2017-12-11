package mco.projetinfo4a;


/**
 * ModelDecorator
 */
public interface ModelComponent{
    
    public abstract String getName();
    public abstract String getModel();
    public Boolean tryOrder();
    public Object order();
    @Override
    public String toString();
    
}