class Con{
    public static void main(String args[]){
        double sh,h,r,rps,a,c,pi;
        sh=5;
        h=4;
        rps=10;
        pi=3.1416;
        r=Math.sqrt(sh*sh-h*h);
        a=pi*r*r;
        c=a*rps;
        System.out.printf("c :"+ c);
    }
}