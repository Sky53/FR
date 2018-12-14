package JavaRush;

public class infor {
    public static void main(String[] args) {
        int array[] = {2,2,1};
        int namber =1;

        for (int i = 0; i < array.length -1; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i] != array[j]){
                    if ( j == 0){
                        namber = 1;
                        System.out.println("Win you namder is " + namber);

                    }else{
                        namber+=i;
                        System.out.println("Win you namder is " + namber);
                    }
                    break;
                }


//                System.out.println("i =" + i+ " j=" + j);
            }
            break;
        }
    }
}
