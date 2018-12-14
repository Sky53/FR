package Packages_interfaces.Series;

public class ByTwos2 implements Series {
    int start2;
    int val2;
    int prev2;

    ByTwos2() {
        start2 = 0;
        val2 = 0;
        prev2 = -3;
    }

    public int getNext() {
        prev2 = val2;
        val2 += 3;
        return val2;
    }

    public void reset() {
        start2 = 0;
        val2 = 0;
        prev2 = -3;
    }

    public void setStart(int x2) {
        start2 = x2;
        val2 = x2;
        prev2 = x2 - 3;
    }
    int getPrevious(){
        return  prev2;
    }
}
