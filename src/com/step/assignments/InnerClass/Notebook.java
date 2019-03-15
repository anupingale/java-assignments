package com.step.assignments.InnerClass;

public class Notebook {
    private static String company;

    public Notebook(String company) {
        this.company = company;
    }

    public class Lines {
        private int numberOfLines;

        public Lines(int numberOfLines) {
            this.numberOfLines = numberOfLines;
        }

        public void addLines(int lineCount) {
            this.numberOfLines += lineCount;
        }

        public String giveLines() {
            return company + " has " + this.numberOfLines + " lines.";
        }
    }
}
