package weekone;
import java.util.Scanner;
class SeatCheck {
    static void checkDuplicateSeats(int[] seats) {
        boolean dup = false;
        for(int i=0;i<seats.length;i++)
            for(int j=i+1;j<seats.length;j++)
                if(seats[i]==seats[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seats[i]);
                    dup = true;
                }
        if(!dup) System.out.println("No Duplicate Seats Found");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        checkDuplicateSeats(arr);
    }
}

