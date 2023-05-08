import java.util.ArrayList;

public class silde16 {

     public static void main(String[] args) {
          ArrayList<String> arrayListsString =new ArrayList<>();
          arrayListsString.add("JAVA");
          arrayListsString.add("PHP");
          arrayListsString.add("C#++");
          arrayListsString.add("C++");

     System.out.println("cac phan tu co trong arrayListsString la:");
     for (int i=0;i<arrayListsString.size();i++){
          System.out.print(arrayListsString.get(i)+"\t");
     }
}}
