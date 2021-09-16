package Operations;

/**
 *
 * @author uidj7796
 */
public class Arithmetic {
    //Attributes
    int a;
    int b;
    
    //Methods
    public void addition()
    {
        int result = a + b ;
        System.out.println("result = " + result);
    }
    
    public int additionWithReturn()
    {
//        int result = a + b;
//        return result;
        
        return a + b;
    }
    
    public int addWithArguments(int arg1, int arg2)
    {
        a = arg1;
        b = arg2;
        //return a + b;
        return additionWithReturn();
    }
    
    public int addWithThis(int a, int b)
    {
        this.a = a;
        this.b = b;
        //return a + b;
        return this.additionWithReturn();
    }
}
