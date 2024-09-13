package com.example.demo.controller;

import com.example.demo.model.Rectangle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RectangleController {

    // Prywatna lista prostokątów
    private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

    // Metoda, która zwróci listę prostokątów
    @GetMapping("/rectangles")
    public ArrayList<Rectangle> rectangles() {
       return rectangles;
    }

    // Metoda, która zwróci prostokąt o padanym indeksie
    @GetMapping("/rectangles/{id}")
    public Rectangle rectangle(@PathVariable int id) {
        return rectangles.get(id);
    }

    // Metoda, która dodaje proctokąt
    @PostMapping("rectangles/add")
    public String addRectangle(@RequestBody Rectangle rectangle) {
        rectangles.add(rectangle);
        return "Rectangle added";
    }

    // Metoda, która wymienia prostokąt o indeksie na podany prostokąt
    @PutMapping("rectangles/modify/{id}")
    public String modifyRectangle(@PathVariable int id, @RequestBody Rectangle rectangle) {
        rectangles.set(id, rectangle);
        return "Rectangle " + id + " modified";
    }

    // Metoda, która usuwa prostokąt o podanym indeksie z listy
    @DeleteMapping("rectangles/delete/{id}")
    public String deleteRectangle(@PathVariable int id) {
        rectangles.remove(id);
        return "Rectangle " + id + " removed";
    }

    // Metoda, która wygeneruje napis zawierający kod SVG
    @GetMapping("/rectangles/svg")
    public String rectanglesSvg() {
        String svg = "";
        StringBuilder sb = new StringBuilder(svg);
        sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\">\n");
        for (Rectangle rectangle : rectangles) {
            sb.append("<rect width=\"")
                    .append(rectangle.getWidth())
                    .append("\" height=\"")
                    .append(rectangle.getHeight())
                    .append("\" x=\"")
                    .append(rectangle.getX())
                    .append("\" y=\"")
                    .append(rectangle.getY())
                    .append("\" fill=\"")
                    .append(rectangle.getColor())
                    .append("\" />\n");
        }
        sb.append("</svg>");
        svg = sb.toString();
        return svg;
    }
}
