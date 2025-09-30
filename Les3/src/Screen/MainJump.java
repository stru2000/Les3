package Screen;

public class MainJump  {

    public static void main(String[] args) {

        int x = 4;
        for(int i=1;;i++){

            if(i % x !=0){
                continue;
            }
            if(i % 25 ==0){
                System.out.println("getal deelbaar door 25: "+i);
                break;
            }
            System.out.println("niet deelbaar door 25: "+i);
        }


    }
}
