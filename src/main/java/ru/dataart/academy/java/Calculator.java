import figures.Figure;

import java.util.ArrayList;
import java.util.List;

class Calculator {
    List<Figure> figuresList = new ArrayList<>();

    public Calculator(List<Figure> figuresList) {
        this.figuresList = figuresList;
        figuresList.add(new Circle(3));
        figuresList.add(new Rectangle(3, 4));
        figuresList.add(new Circle(6));

    }

    public double sum(Figure[] figure) {
        double sum = 0;
        for (int i = 0; i < figuresList.size(); i++) {
            sum = sum + figuresList.get(i).area();
        }
        return sum;
    }
}