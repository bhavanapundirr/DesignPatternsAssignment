package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:28:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GREEval implements Criteria {
    public boolean evaluate(Application theApp) {
        System.out.println("GREEval called");
        return theApp.getGre() > 1450;
    }
}
