package example;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QBMap {

int qid;
String question;
Map<String,String> answers;

public QBMap(int qid, String question, Map answers) {
super();
this.qid = qid;
this.question = question;
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
public Map<String,String> getAnswers() {
return answers;
}
public void setAnswers(Map<String,String> answers) {
this.answers = answers;
}
public void showAnswers()
{
System.out.println("Qid:"+qid+" ouestion:"+question);
System.out.println("the question is answered by following");
Set<Entry<String, String>> keys=answers.entrySet();
Iterator itr=keys.iterator();
while(itr.hasNext())
{
Map.Entry e=(Map.Entry)itr.next();
System.out.println(e.getKey()+""+e.getValue());
}

}
}