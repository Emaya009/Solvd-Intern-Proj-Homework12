import java.util.Arrays;


class bubblesortpgm {

    public static void main(String[] args)
    {
        int[] a= {67,88,2,0,35,90,5};         //Array declaration and initialisation
        System.out.println("Print Array elements before sorting" +Arrays.toString(a));  //To print array elements in single shot
        int l=a.length;                       //To get the array size
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1;j++)            //Number of passes it should go through
            {
                if(a[j]>a[j+1])               //condition to compare the elements in order
                {
                    int temp=a[j];            //Swapping statements
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
      System.out.println("Print Array elements after bubble sort" +Arrays.toString(a));
    }

}
