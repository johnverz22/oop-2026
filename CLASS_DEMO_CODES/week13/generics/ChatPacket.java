public class ChatPacket<T> {
    private String sender;
    private T payload;

    public ChatPacket(String sender, T payload){
        this.sender = sender;
        this.payload = payload;
    }

    public String serialize(){
        return sender + " | " + payload.toString();
    }

    public T getPayload(){
        return payload;
    }

    public String getSender(){
        return sender;
    }
}
