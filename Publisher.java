public class Publisher extends Component {
   protected Publisher() {} // to ban calls to this constructor
   public Publisher(String name, Broker broker, String topicName) {
//..
   }
   protected void publishNewEvent(String message) {
//..
   }
   private Topic topic; 
}