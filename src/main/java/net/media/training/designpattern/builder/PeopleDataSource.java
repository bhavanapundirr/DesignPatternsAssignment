package net.media.training.designpattern.builder;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
        public static String getPeopleXml(List<Person> persons) {
            XMLBuilder xmlBuilder = new XMLBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            xmlBuilder.startTag("People").addAttribute("number", String.valueOf(persons.size()));

            for (Person person : persons) {
                xmlBuilder.startTag("Person").addAttribute("id", String.valueOf(person.getId()))
                        .addAttribute("name", person.getName());

                xmlBuilder.startTag("Address");
                xmlBuilder.startTag("City").addText(person.getCity()).endTag();
                xmlBuilder.startTag("Country").addText(person.getCountry()).endTag();
                xmlBuilder.endTag();

                xmlBuilder.endTag();
            }

            xmlBuilder.endTag();
            return xmlBuilder.toString();
        }
}