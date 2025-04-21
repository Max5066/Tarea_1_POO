import java.util.ArrayList;

public class Topic {
   protected Topic(){ // to ban calls to this constructor 

   }
   public Topic(String topicName) {
//....
   }
   public void subscribe(Subscriber sub){
      //...
   }
   public void notify(String message) {
   //...
   }
   public boolean hasThisName(String name) {
      return topicName.equals(name);
   }
   private String topicName;
   private ArrayList<Subscriber> subscribers;
} 