/**
 * Created by Andrey on 28.03.2017.
 */
public class trapezezoid {
    private double based; //base_down
    private double baset; //base_top
    private double l_side; //left_side
    private double r_side; //right_side

    private double x,y;

    //public double setx(double)

    public double getx(){
        return x;
    }

    public double gety(){
        return y;
    }

    public double sqr(double x){
        return x*x;
    }

    public String getName(){
        return "Trapezezoid";
    }

    public trapezezoid(double based, double baset, double l_side, double r_side) throws Exception{
        if (based <= 0 || baset <= 0 || l_side <= 0 || r_side <= 0) throw new Exception("Длины сторон должны быть больше нуля!");
        this.based = based;
        this.baset = baset;
        this.l_side = l_side;
        this.r_side = r_side;
    }

    //на вход каждой функции подается длина каждой стороны в качестве параметров,
    // если что, то посмотреть здесь http://ru.solverbook.com/question/kak-najti-diagonal-trapecii/

    public double diagonal(double a, double b, double c, double d){
        return Math.sqrt(sqr(c) + d*b - (d*(sqr(c)-sqr(a))/(d-a)));
    }


    public double square(double a, double b, double c, double d){
        return ((a+b)/2)*Math.sqrt(sqr(c) - sqr((sqr(b-a) + sqr(c) - sqr(d))/(2*(b-a)) ));
    }

}
