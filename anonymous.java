//Initialization through reference
package object;
//Anonymous simply means nameless.
// An object which has no reference is known as an anonymous object.
// It can be used at the time of object creation only.
//
//If you have to use an object only once,
// an anonymous object is a good approach.
class Calculation{
    void fact(int  n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
    public static void main(String args[]){
        new Calculation().fact(5);//calling method with anonymous object
    }
}