package coursework.lib;


public class Answer {
    private boolean correct;
    private String answer;

    public Answer(boolean correct, String answer){
        this.correct = correct;
        this.answer = answer;
    }

    public boolean getCorrect() {
        return correct;
    }

    public String getAnswer(){
        return answer;
    }
}
