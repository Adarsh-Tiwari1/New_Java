// bubble sort 

/*
class 
{
    public static void main(String[] args){
        int arr[] = {30,10,20};
        System.out.println("Before Swappint :");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t" + arr[i]);
        }
        // bubble sort logic
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After Swappint");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t" + arr[i]);
        }
    }
}
*/


class Array4Sort{
    public static void main(String[] args){
        int arr[] = {30,10,20};
        System.out.println("Before Swappint :");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t" + arr[i]);
        }
        // bubble sort logic
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("  After Swappint");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t" + arr[i]);
        }
    }
}