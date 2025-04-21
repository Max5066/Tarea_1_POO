import java.util.ArrayList;

public class Broker {
   public Broker() {
      topics = new ArrayList<Topic>();
   }
   public Topic createTopic (String topicName){
     //...
      return topic;
   }
   public boolean subscribe (Subscriber sub){
      // .....
      if ((topic=findTopic(topicName))!=null) {
         topic.subscribe(sub);
         return true;
      } else 
         return false; // topic does not exist.
   }
   private Topic findTopic (String topicName) {
      //....
      return null;  // topic not found
   }
   private ArrayList<Topic> topics;
}