public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int count = Integer.parseInt(br.readLine());
        while(count-- > 0) {
            String bracket = br.readLine()+"\n";
            for (char element : bracket.toCharArray()) {
                if (element == '(') {
                    stack.push(element);
                } else if (element == ')'){
                    if (stack.isEmpty()) {
                        stack.push(element);           
                        break;
                    }
                    stack.pop();        
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                stack.clear();
            }           
        }
    }
}
