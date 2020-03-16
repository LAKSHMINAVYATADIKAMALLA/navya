package pro4;
import java.util.Map;

public class Mapp 
{
	int qid;
    String question;
    Map<String,String> answers;
    public Mapp(int qid,String question,Map<String,String>answers) {
           this.qid=qid;
           this.question=question;
           this.answers=answers;
    }
    public int getQid() {
           return qid;
    }
    public void setQid(int qid) {
           this.qid = qid;
    }
    public String getQuestion() {
           return question;
    }
    public void setQuestion(String question) {
           this.question = question;
    }
    public Map<String, String> getAnswers() {
           return answers;
    }
    public void setAnswers(Map<String, String> answers) {
           this.answers = answers;
    }
    public void showAnswers() {
           System.out.println(qid+question);
           for (Map.Entry<String,String> entry : answers.entrySet()) 
         System.out.println(entry.getKey() + entry.getValue());
	    }
}



