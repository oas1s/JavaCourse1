public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getPlosh() throws SquareException {
        if (side<= 0) {
            throw new SquareException("side cant be less than 0");
        }
        return side*side;
    }

    public static int divide(int a) throws SquareException {
        try {
            return 1/a;
        } catch (ArithmeticException e) {
            throw new SquareException("u cant divide by 0",e);
        }
    }
}
