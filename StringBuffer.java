// StringBuffer : synchronized : mutable { size fix : default initial capacity is 16 : New capacity = (current capacity+1)*2 }
// StringBuilder : non Synchronized : mutable  {   size fix : default initial capacity is 16 : New capacity = (current capacity+1)*2  }
// String : immptable { size not fix }


class StringBuffer{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
    }
}
