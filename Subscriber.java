public abstract class Subscriber extends Component {
   protected Subscriber() {}  // to ban calls to this constructor.
   public Subscriber(String name, String topicName) {
//...
   }
   public abstract void update(String message);
}