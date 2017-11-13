
package singletonepackage;

public class Main {
    
    public static void main(String[] args) {
        
        SingletoneClassLazy.getInstance();
        SingletoneClass.getInstacne();
        
        SingletonewithEnumBestWay enumBestWay=SingletonewithEnumBestWay.INSTANCE;
        enumBestWay.i=5;
        enumBestWay.show();
        enumBestWay.i=7;
        enumBestWay.show();
                
                
        
    }
    
}
