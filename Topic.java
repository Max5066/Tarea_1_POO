import java.util.ArrayList;

public class Topic {
    protected Topic() { // to ban calls to this constructor
        subscribers = new ArrayList<Subscriber>();
    }

    public Topic(String topicName) {
        this.topicName = topicName;
        subscribers = new ArrayList<Subscriber>();
    }

    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
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