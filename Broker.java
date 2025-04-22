import java.util.ArrayList;

public class Broker {
    public Broker() {
        topics = new ArrayList<Topic>();
    }

    public Topic createTopic(String topicName) {
        topic = new Topic(topicName);
        topics.add(topic);
        return topic;
    }

    public boolean subscribe(Subscriber sub) {

        if ((topic = findTopic(sub.getTopicName())) != null) {
            topic.subscribe(sub);
            return true;
        } else
            return false; // topic does not exist.
    }

    public Topic findTopic(String topicName) {
        for (Topic topic : topics) {
            if (topic.hasThisName(topicName)) {
                return topic;
            }
        }
        return null; // no se encontró el topic
    }
    public Topic topic;
    private ArrayList<Topic> topics;
}