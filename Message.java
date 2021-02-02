/*
   * This program displays a frame for a given message
   * @version 1.0  2020-02-01
   * @author Ch3ke
*/

public class Message {
    private int lenMessage;
    private int widhtMessage;
    List<String> message;

    Message(String text){
        message = new ArrayList<String>();
        message.add(text);


    }


    public static void main(String[] args) {
        Message message = new Message("Test");

    }



}