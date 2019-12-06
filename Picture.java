package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Picture {
    private List<Figure> list = new ArrayList<>();
    private Map<String, Integer> map = new HashMap<>();
    public void addToList(Figure figure) {

        list.add(figure);
    }
    public double sumOfPerimeters () {
         double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i).perimeter();
            }
            return sum;
        }

        public double sumOfAreas() {
            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i).area();
            }
            return sum;
        }

    public List<String> namesOfFigures() {
        List<String> figures = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            figures.add(list.get(i).getName());
        }
        return figures;
    }

        public Map<String, Integer> countOfFigures() {
         for (int i = 0; i < list.size(); i++) {
             map.put (list.get(i).getName(), i);
                Integer count = 0;
                for (int j = 0; j < list.size(); j++) {
                    map.put (list.get(j).getName(), j);
                    if (list.get(j).getName().equals(list.get(i).getName())) {
                        count += 1;
                    }
                }
                map.put(list.get(i).getName(), count);
            }
            return map;
        }
    }

