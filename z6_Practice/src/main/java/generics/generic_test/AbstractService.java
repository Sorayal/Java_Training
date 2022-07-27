package generics.generic_test;

public abstract class AbstractService <I,E, R> {
    public abstract E readRest(R restModel);
    public void deleteEntity(I id){
        System.out.println("Entity deleted");
    }
}
