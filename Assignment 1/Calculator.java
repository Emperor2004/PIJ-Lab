class Calculator {
    int addition() {
        int[] num;
        UserInput in = new UserInput();

        num = in.userInput();
        int sum = num[0] + num[1];

        return sum;
    }

    int subtraction() {
        int[] num;
        UserInput in = new UserInput();

        num = in.userInput();
        int diff = num[0] - num[1];

        return diff;
    }

    int multiply() {
        int[] num;
        UserInput in = new UserInput();

        num = in.userInput();
        int pro = num[0] * num[1];

        return pro;
    }
}