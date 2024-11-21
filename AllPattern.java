
/*
class AllPattern{
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=5;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=5;r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                System.out.print(r + " ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=5;r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print(r + " ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=5;r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        int count = 1; 
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(char r='A'; r<='E';r++){
            for(char c='A';c<=r;c++){
                System.out.print(r + " ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=1; r<=5;r++){
            for(int c=1;c<=r;c++){
                System.out.print((char)(64+r)+" ");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=5;r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print((char)(64+r)+" ");
            }
            System.out.println("");
        }
    }
}
*/


/*
class AllPattern{
    public static void main(String[] args){
        int count = 1;
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                System.out.print((char)(64+count)+" ");
                count++;
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                if((r+c)%2!=0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println("");
        }
    }
}
*/


/*
class AllPattern{
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
            for(int c=5;c>r;c--){
                System.out.print(" ");
            }
            for(int s=1;s<=r;s++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/



/*
class AllPattern{
    public static void main(String[] args){
        int count = 1;
        for(int r=1;r<=5;r++){
            for(int s=5;s>r;s--){
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print((char)(64+count));
                count++;
            }
            System.out.println("");
        }
    }
}
*/


/*
class AllPattern{
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
            for(int s=5;s>r;s--){
                System.out.print(" ");
            }
            for(int c=1;c<=2*r-1;c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/

/*
class AllPattern{
    public static void main(String[] args){
        for(int r=5;r>=1;r--){
            for(int s=5;s>r;s--){
                System.out.print(" ");
            }
            for(int c=1;c<=2*r-1;c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/

