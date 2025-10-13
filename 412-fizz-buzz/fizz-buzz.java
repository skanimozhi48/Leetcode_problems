class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fi = new ArrayList<>();
        for(int i =1;i<=n;i++) {
            if(i% 3==0 && i%5 == 0){
                fi.add("FizzBuzz");
            } else if(i%3==0){
                fi.add("Fizz");
            } else if(i%5==0){
                fi.add("Buzz");
            } else
            fi.add(Integer.toString(i));
        }
        return fi;
    }
}