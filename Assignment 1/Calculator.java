class Calculator {
    int addition() {
        int[] num;
        UserInput in = new UserInput();

        num = in.userInputDouble();
        int sum = num[0] + num[1];

        return sum;
    }

    int subtraction() {
        int[] num;
        UserInput in = new UserInput();

        num = in.userInputDouble();
        int diff = num[0] - num[1];

        return diff;
    }

    int multiply() {
        int[] num;
        UserInput in = new UserInput();

        num = in.userInputDouble();
        int pro = num[0] * num[1];

        return pro;
    }

    double division() {
        int[] num;
        UserInput in = new UserInput();

        num = in.userInputDouble();
        if (num[1] == 0) {
            System.out.println("Can't divide by 0");
            return 0;
        }
        int quo = num[0] / num[1];
        return quo;
    }

    int[] fibonacci() {
        int num;
        UserInput in = new UserInput();

        System.out.println("Enter no. of items:");
        num = in.userInputSingle();

        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < num; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        
        return arr;
    }

    double mean() {
        UserInput in = new UserInput();
        int[] array = in.userInputArray();
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    double variance() {
        UserInput in = new UserInput();
        int[] array = in.userInputArray();
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double mean = (double) sum / array.length;
        double sumSquaredDiff = 0;
        for (int num : array) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return sumSquaredDiff / array.length;
    }
}