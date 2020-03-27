

import java.util.Scanner;

public class shape1 {
    private String color = "black";
    private boolean filled = true;
    public shape1(){
    }
    public shape1(String color,boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
            return color;
    }
    public String inputcolor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input color: ");
        return sc.nextLine();
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void setCorlor(String color){
        this.color = color;
    }
    public boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = this.inputcolor();
    }
    Scanner sc = new Scanner(System.in);
    public String inputfillStatus(){
        System.out.print("filled? (y/n) : ");
        String a = sc.nextLine();
        return checkfillA(a);
    }
    public String checkfillA(String a){
        while (!a.equals("Y") && !a.equals("N")){
            System.out.print("choose 'Y' for yes or 'N' for no");
            a = sc.nextLine();
        }
        return a;
    }
    public void setFilled(){
        if(inputfillStatus().equals("N")){
            this.filled = false;
        }
    }
}
