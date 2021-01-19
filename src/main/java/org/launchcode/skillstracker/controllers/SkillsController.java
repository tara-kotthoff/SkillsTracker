package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
                        "<h2>We have a few skills we need to learn! Here is the list:</h2>" +
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
                        "<form method='post'>" +
                        "<label for='name'>Name</label><br>" +
                        "<input type='text' name='name'><br>" +
                        "<label for=\"language-select\">My favorite language is:</label>" +
                        "<select name=\"languageOne\">" +
                        "    <option value=\"\">--Please choose an option--</option>" +
                        "    <option value=\"JavaScript\">JavaScript</option>" +
                        "    <option value=\"Java\">Java</option>" +
                        "    <option value=\"Python\">Python</option>" +
                        "</select><br>" +

                        "<label for=\"language-select\">My second favorite language is:</label>" +
                        "<select name=\"languageTwo\">" +
                        "    <option value=\"\">--Please choose an option--</option>" +
                        "    <option value=\"JavaScript\">JavaScript</option>" +
                        "    <option value=\"Java\">Java</option>" +
                        "    <option value=\"Python\">Python</option>" +
                        "</select><br>" +

                        "<label for=\"language-select\">My third favorite language is:</label>" +
                        "<select name=\"languageThree\">" +
                        "    <option value=\"\">--Please choose an option--</option>" +
                        "    <option value=\"JavaScript\">JavaScript</option>" +
                        "    <option value=\"Java\">Java</option>" +
                        "    <option value=\"Python\">Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<input type='submit' value='Submit'" +
                        "</form>" +
                    "</body>" +
                "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String submitForm(@RequestParam String name, @RequestParam String languageOne, @RequestParam String languageTwo,
                             @RequestParam String languageThree) {
        return "<html>" +
                    "<body>" +
                        "<h1>name</h1>" +
                            "<ol>" +
                                "<li>languageOne</li>" +
                                "<li>languageTwo</li>" +
                                "<li>languageThree</li>" +
                            "</ol>" +
                        "</body>" +
                "</html>";

    }
}
