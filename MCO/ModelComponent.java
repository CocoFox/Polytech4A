
/**
 * ModelDecorator
 */
public interface ModelComponent{
    
    public abstract String getModelNum();
    public String available();
    public Object tryOrder();
    public void order();
}