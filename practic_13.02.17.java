//task2.java
class Message {

    private String message;

    public Message(String str){
        //System.out.println(str);
        super();
        this.message = message;
    }

    public int countWords(String str){
        String[] strings = str.split(" ");
        return strings.length;
    }        // возвращает количество слов

    public String reverse(String str){
        char[] strs = str.toCharArray();
        int beginer = 0;
        int len = strs.length-1;
        char temp;
        while(len!=0){
            temp = strs[beginer];
            strs[beginer]=strs[len];
            strs[len] = temp;
            len--;
            beginer++;
        }
        return strs.toString();
    }        // возвращает перевернутую строку

    public int count(char c, String str){
        char[] strs = str.toCharArray();
        int len = strs.length-1;
        int count=0;
        int i=0;
        if(strs.length!=0){
            while(len!=0){
                if (strs[i] == c){
                    count++;
                }
            }
        }
        else{
            return 0;
        }
        return count;
    }       // возвращает кол-во вхождений символа в строку



    public String Seria(int N){
        String seria = new String("Серия").toLowerCase();
        int seriaIndex = message.toLowerCase().indexOf(seria);
        if (seriaIndex < 0)
            return "";
        else
        {
            String res = new String();
            for (int i = seriaIndex + seria.length()+1; i < message.length(); i++)
            {
                if(message.charAt(i) == ' ')
                    break;
                res += message.charAt(i);
            }
            return res;
        }

    }       // возвращает серию (серия находится после слова «серия» между пробелами, но серии может и не быть, слово серия может различно написано, например Серия, сеРИя)

    public String nomer(String str, int num){
        String nomer = new String("Номер").toLowerCase();
        int seriaIndex = message.toLowerCase().indexOf(nomer);
        if(seriaIndex < 0)
            return "";
        else
        {
            String res = new String();
            for (int i = seriaIndex + nomer.length() +1; i < message.length(); i++)
            {
                if(message.charAt(i) == ' ')
                    break;
                res += message.charAt(i);
            }
            return res;
            // возвращает номер (номер находится после №, но после № может пробела и не быть)
        }
    }

}
