class CMD2 {
    public static void main(String[] args) {
        
        int sum = 0;
        //Enhanced for loop
        // only use when you want to read array
        for(String i : args)
        {
            sum += Integer.parseInt(i); // sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum is: "+sum);
    }
}