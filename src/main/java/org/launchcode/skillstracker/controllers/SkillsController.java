package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    //Handles requests at root path
    @GetMapping()
    @ResponseBody
    public String greeting() {
        String html =
                "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn! Here is the list:</h2>" +
                        "<ol>" +
                            "<li>JavaScript</li>" +
                            "<li>Java</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
        return html;

    }

    //Handles request of the form /skillstracker
    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        String html =
                "<html>" +
                    "<body>" +
                        "<label for=\"language-select\">My favorite language is:</label>" +
                        "<select name=\"language\" id=\"language-select\">" +
                        "    <option value=\"\">--Please choose an option--</option>" +
                        "    <option value=\"JavaScript\">JavaScript</option>" +
                        "    <option value=\"Java\">Java</option>" +
                        "    <option value=\"Python\">Python</option>" +
                        "</select>" +

                        "<label for=\"language-select\">My second favorite language is:</label>" +
                        "<select name=\"language\" id=\"language-select\">" +
                        "    <option value=\"\">--Please choose an option--</option>" +
                        "    <option value=\"JavaScript\">JavaScript</option>" +
                        "    <option value=\"Java\">Java</option>" +
                        "    <option value=\"Python\">Python</option>" +
                        "</select>" +

                        "<label for=\"language-select\">My third favorite language is:</label>" +
                        "<select name=\"language\" id=\"language-select\">" +
                        "    <option value=\"\">--Please choose an option--</option>" +
                        "    <option value=\"JavaScript\">JavaScript</option>" +
                        "    <option value=\"Java\">Java</option>" +
                        "    <option value=\"Python\">Python</option>" +
                        "</select>" +
                    "</body>" +
                "</html>";
        return html;
    }
}
