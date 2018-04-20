package coursework.rest;

import coursework.game.Game;
import coursework.lib.Question;
import coursework.lib.Answer;
import coursework.lib.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

    @Autowired
    private Game game;

    @RequestMapping(path="/getQuestion", method=RequestMethod.POST)
    public Question getQuestion(@RequestParam(value="num") int num) {
        return game.getQuestion(num);
    }

    @RequestMapping(path="/answerQuestion", method=RequestMethod.POST)
    public Answer answerQuestion(@RequestParam(value="num") int num, @RequestParam(value="ans") int ans) {
        boolean userAnswer = (game.getQuestion(num).answer(ans));
        game.getQuestion(num).setCorrect(userAnswer);
        return new Answer(userAnswer, game.getQuestion(num).getCorrectCity());
    }

    @RequestMapping(path="/getScore", method=RequestMethod.GET)
    public Score getScore() {
        return new Score(game.getQuestionLib().getScore());
    }

}
