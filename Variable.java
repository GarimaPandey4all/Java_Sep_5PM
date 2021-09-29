class Variable {
    //ctrl + k + c = shortcut for comment
    // - Java doesn't have any garbage value
    // - it throws error
    // - Local Variables must be initialized before use
    // - otherwise compilation fails

    public static void main(String[] args) {
        //Local Variables
        // 100 , 200 Manual way of initialization/Assignment
        int firstNumber = 100; // variable declare / create
        int secondNumber = 200;
        int result;

        result = firstNumber + secondNumber;

        System.out.println("Sum is: "+result); // + : concatenation/joining
    }
}
