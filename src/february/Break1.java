package february;

public class Break1 {
    public static void main(String[] args){
//        for(int i=1;i<=10;i++){
//            if(i==5){
//                //breaking the loop
//                continue;//skip the value
//            }
//            System.out.println(i);
//        }
        int i =1;
//        while (i<=6){
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
        do{
            if(i==5){
                //using break statement
                //i++;
                break;//it will break the loop
            }
            System.out.println(i);
           i++;
     }while (i<=10);

    }
}
