package Prac_10;

import java.util.Collections;

public class test {
    public static void main(String[] args){
        Student[] st = {new Student("IIT",2, 1,"Anton","Brezhnev", 5),
                new Student("IIT",2, 2,"Marina","Lipova", 2),
                new Student("IIT",1, 3,"Kirill","Kykyev", 1),
                new Student("IIT",3, 4,"Anna","Penkina", 4),
                new Student("IIT",3, 5,"Alina", "Lybina",3)};

        for(int i = 0; i< st.length; i++){
            int j = i-1;
            Student key = st[i];
            while((j>=0)  && (st[j].compareTo(key)>0) ){
                st[j+1]=st[j];
                j--;
            }
            st[j+1]=key;
        }
        for(int i=0; i< st.length; ++i){
            System.out.println(st[i].toString());
        }
    }
}
