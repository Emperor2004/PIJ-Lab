class MuteQuack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Silent duck!");
    }
}