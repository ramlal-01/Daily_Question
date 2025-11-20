// Last updated: 20/11/2025, 3:45:03 pm
class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();

        Set<Character> vowels = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));

        for( int i = 0 ;i<s.length() ; i++){
            if( vowels.contains(s.charAt(i)) ){
                list.add( s.charAt(i) );
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        int k = 0 ;
        for( char c : s.toCharArray() ){
            if( vowels.contains(c) ){
                sb.append(list.get(k++));
            }
            else sb.append(c);
        }

        return sb.toString();
    }
}