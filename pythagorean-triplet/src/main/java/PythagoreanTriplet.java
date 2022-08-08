/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class PythagoreanTriplet{
    int a;
    int b;
    int c;
    PythagoreanTriplet(int a, int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public int hashCode(){
        return Objects.hash(a,b,c);
    }
    @Override
    public boolean equals(Object obj){
        PythagoreanTriplet other = (PythagoreanTriplet) obj;
        return (a == other.a && b == other.b && c == other.c);
    }
    static PythagoreanTripletBuilder makeTripletsList(){
        return new PythagoreanTripletBuilder();
    }
}


 class PythagoreanTripletBuilder{
    int sum;
    int fact;
    PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int fact){
        this.fact = fact;
        return this;
    }
    PythagoreanTripletBuilder thatSumTo(int sum){
        this.sum = sum;
        return this;
    }
    List<PythagoreanTriplet> build(){
        List<PythagoreanTriplet> ans = new ArrayList<PythagoreanTriplet>();
        for(int a = 1 ; a<= fact ; a++){
            for(int b = a+1 ; b<= fact ; b++){
                int t = sum-a-b;
                int c = (a*a)+(b*b);
                if(t >= 1 && t<=fact && ((t*t) == c))
                {
                    
                    PythagoreanTriplet pht = new PythagoreanTriplet(a,b,t);
                    ans.add(pht);
                }
            }
        }
        return ans;
    }
} 