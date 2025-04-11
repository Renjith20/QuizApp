import java.util.Scanner;

public class QuestionService {

    Question [] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1 , "What is the extension of java code files?" , ".js" , ".txt" , ".class" , ".java" ,".java");
        questions[1] = new Question(2 , "Which component is used to compile, debug and execute the java programs?" , "JRE" , "JIT" , "JDK" , "JVM" ,"JDK");
        questions[2] = new Question(3 , "Number of primitive data types in Java are?" , "6" , "7" , "8" , "9" ,"8");
        questions[3] = new Question(4 , "What is the size of float and double in java?" , "32 and 64" , "32 and 32" , "64 and 64" , "64 and 32" ,"32 and 64");
        questions[4] = new Question(5 , "Arrays in java are -" , "object reference" , "objects" , "primitive datatype" , "none" ,"objects");

    }

    public void PlayQuiz()
    {
        int i = 0;
        for (Question q : questions){
        System.out.print(q.getId() + ". " );
        System.out.println(q.getQuestion());
        System.out.print("A. "+ q.getOpt1()+ "   ");
        System.out.println("B. " + q.getOpt2());
        System.out.print("C. " + q.getOpt3()+ "  ");
        System.out.println("D. " + q.getOpt4());
        Scanner sc = new Scanner(System.in);
        selection[i] = sc.nextLine();
        i++;
        }

        for(String s : selection){
            System.out.println(s);
        }
    }

}
