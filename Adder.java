package ht_3_2;

/**
 * Created by admin on 28.11.2016.
 */
public class Adder extends Arithmetic {

    boolean check(Integer a, Integer b){
        if (a>=b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Integer a = new Integer(3);
        Integer b = new Integer(4);

        Adder c = new Adder();
        System.out.println("a+b = "+c.add(a, b));
        System.out.println("check = "+c.check(a, b));

    }

}
