package text_block;

public class UserInput {

    public static class TextInput {

        private String result = "";
        public void add(char c) {
            this.result += c;
        }

        public String getValue() {
            return this.result;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            if (Character.isDigit(c)) {
                super.add(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
