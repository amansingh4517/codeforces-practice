
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Pair{
    int idx ;
    int level ;
    Pair(int idx , int level){
        this.idx = idx;
        this.level = level;
    }
}

class CourseWishes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] wish = new int[k];
            ArrayList<Pair> course = new ArrayList<>();
            for(int i = 0 ; i < k ; i++){
                wish[i] = sc.nextInt();
            }
            int operation = 0;
            for(int i = 0 ; i < n ; i++){
                course.add(new Pair(i+1 , sc.nextInt())) ;
                if(course.get(i).level < k +1) operation += k+1 - course.get(i).level;
                
            }
            if(operation>1000){
                System.out.println(-1);
                continue;
            }
            Collections.sort(course);
            for(int i =  course.size() ; i >= 0 ; i--){
                while(course.get(i).level<k+1) {
                    System.out.print(course.get(i).idx+" ");
                    course.get(i).level += 1;
                }
            }
            System.out.println();
        
           
        }
        sc.close();
    }
}