class Grade {
    public static void main(String[] args) {

        int sum = 0;

        for(String i : args)
        {
            sum += Integer.parseInt(i); 
        }
        System.out.println("Sum is: "+sum);

        float percentage = sum / args.length;

        System.out.println("Percentage is:"+percentage);

        if(percentage >= 50 && percentage <= 60)
        {
            System.out.println("Grade D");
        }
        else if(percentage >= 60 && percentage <= 70)
        {
            System.out.println("Grade C");
        }
        else if(percentage >= 70 && percentage <= 80)
        {
            System.out.println("Grade B");
        }
        else if(percentage >= 80 && percentage <= 100)
        {
            System.out.println("Grade A");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}