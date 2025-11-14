package datastrcture;

import oopmodeling.Solarsystem;
import oopmodeling.Celestialbody;

public class FlexibleArrayTest {
    static void main(String[] args) {
        FlexibleArray<Integer> flexibleArray =
                new FlexibleArray<Integer>();
        System.out.println("the current size = " + flexibleArray.size());
        flexibleArray.add(3);
        flexibleArray.remove(4);



    }
}
