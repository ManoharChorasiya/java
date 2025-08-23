class Test{
    public static void main(String args[]){
        double pi,v,r,h,a,s;
        pi=3.1416;
        r=10;
        v=1287;
        h=(v/pi)*r*r;
        a=2*pi*h*(r+h);
        s=(v/pi*r*r);
        System.out.printf("s"+ s);
    }
}