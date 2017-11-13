
package singletonepackage;

public class SingletoneClassLazy {
    
    private static SingletoneClassLazy instance;

    private SingletoneClassLazy() {
        
    }
    //eyer synchronized olmazsa metod eyni anda iki thread cagirsa onda her iki instance ucun yeni obyekt yaradar
    public static synchronized SingletoneClassLazy getInstance(){
    
    if (instance==null){
    
    instance=new SingletoneClassLazy();
        System.out.println("created one obj");
    }
    
    return instance;
    
    }
       
}
