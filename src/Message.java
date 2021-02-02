import java.util.ArrayList;

public class Message {
    private ArrayList<String> message;
    public Message(String txt){
        message = new ArrayList<String>();
        message.add(txt);
    }
    public int determineLongestMsg(){
        ArrayList<String> m = message;
        int r = 0;
        if(m != null && !m.isEmpty()){
            for(String i : m){
                if (i.length() > r)
                r = i.length();
            }
        if (!(r % 2 == 0))
            r++;
        }
        return r;
    }
    public int determineWidthMsg(){
        ArrayList<String> m = message;
        int r = 0;
        if(m != null && !m.isEmpty()){
            return message.size();
        }
        return r;
    }
    public void addMsg(String txt)
    {
        this.message.add(txt);
    }

   
    //█ ▌ ▍ ▋ ▄ ▌ ▐
    // https://unicode-table.com/en/

    public void frame(){
        int len = determineLongestMsg() + 2;
        int limit = 0;      

        String luc, lb, rb, hb, ruc, ldc, rdc, sp, ht;
        ht = "▀"; //header body 
        hb = "▄";
        lb = "▌"; // body
        rb = "▐";
        luc = "▛"; // left upper corner
        ruc = "▜"; // right upper corner
        ldc = "▙"; // left bottom corner
        rdc = "▟"; // right bottom corner
        sp = " "; // simple space
        //draw top
        System.out.print(luc);
        for(int i= 0; i < len; i++)
            System.out.print(ht);
        System.out.print(ruc);
        System.out.println("");

        //draw n bodies
        for(String i : message){
            System.out.print(lb);
            limit = (len - i.length())/2;
            for(int s = 0; s < limit; s++)
            {
                System.out.print(sp);
            }    
            System.out.print(i);
            if (i.length()%2 != 0)
                limit++;
            for(int s = 0; s < limit; s++)
            {
                System.out.print(sp);
            }    
            System.out.println(rb);
        }

        //draw bottom
        System.out.print(ldc);
        for(int i= 0; i < len; i++)
            System.out.print(hb);
        System.out.println(rdc);

    }
    @Override
    public String toString() {
        String t ="";
        for(String s : message)
        {
            t += s + "\n";
        }
        return t;
        
    }

    public static void main(String[] args){
        Message msg = new Message("Test");
        msg.addMsg("Test1");
        
        System.out.println(msg.toString());
        msg.frame();    
    }

    
}