import java.util.Scanner;

public class triangle extends shape1{
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;
    public triangle(){
    }
    public triangle(double size1,double size2,double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public triangle(String color,boolean filled, double size1, double size2, double size3){
        super(color,filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    private double getPeri(){
        return (this.size1 + this.size2 + this.size3);
    }
    private double getHalfofPeri(){
        return (getPeri() / 2);
    }
    public double getArea(){
        double sub1 = getHalfofPeri() - this.size1;
        double sub2 = getHalfofPeri() - this.size2;
        double sub3 = getHalfofPeri() - this.size3;
        return Math.pow(getHalfofPeri() * sub1 * sub2 * sub3,0.5);
    }
    public void checkTriangle(double size){
        if (size <= 0){
            System.out.println("input number > 0");
        }
    }
    Scanner sc = new Scanner(System.in);
    public void inputSize1(){
        do {
            System.out.println("input length size 1: ");
            setSize1(sc.nextDouble());
            checkTriangle(this.size1);
        }while (this.size1 <= 0);
    }
    public void inputSize2(){
        do {
            System.out.println("input length size 2: ");
            setSize2(sc.nextDouble());
            checkTriangle(this.size2);
        }while (this.size2 <= 0);
    }public void inputSize3(){
        do {
            System.out.println("input length size 3: ");
            setSize3(sc.nextDouble());
            checkTriangle(this.size3);
        }while (this.size3 <= 0);
    }
    public boolean isTriangle(){
        return (this.size1 + this.size2 > this.size3
        && this.size1 + this.size3 > this.size2
        && this.size2 + this.size3 > this.size1);
    }
    public void checkTriangle(){
        while (!isTriangle()){
            System.out.println("nhập cả 3 size vào: ");
            inputSize1();
            inputSize2();
            inputSize3();
        }
    }
    @Override
    public String toString(){
        return "triangle: "
                +" size 1: " +size1
                +" size 2: " + size2
                +" size 3: " + size3;
    }
    public void displayTriangle(){
        System.out.println(this.toString());
    }
    public void displayColor(){
        System.out.println("color " + this.getColor()
        + (this.getFilled() ? "' and filled" : "' and not filled"));
    }

    public static void main(String[] args) {
        triangle triangle = new triangle();
        triangle.inputSize1();
        triangle.inputSize2();
        triangle.inputSize3();
        triangle.checkTriangle();
        triangle.setColor("");
        triangle.setFilled();
        triangle.displayColor();
        triangle.displayTriangle();
    }
}
