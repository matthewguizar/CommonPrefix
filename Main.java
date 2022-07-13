class Main{
    public static void main(String[] args){
        Main ob = new Main();
        String s[] = {"flower", "flow", "flight"};
        System.out.println(ob.longestCommonPrefix(s));

    }

    public String longestCommonPrefix(String[] s){
        String prefix = s[0];
        if (s.length == 0){
            return "";
        } else {
        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
     }
        return prefix;
    }
}