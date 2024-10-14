class Solution {
    public String reverseWords(String s) {
         String[] trimmedString=s.trim().split("\\s+");//Split with that Regex is used to split the String to array wherever ther is a space

         String result="";

         for(int i=trimmedString.length-1;i>0;i--){
            result+=trimmedString[i] + " ";
         }
         return result + trimmedString[0] ;
         
    }
}

//ex: s="Hello World "
//trimmedString=["Hello", "World"]
//result="World Hello"
