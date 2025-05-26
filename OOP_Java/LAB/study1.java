
class study1 {
  public static void main(String [] args){
    odd(11);
    // int a,b,c; //decleare 3 varible
    // char p; 	float d;	String q;
    // a=10;		b=20;		c=40;		d=45.67f;
    // p='A';	q="hello";
    // System.out.println(a+"   "+b+"   "+c);
    // System.out.println(p + "   " + q);
    // System.out.println(d);
    int[] a = {10, 34, 54, 65, 76};
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }
    System.out.println("The maximum number is " + max);
  }
  public static void odd(int num){
    String result= (num%2==0)?"Even":"Odd";
    System.out.println("Number "+num+" is "+ result);
  }
}
