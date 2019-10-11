
package asis2;

import java.text.DecimalFormat;
import java.util.Scanner;


public class pl {
    private double a,b,c,d,e,f,g,h,i;
    private double Di,Dk,Dj,Dx,Dy;
    
    
    
    
    DecimalFormat fmt = new DecimalFormat("+ #,##;- #");
    Scanner in = new Scanner(System.in);
    pl( double a,double b,double c,double d,double e,double f){
       
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    
     public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }



    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getDx() {
        return Dx;
    }

    public void setDx(double Dx) {
        this.Dx = Dx;
    }

    public double getDy() {
        return Dy;
    }

    public void setDy(double Dy) {
        this.Dy = Dy;
    }



 

    public double getDi() {
        return Di;
    }

    public void setDi(double Di) {
        this.Di = Di;
    }

    public double getDk() {
        return Dk;
    }

    public void setDk(double Dk) {
        this.Dk = Dk;
    }

    public double getDj() {
        return Dj;
    }

    public void setDj(double Dj) {
        this.Dj = Dj;
    }
    
    

    
    //a+b=e
    //c+d=f
    //g+h=i
    boolean cek1(){return ((a*d)-(b*c))==0;}  
           
    
    void solusi(int im){
        
        if(im==6){
           
           setDi(((a*d)-(b*c)));          
           setDx(((e*d)-(b*f)));           
           setDy(((a*f)-(e*c)));           
           
           System.out.format("x = %.2f ",(getDx()/getDi()));
           System.out.format("y = %.2f ",(getDy()/getDi()));
               
           
            
        
        }
        else
        {  
     
            setDi((a*d)-(b*c));
            setDj((c*h)-(g*d));
            setDk((a*h)-(g*b));          
       
            System.out.format("x1= %.2f\t,",(((e*d)-(b*f))) /getDi());
            System.out.format("y1= %.2f\n",(((a*f)-(e*c))) / getDi());
            System.out.format("x2= %.2f\t,",((e*h)-(b*i)) / getDk());           
            System.out.format("y2= %.2f\n", ((a*i)-(g*e)) / getDk());
            System.out.format("x3= %.2f\t,",((f*h)-(i*d)) / getDj());
            System.out.format("y3= %.2f\n",((c*i)-(g*f)) / getDj());
        }
    }
    
    void info()
    {      
        System.out.print("Input : ");
        String Masuk_angka = in.nextLine();
        String[] num; 
        num=Masuk_angka.split("\\s");
        double[] t = new double[num.length];
        for (int i = 0; i < num.length; i++) 
            t[i] = Double.parseDouble(num[i]);
            
        if(num.length==6)
        {
            setA(t[0]); 
            setB(t[1]); 
            setC(t[2]); 
            setD(t[3]);
            setE(t[4]); 
            setF(t[5]); 
            if(cek1()==false)
            {
                if (a==0) 
                {
                    System.out.println(b+"y = "+e);
                }
                else if(b==0)
                {
                    System.out.println(a+"x = "+e);
                }
                else
                { 
                System.out.println(a+"x "+fmt.format(b)+"y = "+e);
                }

                if (c==0) 
                {
                    System.out.println(d+"y = "+f);
                } 
                else if(d==0)
                {
                    System.out.println(c+"x = "+f);
                }
                else
                {
                System.out.println(c+"x "+fmt.format(d)+"y = "+f);
                }
                solusi(num.length);
            }
            else
                System.out.println("sistem tidak punya penyelesaian");
   
        }
        
        else 
        {   
            setA(t[0]); 
            setB(t[1]); 
            
            setC(t[2]); 
            setD(t[3]);
            
            setG(t[4]); 
            setH(t[5]);  
            
            setE(t[6]); 
            setF(t[7]); 
            setI(t[8]);
            if(cek1()==false)
            {
        
            
            
             if (a==0) 
            {
                System.out.println(b+"y = "+e);
            }
            else if(b==0)
            {
                System.out.println(a+"x = "+e);
            }
            else
            { 
            System.out.println(a+"x "+fmt.format(b)+"y = "+e);
            }

            if (c==0) 
            {
                System.out.println(d+"y = "+f);
            } 
            else if(d==0)
            {
                System.out.println(c+"x = "+f);
            }
            else
            {
            System.out.println(c+"x "+fmt.format(d)+"y = "+f);
            }
            
            if (g==0) 
            {
                System.out.println(h+"y = "+i);
            }
            else if(h==0)
            {
                System.out.println(g+"x = "+i);
            }
            else
            { 
            System.out.println(g+"x "+fmt.format(h)+"y = "+i);
            }
            
            solusi(num.length);
           }
            else 
                 System.out.println("sistem tidak punya penyelesaian");
        }
      
            
    }  
}  
 
 
        
    
    

   
    

