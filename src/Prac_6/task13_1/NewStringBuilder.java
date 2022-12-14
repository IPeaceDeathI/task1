package Prac_6.task13_1;

import java.util.Stack;

class NewStringBuilder {

    private interface Action{
        void undo();
    }

    private class DeleteAction implements Action{
        private int size;

        public DeleteAction(int size) {
            this.size = size;
        }

        public void undo(){
            stringBuilder.delete(
                    stringBuilder.length() - size, stringBuilder.length());
        }
    }

    private StringBuilder stringBuilder; // делегат
    private Stack actions = new Stack<>();

    public NewStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public NewStringBuilder reverse() {
        stringBuilder.reverse();

        Action action = new Action(){
            public void undo() {
                stringBuilder.reverse();
            }
        };

        actions.add(action);

        return this;
    }


    public NewStringBuilder append(String str) {
        stringBuilder.append(str);

        Action action = new Action(){
            public void undo() {
                stringBuilder.delete(
                        stringBuilder.length() - str.length() -1,
                        stringBuilder.length());
            }
        };

        actions.add(action);
        return this;
    }

    public void undo(){
        if(!actions.isEmpty()){
            actions.pop();
            reverse();
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
