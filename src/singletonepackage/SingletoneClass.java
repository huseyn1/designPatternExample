
package singletonepackage;

public class SingletoneClass {
    
    private static SingletoneClass obj=new SingletoneClass();

    private SingletoneClass() {
        
    }
    
    public static SingletoneClass getInstacne(){
    
    return obj;
    
    }
    
    
}
