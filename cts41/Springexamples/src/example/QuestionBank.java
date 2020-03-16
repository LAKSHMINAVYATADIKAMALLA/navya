package example;

import java.util.Iterator;
import java.util.List;

public class QuestionBank
{
int qid;
String question;
List<String> answers;
public QuestionBank(int qid, String question, List<String> answers)
{
super();
this.qid = qid;
this.question = question;
this.answers = answers;
}
public int getQid() {
return qid;
}
public void setQid(int qid) {
this.qid = qid;
}
public String getQyestion() {
return question;
}
public void setQyestion(String qyestion) {
this.question = qyestion;
}
public List<String> getAnswers() {
return answers;
}
public void setAnswers(List<String> answers) {
this.answers = answers;
}
public void showAnswers()
{
System.out.println("QId: "+qid+"Question :"+question);
Iterator<String> itr=answers.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}