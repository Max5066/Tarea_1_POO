public class Publisher extends Component {
    protected Publisher() {
    } // to ban calls to this constructor

    public Publisher(String name, Broker broker, String topicName) {
        super(name, topicName);
        this.broker = broker;
    }

    protected void publishNewEvent(String message) {
        topic = this.broker.findTopic(topicName);
        if (topic == null) {
            topic = broker.createTopic(topicName);
        }
        topic.notify(message);
    }

    private Broker broker;
    private Topic topic;
}