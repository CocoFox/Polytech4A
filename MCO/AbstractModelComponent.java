import java.io.String
import java.io.*


public abstract class ModelComponent {
    private String id;
    private String serial;
    private String modelNum;
    private Boolean available = false;
    private Object attribute; // modifiable

    //setters
    public void toggleAvailable();
    public void setId(String nid);
    public void setSerial(String nSerial);
    public void setModelnum(String nModelnum);
    //getters 
    public void getId();
    public void getSerial();
    public void getModelnum();

    public String available();
    public Object tryOrder();                   
    public void order(this);
}