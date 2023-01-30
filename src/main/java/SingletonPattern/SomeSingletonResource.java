package SingletonPattern;

public class SomeSingletonResource {

    private static SomeSingletonResource instance = null;

    private SomeSingletonResource(){

    }

    public static SomeSingletonResource getInstance(){
        if(instance==null){
            synchronized (SomeSingletonResource.class){
                if(instance==null){
                    instance = new SomeSingletonResource();
                }
            }
        }
        return instance;
    }
}
