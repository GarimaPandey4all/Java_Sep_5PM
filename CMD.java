class CMD {
    public static void main(String[] args) {
        
        // String[] args - command line arguments
        // 1. Dynamic way of initialization
        if(args.length == 2) // args.length = length of the array
        {
        int fNum = Integer.parseInt(args[0]);
        int sNum = Integer.parseInt(args[1]);
        int result = fNum + sNum;
        System.out.println("Sum is: "+result);
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}