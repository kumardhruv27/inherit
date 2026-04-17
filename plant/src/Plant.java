public class Plant {
    public static void main(String[] args){
        rose r = new rose();
        r.grow();
        r.productflowers();
        r.showDetails();
    }
}
class plant{
    String name;
    void grow(){
        System.out.println("plant grow");
    }
}
class floweringplant extends plant{
    void productflowers(){
        System.out.println("this plant produces flowers");
    }
}
class rose extends floweringplant{
    void showDetails(){
        name="rose";
        System.out.println("plant name :"+name);
        System.out.println("rose is a flowering plant");
    }
}
