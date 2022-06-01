public class SquareRoot {
    public Double squareRoot(Double x){
        if (x == null) {
            throw new NullPointerException();
        }
        if (x < 0.0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(x);
    }
}
