public class BasicOperations {
    public static class Addition implements Operation {
        public int execute(int a, int b){
            return a + b;
        }
    }

    public static class Substract implements Operation {
        public int execute(int a, int b){
            return a - b;
        }
    }

    public static class Multiplication implements Operation {
        public int execute(int a, int b){
            return a * b;
        }
    }

    public static class Division implements Operation {
        public int execute(int a, int b){
            return a / b;
        }
    }
}
