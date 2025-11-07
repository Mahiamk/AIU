class exa1 {
  void dispB(){
    System.out.println("Base Display");
  }
}
class Derived extends exa1 {
  void dispD(){
    System.out.println("Derived Display");
  }
  public static void main(String[] args){
    Derived obj1 = new Derived();
    obj1.dispD();
  }
}