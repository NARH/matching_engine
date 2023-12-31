/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package matching_engine.app;

import matching_engine.list.LinkedList;

import static matching_engine.utilities.StringUtils.join;
import static matching_engine.utilities.StringUtils.split;
import static matching_engine.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
