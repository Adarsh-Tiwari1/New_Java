

class AlphaPattern{
    public static void main(String[] args){
        
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                
                System.out.print((char)(64+r) + " ");
            }
                System.out.println();
        }
    }
}




/*
class AlphaPattern{
    public static void main(String[] args){
        
        for(int r='A';r<='E';r++){
            for(int c='A';c<=r;c++){
                
                System.out.print((char)c + " ");
            }
                System.out.println();
        }
    }
}
*/