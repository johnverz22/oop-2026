
public class Main{

    public static void main(String[] args){
        ChatPacket<String> outgoing = new ChatPacket<String>("Alice", "Hello World");
        //--sender side
        String rawMessage = outgoing.serialize();
        System.out.println(rawMessage);

        ChatPacket<Boolean> outgoing2 = new ChatPacket<Boolean>("John", true);
        rawMessage = outgoing2.serialize();
        System.out.println(rawMessage);

        //--receiver
        ChatPacket<String> incoming = deserialize(rawMessage);
        System.out.println(incoming.getPayload());
    }

    public static ChatPacket<String> deserialize(String raw){
        String[] parts = raw.split("\\|");
        String sender = parts[0];
        String message = parts[1];
        return new ChatPacket<>(sender, message);
    }
}