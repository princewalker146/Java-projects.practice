public interface Fan {

    void on();
    void off();
}
class engine implements Fan{
    public void on(){
        System.out.println("The engine is on");
    }
    public void off(){
        System.out.println("The engine is off");
    }
}